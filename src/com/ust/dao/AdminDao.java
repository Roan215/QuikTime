package com.ust.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.ust.beans.FoodBean;
import com.ust.beans.OrderBean;
import com.ust.beans.StoreBean;
import com.ust.services.AdminServices;
import com.ust.util.DataStructure;

public class AdminDao implements AdminServices{
	
	DataStructure ds = new DataStructure();
	

	public DataStructure getDs() {
		return ds;
	}

	public void setDs(DataStructure ds) {
		this.ds = ds;
	}

	@Override
	public String addStore(StoreBean storebean) {
		// TODO Auto-generated method stub
		ds.setStores(storebean);
		return "success";
	}

	@Override
	public boolean modifyStore(StoreBean storebean) {
		// TODO Auto-generated method stub
		Iterator<StoreBean> itr = ds.getStores().iterator();
		while(itr.hasNext()) {
			if (itr.next().getStoreId().equals(storebean.getStoreId())) {
				itr.remove();
				ds.setStores(storebean);
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	@Override
	public int removeStore(ArrayList<String> storeId) {
		// TODO Auto-generated method stub
		Iterator<String> itr = storeId.iterator();
		while(itr.hasNext()) {
			Iterator<StoreBean> itr1 = ds.getStores().iterator();
			while(itr1.hasNext()) {
				if (itr1.next().getStoreId().equals(itr.next())) {
					itr1.remove();
					return 1;
				}
			}
		}
		return 0;
	}

	@Override
	public StoreBean viewStore(String storeId) {
		// TODO Auto-generated method stub
		Iterator<StoreBean> itr = ds.getStores().iterator();
		while(itr.hasNext()) {
			if (itr.next().getStoreId().equals(storeId)) {
				return itr.next();
			}
		}
		return null;
	}

	@Override
	public ArrayList<StoreBean> viewAllStore() {
		// TODO Auto-generated method stub
		return (ArrayList<StoreBean>) ds.getStores();
	}

	@Override
	public String addFood(FoodBean foodbean) {
		// TODO Auto-generated method stub
		List<String> sd = ds.getStores().stream()
				.map(x->x.getStoreId())
				.toList();
		
		for(String id : sd) {
			if(id.equals(foodbean.getStoreId())) {
				ds.setFood(foodbean);
				return "success";
			}
		}
		return "store not found";
	}

	@Override
	public boolean modifyFood(FoodBean foodbean) {
		// TODO Auto-generated method stub
		Iterator<FoodBean> itr = ds.getFood().iterator();
		while(itr.hasNext()) {
			if (itr.next().getFoodId().equals(foodbean.getFoodId())) {
				itr.remove();
				ds.setFood(foodbean);
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	@Override
	public boolean removeFood(String storeId, String foodId) {
		// TODO Auto-generated method stub
		Iterator<FoodBean> itr = ds.getFood().iterator();
		while(itr.hasNext()) {
			if (itr.next().getFoodId().equals(foodId) && itr.next().getStoreId().equals(storeId)) {
				itr.remove();
				return true;
			}
		}
		return false;
	}

	@Override
	public FoodBean viewFood(String foodId) {
		// TODO Auto-generated method stub
		Iterator<FoodBean> itr = ds.getFood().iterator();
		while(itr.hasNext()) {
			if (itr.next().getFoodId().equals(foodId)) {
				return itr.next();
			}
		}
		return null;
	}

	@Override
	public ArrayList<FoodBean> viewAllFood(String storeId) {
		// TODO Auto-generated method stub
		return (ArrayList<FoodBean>) ds.getFood();
	}

	@Override
	public String changeOrderStatus(String orderId) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Iterator<OrderBean> itr = ds.getOrders().iterator();
		while (itr.hasNext()) {
			if (itr.next().getOrderId().equals(orderId)) {
				System.out.println("Enter Status : ");
				String status = sc.nextLine();
				itr.next().setOrderStatus(status);
				return "order status updated";
			}
		}
		return null;
	}

}
