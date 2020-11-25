package com.qa.ims.controllers;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.OrderItemsController;
import com.qa.ims.persistence.dao.OrderItemsDAO;
import com.qa.ims.persistence.domain.OrderItems;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)
public class OrderItemControllerTest {

	@Mock
	private Utils utils;

	@Mock
	private OrderItemsDAO dao;

	@InjectMocks
	private OrderItemsController controller;

	@Test
	public void testCreate() {
		final Long customer_id = (long) 1, order_id =(long) 1;
		final OrderItems created = new OrderItems(order_id, customer_id, order_id, order_id);

		Mockito.when(utils.getLong()).thenReturn(order_id);
		Mockito.when(dao.create(created)).thenReturn(created);

		assertEquals(created, controller.create());

		Mockito.verify(utils, Mockito.times(2)).getString();
		Mockito.verify(dao, Mockito.times(1)).create(created);
	}

	@Test
	public void testReadAll() {
		List<OrderItems> orders = new ArrayList<>();
		orders.add(new OrderItems((long)1, (long)1, null, 0));

		Mockito.when(dao.readAll()).thenReturn(orders);

		assertEquals(orders, controller.readAll());

		Mockito.verify(dao, Mockito.times(1)).readAll();
	}

	@Test
	public void testUpdate() {
		OrderItems updated = new OrderItems((long)2,(long)2, null, 0);

		Mockito.when(this.utils.getLong()).thenReturn((long) 1,(long)1);
		Mockito.when(this.utils.getLong()).thenReturn(updated.getOrderId(),updated.getItemId());
		Mockito.when(this.dao.update(updated)).thenReturn(updated);

		assertEquals(updated, this.controller.update());

		Mockito.verify(this.utils, Mockito.times(1)).getLong();
		Mockito.verify(this.utils, Mockito.times(2)).getString();
		Mockito.verify(this.dao, Mockito.times(1)).update(updated);
	}

	@Test
	public void testDelete() {
		final long order_id = 1;

		Mockito.when(utils.getLong()).thenReturn(order_id);
		Mockito.when(dao.delete(order_id, order_id)).thenReturn(1);

		assertEquals(1L, this.controller.delete());

		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(dao, Mockito.times(1)).delete(order_id, order_id);
	}

}
