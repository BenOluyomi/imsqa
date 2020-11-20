package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.OrderItemsDAO;
import com.qa.ims.persistence.domain.OrderItems;
import com.qa.ims.utils.Utils;

/**
 * Takes in customer details for CRUD functionality
 *
 */
public class OrderItemsController implements CrudController<OrderItems> {

	public static final Logger LOGGER = LogManager.getLogger();

	private OrderItemsDAO orderItDAO;
	private Utils utils;

	public OrderItemsController(OrderItemsDAO orderItDAO, Utils utils) {
		super();
		this.orderItDAO = orderItDAO;
		this.utils = utils;
	}

	/**
	 * Reads all customers to the logger
	 */
	@Override
	public List<OrderItems> readAll() {
		List<OrderItems> orderItems = orderItDAO.readAll();
		for (OrderItems orderItem : orderItems) {
			LOGGER.info(orderItem.toString());
		}
		return orderItems;
	}

	/**
	 * Creates a customer by taking in user input
	 */
	@Override
	public OrderItems create() {
		LOGGER.info("Please enter an order id");
		Long order_id = utils.getOrderId();
		LOGGER.info("Please enter a item id");
		Long item_id = utils.getfId();
		LOGGER.info("Please enter a quantity");
		Long quantity = utils.getQuantity();
		OrderItems orderItems = orderItDAO.create(new OrderItems(order_id, item_id,quantity));
		LOGGER.info("Order created");
		return orderItems;
	}

	/**
	 * Updates an existing customer by taking in user input
	 */



	/**
	 * Deletes an existing customer by the id of the customer
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the order you would like to delete");
		Long order_id = utils.getOrderId();
		
		
		LOGGER.info("Please enter the id of the item you would like to delete");
		Long item_id = utils.getItemId();
		
		return orderItDAO.delete(order_id,item_id);
		
		
		
	}

	@Override
	public OrderItems update() {
		// TODO Auto-generated method stub
		return null;
	}

}
