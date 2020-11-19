package com.qa.ims.persistence.domain;
import com.qa.ims.persistence.domain.Customer;
public class Order{

	private Long order_id;
	private Long id;

	public Order(Long order_id, Long id) {
		this.order_id = order_id;
		this.id = id;
	}


	public Long getOrderId() {
		return order_id;
	}
	public Long getfId() {
		return id;
	}

	public void setOrderId(Long order_id) {
		this.order_id = order_id;
	}

	@Override
	public String toString() {
		return "order_id:" + order_id + " customer_id:" + id; 
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (order_id == null) {
			if (other.order_id!= null)
				return false;
		} else if (!order_id.equals(other.order_id))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}