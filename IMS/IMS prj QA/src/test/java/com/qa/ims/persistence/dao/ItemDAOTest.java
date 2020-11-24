package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.DBUtils;

public class ItemDAOTest {

	private final ItemDAO itDAO = new ItemDAO();

	@BeforeClass
	public static void init() {
		DBUtils.connect("root", "root");
	}

	@Before
	public void setup() {
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}

	@Test
	public void testCreate() {
		final Item created = new Item(2L, "microphone", (float) 89.99);
		assertEquals(created, itDAO.create(created));
	}

	@Test
	public void testReadAll() {
		List<Item> expected = new ArrayList<>();
		expected.add(new Item(1L, "guitar", (float) 74.99));
		assertEquals(expected, itDAO.readAll());
	}

	@Test
	public void testReadLatest() {
		assertEquals(new Item(2L, "microphone", (float) 89.99), itDAO.readLatest());
	}

	@Test
	public void testRead() {
		final long ID = 1L;
		assertEquals(new Item(ID, "guitar", (float) 74.99), itDAO.readItem(ID));
	}

	@Test
	public void testUpdate() {
		final Item updated = new Item(1L, "Jeremy", (float) 8.99);
		assertEquals(updated, itDAO.update(updated));

	}

	@Test
	public void testDelete() {
		assertEquals(1, itDAO.delete(1, 1));
	}
}
