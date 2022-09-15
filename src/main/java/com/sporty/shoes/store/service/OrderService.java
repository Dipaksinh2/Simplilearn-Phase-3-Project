package com.sporty.shoes.store.service;

import java.util.List;

import com.sporty.shoes.store.domain.Order;
import com.sporty.shoes.store.domain.Payment;
import com.sporty.shoes.store.domain.Shipping;
import com.sporty.shoes.store.domain.ShoppingCart;
import com.sporty.shoes.store.domain.User;

public interface OrderService {

	Order createOrder(ShoppingCart shoppingCart, Shipping shippingAddress, Payment payment, User user);
	
	List<Order> findByUser(User user);
	
	Order findOrderWithDetails(Long id);
}
