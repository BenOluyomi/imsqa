package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.ims.persistence.domain.Order;
import com.qa.ims.utils.DBUtils;

public class OrderDAOTest {

	private final OrderDAO orDAO = new OrderDAO();

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
		
		final Order created = new Order((long) 2,(long)2);
		assertEquals(created, orDAO.create(created));
	}

	@Test
	public void testReadAll() {
		List<Order> expected = new ArrayList<>();
		expected.add(new Order((long) 1, (long) 1));
		assertEquals(expected, orDAO.readAll());
	}

	@Test
	public void testReadLatest() {
		//assertEquals(new Order((long) 3, (long)3, orDAO.readLatest());
	}

	@Test
	public void testRead() {
		final long ID = 1;
		assertEquals(new Order(ID, (long) 1), orDAO.readOrder(ID));
	}

	@Test
	public void testUpdate() {
		final Order updated = new Order((long) 1, (long) 1);
		assertEquals(updated, orDAO.update(updated));

	}

	@Test
	public void testDelete() {
		assertEquals(1,1, orDAO.delete(1, 1));
	}
}
