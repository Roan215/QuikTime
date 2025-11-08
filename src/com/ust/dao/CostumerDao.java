package com.ust.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ust.beans.CartBean;
import com.ust.beans.FoodBean;
import com.ust.beans.OrderBean;
import com.ust.beans.ProfileBean;
import com.ust.beans.StoreBean;
import com.ust.services.CustomerServices;
import com.ust.util.DataStructure;

public class CostumerDao implements CustomerServices {
	public DataStructure ds = new DataStructure();
	
	
	
	public DataStructure getDs() {
		return ds;
	}

	public void setDs(DataStructure ds) {
		this.ds = ds;
	}

	public String addUser(ProfileBean profileBean) {
		// TODO Auto-generated constructor stub
		ds.setProfiles(profileBean);
		return "success";
	}

	@Override
	public int addToCart(CartBean cartBean) {
		// TODO Auto-generated method stub
		Iterator<FoodBean> itr = ds.getFood().iterator();
		while (itr.hasNext()) {
			if (cartBean.getFoodId().equals(itr.next().getFoodId())) {
				cartBean.setType(itr.next().getType());
				cartBean.setCost(Double.parseDouble(itr.next().getPrice()));
				ds.setCart(cartBean);
				return 1;
			}
		}
		return 0;
	}

	@Override
	public boolean modifyCart(CartBean cartBean) {
		// TODO Auto-generated method stub
		Iterator<CartBean> itr = ds.getCart().iterator();
		while (itr.hasNext()) {
			if (itr.next().getCartId()==cartBean.getCartId()) {
				itr.remove();
				ds.setCart(cartBean);
				return true;
			}
		}
		return false;
	}

	@Override
	public String confirmOrder(OrderBean orderBean, ArrayList<CartBean> cartbean) {
		// TODO Auto-generated method stub
		for(CartBean c:cartbean) {
			orderBean.setCartId(c.getCartId());
			orderBean.setOrderStatus("Pending");
			ds.setOrders(orderBean);
		}
		return "success";
	}

	@Override
	public String cancelOrder(String orderId) {
		// TODO Auto-generated method stub
		Iterator<OrderBean> itr = ds.getOrders().iterator();
		while (itr.hasNext()) {
			if (itr.next().getOrderId().equals(orderId)) {
				itr.remove();
				return "order cancelled";
			}
		}
		return null;
	}

	@Override
	public ArrayList<StoreBean> viewStore(String city) {
		// TODO Auto-generated method 
		Iterator<StoreBean> itr = ds.getStores().iterator();
		ArrayList<StoreBean> list = new ArrayList<>();
		while (itr.hasNext()) {
			if (itr.next().getCity().equals(city)) {
				list.add(itr.next());
			}
		}
		return list;
	}

	@Override
	public ArrayList<CartBean> viewCart(String userid) {
		// TODO Auto-generated method stub
		List<CartBean> list = ds.getCart().stream()
				.filter(x->x.getUserId().equals(userid))
				.toList();
		ArrayList<CartBean> al = new ArrayList<>(list);
		
		return al;
	}

	@Override
	public ArrayList<OrderBean> viewOrder(String userid) {
		// TODO Auto-generated method stub
		List<OrderBean> list = ds.getOrders().stream()
				.filter(x->x.getUserId().equals(userid))
				.toList();
		
		return (ArrayList<OrderBean>) list;
	}

}
