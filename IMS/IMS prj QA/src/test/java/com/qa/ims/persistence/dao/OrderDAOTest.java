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
		Long newid = (long) 3;
		Long norid = (long) 3;
		final Order created = new Order(newid,norid);
		assertEquals(created, orDAO.create(created));
	}

	@Test
	public void testReadAll() {
		List<Order> expected = new ArrayList<>();
		Long newida = (long) 1;
		Long norida = (long) 1;
		expected.add(new Order(newida, norida));
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
		assertEquals(new Order(ID, (long) 3), orDAO.readOrder(ID));
	}

	@Test
	public void testUpdate() {
		final Order updated = new Order((long) 2, (long) 4);
		assertEquals(updated, orDAO.update(updated));

	}

	@Test
	public void testDelete() {
		assertEquals(1, orDAO.delete(1, 1));
	}
}
