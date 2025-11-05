package com.ust.util;

import java.util.ArrayList;
import java.util.List;

import com.ust.beans.CartBean;
import com.ust.beans.FoodBean;
import com.ust.beans.OrderBean;
import com.ust.beans.ProfileBean;
import com.ust.beans.StoreBean;

public class DataStructure {
	List<CartBean> cart = new ArrayList<>();
	List<FoodBean> food = new ArrayList<>();
	List<ProfileBean> profiles = new ArrayList<>();
	List<StoreBean> stores = new ArrayList<>();
	List<OrderBean> orders = new ArrayList<>();
	public List<CartBean> getCart() {
		return cart;
	}
	public void setCart(List<CartBean> cart) {
		this.cart = cart;
	}
	public List<FoodBean> getFood() {
		return food;
	}
	public void setFood(List<FoodBean> food) {
		this.food = food;
	}
	public List<ProfileBean> getProfiles() {
		return profiles;
	}
	public void setProfiles(List<ProfileBean> profiles) {
		this.profiles = profiles;
	}
	public List<StoreBean> getStores() {
		return stores;
	}
	public void setStores(List<StoreBean> stores) {
		this.stores = stores;
	}
	public List<OrderBean> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderBean> orders) {
		this.orders = orders;
	}
	
	
	
}
