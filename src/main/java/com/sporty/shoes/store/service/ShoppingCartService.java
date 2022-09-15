package com.sporty.shoes.store.service;

import com.sporty.shoes.store.domain.Article;
import com.sporty.shoes.store.domain.CartItem;
import com.sporty.shoes.store.domain.ShoppingCart;
import com.sporty.shoes.store.domain.User;


public interface ShoppingCartService {

	ShoppingCart getShoppingCart(User user);
	
	int getItemsNumber(User user);
	
	CartItem findCartItemById(Long cartItemId);
	
	CartItem addArticleToShoppingCart(Article article, User user, int qty, String size);
		
	void clearShoppingCart(User user);
	
	void updateCartItem(CartItem cartItem, Integer qty);

	void removeCartItem(CartItem cartItem);
	
}
