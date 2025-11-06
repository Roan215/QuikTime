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
	
	public DataStructure() {
        // Adding CartBean objects
        cart.add(new CartBean(1, 2, "U001", "F001", "Veg", "2025-11-05", 20.50));
        cart.add(new CartBean(2, 1, "U002", "F002", "Non-Veg", "2025-11-05", 15.75));
        cart.add(new CartBean(3, 3, "U003", "F003", "Veg", "2025-11-06", 30.00));
        cart.add(new CartBean(4, 2, "U004", "F004", "Non-Veg", "2025-11-06", 22.50));
        cart.add(new CartBean(5, 1, "U005", "F005", "Veg", "2025-11-07", 18.00));

        // Adding FoodBean objects
        food.add(new FoodBean("F001", "Peporoni pizza", "15.00", "Medium", "Veg", 10));
        food.add(new FoodBean("F002", "Charcol pizza", "10.00", "Small", "Non-Veg", 20));
        food.add(new FoodBean("F003", "Pasta", "12.50", "Large", "Veg", 15));
        food.add(new FoodBean("F004", "Chicken Wings", "18.00", "Medium", "Non-Veg", 5));
        food.add(new FoodBean("F005", "Salad", "8.00", "Small", "Veg", 30));

        // Adding ProfileBean objects
        profiles.add(new ProfileBean("U001", "Alice", "Doe", "1990-01-01", "Female", "123 Main St", "NYC", "New York", "NY", "10001", "123-456-7890", "alice@example.com", "password123"));
        profiles.add(new ProfileBean("U002", "Bob", "Smith", "1985-02-15", "Male", "456 Oak St", "LA", "Los Angeles", "CA", "90001", "987-654-3210", "bob@example.com", "password123"));
        profiles.add(new ProfileBean("U003", "Charlie", "Brown", "1992-07-20", "Male", "789 Pine St", "chicago","Chicago", "IL", "60001", "555-666-7777", "charlie@example.com", "password123"));
        profiles.add(new ProfileBean("U004", "David", "Green", "1988-11-25", "Male", "101 Maple St", "Houston", "Houston", "TX", "77001", "222-333-4444", "david@example.com", "password123"));
        profiles.add(new ProfileBean("U005", "Eve", "White", "1995-05-05", "Female", "202 Elm St", "Phoenix", "Phoenix","AZ", "85001", "111-222-3333", "eve@example.com", "password123"));

        // Adding StoreBean objects
        stores.add(new StoreBean("S001", "Store 1", "Main St", "555-1111", "New York", "NY", "10001"));
        stores.add(new StoreBean("S002", "Store 2", "Oak St", "555-2222", "Los Angeles", "CA", "90001"));
        stores.add(new StoreBean("S003", "Store 3", "Pine St", "555-3333", "Chicago", "IL", "60001"));
        stores.add(new StoreBean("S004", "Store 4", "Maple St", "555-4444", "Houston", "TX", "77001"));
        stores.add(new StoreBean("S005", "Store 5", "Elm St", "555-5555", "Phoenix", "AZ", "85001"));

     // Adding OrderBean objects
        orders.add(new OrderBean("O001", "U001", "2025-11-05", "S001", "Completed", "123 Main St", "New York", "10001", "123-456-7890", 1, 40.50));
        orders.add(new OrderBean("O002", "U002", "2025-11-05", "S002", "Pending", "456 Oak St", "Los Angeles", "90001", "987-654-3210", 2, 45.25));
        orders.add(new OrderBean("O003", "U003", "2025-11-06", "S003", "Shipped", "789 Pine St", "Chicago", "60001", "555-666-7777", 3, 50.00));
        orders.add(new OrderBean("O004", "U004", "2025-11-06", "S004", "Completed", "101 Maple St", "Houston", "77001", "222-333-4444", 4, 40.00));
        orders.add(new OrderBean("O005", "U005", "2025-11-07", "S005", "Pending", "202 Elm St", "Phoenix", "85001", "111-222-3333", 5, 30.00));
    }
    
	
	
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
	public void setStores(StoreBean store) {
		this.stores.add(store);
	}
	public List<OrderBean> getOrders() {
		return orders;
	}
	public void setOrders(List<OrderBean> orders) {
		this.orders = orders;
	}
	
}
