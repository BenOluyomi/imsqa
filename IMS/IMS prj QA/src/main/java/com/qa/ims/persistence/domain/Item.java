package com.qa.ims.persistence.domain;

public class Item {

	private Long item_id;
	private String product_name;
	private float item_price;

	public Item(String product_name, float item_price) {
		this.product_name = product_name;
		this.item_price = item_price;
	}

	public Item(Long item_id, String product_name, float item_price) {
		this.item_id = item_id;
		this.product_name = product_name;
		this.item_price = item_price;
	}

	public Long getItemId() {
		return item_id;
	}

	public void setId(Long id) {
		this.item_id = id;
	}

	public String getProductName() {
		return product_name;
	}

	public void setFirstName(String product_name) {
		this.product_name = product_name;
	}

	public float getPrice() {
		return this.item_price = item_price;
	}

	public void setPrice(float item_price) {
		this.item_price = item_price;
	}

	@Override
	public String toString() {
		return "id:" + item_id + " product name:" + product_name + " item_price:" + item_price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (product_name == null) {
			if (other.product_name!= null)
				return false;
		} else if (!product_name.equals(other.product_name))
			return false;
		if (item_id == null) {
			if (other.item_id != null)
				return false;
		} else if (!item_id.equals(other.item_id))
			return false;
		if (item_price == 0) {
			if (other.item_price != 0)
				return false;
		} else if (!(item_price ==other.item_price))
			return false;
		return true;
	}

}