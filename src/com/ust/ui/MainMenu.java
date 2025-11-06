package com.ust.ui;

import java.util.ArrayList;
import java.util.Scanner;

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
							+ "AD002 Delete Store\n" + "AD003 Display Store\n" + "AD004 Update Store\n" + "AD000 Exit");
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
					}
				}
			default:
				System.out.println("Invalid Choice");
			}
		}
	}
}
