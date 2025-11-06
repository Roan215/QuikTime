package com.ust.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.ust.beans.FoodBean;
import com.ust.beans.StoreBean;
import com.ust.dao.AdminDao;
import com.ust.util.DataStructure;

public class MainMenu {
	public static void main(String[] args) {
		AdminDao ad = new AdminDao();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("<<<<<<<<<<<<< MAIN MENU >>>>>>>>>>>>>>>\n" + "1.Admin\n" + "2.Customer");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				while (true) {
					sc.nextLine();
					System.out.println("<<<<<<<<<<<<< ADMIN MENU >>>>>>>>>>>>>>>\n" + "AD001 Add Store\n"
							+ "AD002 Delete Store\n" + "AD003 Display Store\n" + "AD004 Update Store\n"
							+ "AD005 Add Food\n" + "AD006 Delete Food\n" + "AD007 Display Food\n"
							+ "AD008 Update Food\n" + "AD009 Update Order status\n" + "AD000 Exit");
					String op = sc.nextLine();
					switch (op) {
					case "AD001":
						System.out.println("Enter pin:");
						int pass = sc.nextInt();
						if (pass == 0000) {
							sc.nextLine();
							StoreBean store = new StoreBean();
							System.out.println("Enter Store ID : ");
							store.setStoreId(sc.nextLine());
							System.out.println("Enter Name : ");
							store.setName(sc.nextLine());
							System.out.println("Enter Street : ");
							store.setStreet(sc.nextLine());
							System.out.println("Enter City : ");
							store.setCity(sc.nextLine());
							System.out.println("Enter State : ");
							store.setState(sc.nextLine());
							System.out.println("Enter Pin code: ");
							store.setPincode(sc.nextLine());
							System.out.println(ad.addStore(store));
							break;
						} else {
							System.out.println("Invalid Pin");
							break;
						}
					case "ÄD002":
						System.out.println("Enter pin:");
						pass = sc.nextInt();
						if (pass == 0000) {
							ArrayList<String> list = new ArrayList<String>();
							while (true) {
								System.out.println("Enter Store ID : ");
								String id = sc.nextLine();
								list.add(id);
								System.out.println("Do you want to delete more stores? (Y/N)");
								String ans = sc.nextLine();
								if (ans.equalsIgnoreCase("N")) {
									break;
								}
							}
							System.out.println(ad.removeStore(list));
							break;
						} else {
							System.out.println("Invalid Pin");
							break;
						}
					case "AD003":
						System.out.println("Enter pin:");
						pass = sc.nextInt();
						if (pass == 0000) {
							sc.nextLine();
							System.out.println("Enter Store ID : ");
							String sid = sc.nextLine();
							System.out.println(ad.viewStore(sid));
							break;
						} else {
							System.out.println("Invalid Pin");
							break;
						}
					case "AD004":
						System.out.println("Enter pin:");
						pass = sc.nextInt();
						if (pass == 0000) {
							sc.nextLine();
							StoreBean store = new StoreBean();
							System.out.println("Enter Store ID : ");
							store.setStoreId(sc.nextLine());
							System.out.println("Enter Name : ");
							store.setName(sc.nextLine());
							System.out.println("Enter Street : ");
							store.setStreet(sc.nextLine());
							System.out.println("Enter City : ");
							store.setCity(sc.nextLine());
							System.out.println("Enter State : ");
							store.setState(sc.nextLine());
							System.out.println("Enter Pin code: ");
							store.setPincode(sc.nextLine());
							System.out.println(ad.modifyStore(store));
							break;
						} else {
							System.out.println("Invalid Pin");
							break;
						}
					case "AD005":
						System.out.println("Enter pin:");
						pass = sc.nextInt();
						if (pass == 0000) {
							sc.nextLine();
							FoodBean food = new FoodBean();
							System.out.println("Enter Store ID : ");
							food.setStoreId(sc.nextLine());
							System.out.println("Enter Food ID : ");
							food.setFoodId(sc.nextLine());
							System.out.println("Enter size : ");
							food.setFoodSize(sc.nextLine());
							System.out.println("Enter Name : ");
							food.setName(sc.nextLine());
							System.out.println("Enter Type : ");
							food.setType(sc.nextLine());
							System.out.println("Enter Price : ");
							food.setPrice(sc.nextLine());
							System.out.println("Enter Quantity : ");
							food.setQuantity(sc.nextInt());
							System.out.println(ad.addFood(food));
							break;
						} else {
							System.out.println("Invalid Pin");
							break;
						}
					case "AD006":
						System.out.println("Enter pin:");
						pass = sc.nextInt();
						if (pass == 0000) {
							sc.nextLine();
							System.out.println("Enter Store ID : ");
							String sid = sc.nextLine();
							System.out.println("Enter Food ID : ");
							String fid = sc.nextLine();
							System.out.println(ad.removeFood(sid, fid));
							break;
						} else {
							System.out.println("Invalid Pin");
							break;
						}
					case "AD007":
						System.out.println("Enter pin:");
						pass = sc.nextInt();
						if (pass == 0000) {
							sc.nextLine();
							System.out.println("Enter Food ID : ");
							String fid = sc.nextLine();
							System.out.println(ad.viewFood(fid));
							break;
						} else {
							System.out.println("Invalid Pin");
							break;
						}
					case "AD008":
						System.out.println("Enter pin:");
						pass = sc.nextInt();
						if (pass == 0000) {
							sc.nextLine();
							FoodBean food = new FoodBean();
							System.out.println("Enter Store ID : ");
							food.setStoreId(sc.nextLine());
							System.out.println("Enter Food ID : ");
							food.setFoodId(sc.nextLine());
							System.out.println("Enter size : ");
							food.setFoodSize(sc.nextLine());
							System.out.println("Enter Name : ");
							food.setName(sc.nextLine());
							System.out.println("Enter Type : ");
							food.setType(sc.nextLine());
							System.out.println("Enter Price : ");
							food.setPrice(sc.nextLine());
							System.out.println("Enter Quantity : ");
							food.setQuantity(sc.nextInt());
							System.out.println(ad.modifyFood(food));
							break;
						}
						else {
							System.out.println("Invalid Pin");
							break;
						}
					case "AD009":
						System.out.println("Enter pin:");
						pass = sc.nextInt();
						if (pass == 0000) {
							sc.nextLine();
							System.out.println("Enter Order ID : ");
							String oid = sc.nextLine();
							System.out.println(ad.changeOrderStatus(oid));
							break;
							
						} else {
							System.out.println("Invalid Pin");
							break;
						}
					case "AD000": break;
					default:
						System.out.println("Invalid Choice");
					} break;
				}break;
			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}
