package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.ims.persistence.domain.Customer;
import com.qa.ims.utils.DBUtils;

public class CustomerDAOTest {

	private final CustomerDAO custDAO = new CustomerDAO();

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
		final Customer created = new Customer((long)3,"adam", "one");
		assertEquals(created, custDAO.create(created));
	}

	@Test
	public void testReadAll() {
		List<Customer> expected = new ArrayList<>();
		expected.add(new Customer((long)1,"jordan", "harrison"));
		expected.add(new Customer((long)2,"david", "stone"));
		assertEquals(expected, custDAO.readAll());
	}

	@Test
	public void testReadLatest() {
		assertEquals(new Customer((long)3,"adam", "one"), custDAO.readLatest());
	}

	@Test
	public void testRead() {
		final long ID = 1;
		assertEquals(new Customer(ID, "jordan", "harrison"), custDAO.readCustomer(ID));
	}

	@Test
	public void testUpdate() {
		final long ID = 1;
		final Customer updated = new Customer(ID,"Jeremy", "Lee");
		assertEquals(updated, custDAO.update(updated));

	}

	@Test
	public void testDelete() {
		assertEquals((long)1, custDAO.delete((long)1,(long) 1));
	}
}
