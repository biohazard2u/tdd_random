package com.mz.order.bo;

import com.mz.order.bo.exception.BOException;
import com.mz.order.dto.Order;

public interface OrderBO {

	boolean placeOrder(Order order) throws BOException;
	boolean cancelOrder(int id) throws BOException;
	boolean deleteOrder(int id) throws BOException;
}
