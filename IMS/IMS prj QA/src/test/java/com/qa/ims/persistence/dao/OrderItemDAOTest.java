package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.ims.persistence.domain.OrderItems;
import com.qa.ims.utils.DBUtils;

public class OrderItemDAOTest {

	private final OrderItemsDAO orDAO = new OrderItemsDAO();

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
		Long newid = (long) 3;
		Long norid = (long) 1;
		final OrderItems created = new OrderItems(newid,norid, norid, (float) 224.97);
		assertEquals(created, orDAO.create(created));
	}

	@Test
	public void testReadAll() {
		List<OrderItems> expected = new ArrayList<>();
		Long newida = (long) 1;
		Long norida = (long) 1;
		expected.add(new OrderItems(newida, norida, (long) 3, (float) 224.97));
		expected.add(new OrderItems((long)2, (long)2, (long) 2, (float) 179.98));
		assertEquals(expected, orDAO.readAll());
	}

	//@Test
	//public void testReadLatest() {
	//	Long newido = (long) 3;
	//	Long norido = (long) 3;
	//	assertEquals(new Order(newido, norido, orDAO.readLatest());
	//}

	@Test
	public void testRead() {
		final long ID = 1;
		assertEquals(new OrderItems(ID, (long) 1, ID, ID), orDAO.readOrder(ID));
	}

	@Test
	public void testUpdate() {
		final OrderItems updated = new OrderItems((long) 2, (long) 2, (long) 2,(float)179.98);
		assertEquals(updated, orDAO.update(updated));

	}

	@Test
	public void testDelete() {
		assertEquals(1, orDAO.delete(1, 1));
	}
}
