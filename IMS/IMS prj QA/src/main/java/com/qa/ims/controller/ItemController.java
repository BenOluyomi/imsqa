package com.qa.ims.controller;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

/**
 * Takes in customer details for CRUD functionality
 *
 */
public class ItemController implements CrudController<Item> {

	public static final Logger LOGGER = LogManager.getLogger();

	private ItemDAO itemDAO;
	private Utils utils;

	public ItemController(ItemDAO itemDAO, Utils utils) {
		super();
		this.itemDAO = itemDAO;
		this.utils = utils;
	}

	/**
	 * Reads all customers to the logger
	 */
	@Override
	public List<Item> readAll() {
		List<Item> items = itemDAO.readAll();
		for (Item item : items) {
			LOGGER.info(item.toString());
		}
		return items;
	}

	/**
	 * Creates a customer by taking in user input
	 */
	@Override
	public Item create() {
		LOGGER.info("Please enter a product name");
		String product_name = utils.getProductName();
		LOGGER.info("Please enter a price");
		float item_price = utils.getItemPrice();
		Item item = itemDAO.create(new Item(product_name, item_price));
		LOGGER.info("Item created");
		return item;
	}

	/**
	 * Updates an existing customer by taking in user input
	 */
	@Override
	public Item update() {
		LOGGER.info("Please enter the id of the item you would like to update");
		Long item_id = utils.getItemId();
		LOGGER.info("Please enter a product name");
		String product_name = utils.getProductName();
		LOGGER.info("Please enter a price");
		float item_price = utils.getItemPrice();
		Item item = itemDAO.update(new Item(item_id, product_name, item_price));
		LOGGER.info("Item Updated");
		return item;
	}

	/**
	 * Deletes an existing customer by the id of the customer
	 * 
	 * @return
	 */
	@Override
	public int delete() {
		LOGGER.info("Please enter the id of the item you would like to delete");
		Long item_id = utils.getItemId();
		//Long order_id = utils.getOrderId();
		return itemDAO.delete(item_id,item_id);
	}

}
