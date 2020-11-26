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
		final OrderItems created = new OrderItems((long)3, (long)4, (long)1);

		Mockito.when(utils.getOrderId()).thenReturn((long)3);
		Mockito.when(utils.getItemId()).thenReturn((long)1);
		Mockito.when(utils.getQuantity()).thenReturn((long)1);
		Mockito.when(utils.getItemPrice()).thenReturn((float)74.99);
		Mockito.when(dao.create(created)).thenReturn(created);

		assertEquals(created, controller.create());

		Mockito.verify(utils, Mockito.times(2)).getString();
		Mockito.verify(dao, Mockito.times(1)).create(created);
	}

	@Test
	public void testReadAll() {
		List<OrderItems> orders = new ArrayList<>();
		orders.add(new OrderItems((long)1, (long)1, (long)3));
		orders.add(new OrderItems((long)2, (long)2, (long)2));
		Mockito.when(dao.readAll()).thenReturn(orders);

		assertEquals(orders, controller.readAll());

		Mockito.verify(dao, Mockito.times(1)).readAll();
	}

	@Test
	public void testUpdate() {
		OrderItems updated = new OrderItems((long)2,(long)2, null);

		Mockito.when(this.utils.getOrderId()).thenReturn((long) 1,(long)1);
		Mockito.when(this.utils.getItemId()).thenReturn(updated.getItemId());
		Mockito.when(this.utils.getItemId()).thenReturn(updated.getOrderId(),updated.getItemId());
		Mockito.when(this.dao.update(updated)).thenReturn(updated);

		assertEquals(updated, this.controller.update());

		Mockito.verify(this.utils, Mockito.times(1)).getOrderId();
		Mockito.verify(this.utils, Mockito.times(2)).getItemId();
		Mockito.verify(this.dao, Mockito.times(1)).update(updated);
	}

	@Test
	public void testDelete() {
		final long order_id = 1;

		Mockito.when(utils.getLong()).thenReturn(order_id);
		Mockito.when(dao.delete(order_id, order_id)).thenReturn(1);

		assertEquals(1, this.controller.delete());

		Mockito.verify(utils, Mockito.times(1)).getItemId();
		Mockito.verify(dao, Mockito.times(1)).delete(order_id, order_id);
	}

}
