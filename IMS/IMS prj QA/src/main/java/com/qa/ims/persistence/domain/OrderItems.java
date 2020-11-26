package com.qa.ims.persistence.domain;
import com.qa.ims.persistence.domain.Customer;
public class OrderItems{

	private Long order_id;
	private Long item_id;
	private Long quantity;
	private float total_cost;

	public OrderItems(Long order_id, Long item_id, Long quantity) {
		this.order_id = order_id;
		this.item_id = item_id;
		this.quantity = quantity;
		//this.total_cost = total_cost;
		
	}


	public Long getOrderId() {
		return order_id;
	}
	public Long getItemId() {
		return item_id;
	}
	public Long getQuantity() {
		return quantity;
	}
	public float getTotalCost() {
		return total_cost;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "order_id:" + order_id + " item_id:" + item_id + " quantity:" + quantity+ " total_cost:" + total_cost; 
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItems other = (OrderItems) obj;
		if (order_id == null) {
			if (other.order_id!= null)
				return false;
		} else if (!order_id.equals(other.order_id))
			return false;
		if (item_id == null) {
			if (other.item_id != null)
				return false;
		} else if (!item_id.equals(other.item_id))
			return false;
		return true;
	}

}