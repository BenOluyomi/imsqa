package com.qa.ims.persistence.dao;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.qa.ims.utils.DBUtils;

public class OrderItemDAOTestFail {

	private final CustomerDAO custDAO = new CustomerDAO();

	@BeforeClass
	public static void init() {
		DBUtils.connect("root", "fail");
	}
	
	@Before
	public void setup() {
		DBUtils.getInstance().init("src/test/resources/sql-schema.sql", "src/test/resources/sql-data.sql");
	}
	
	@Test 
	public void testReadAll() {
		assertEquals(new ArrayList<>(), custDAO.readAll());
	}
	
}