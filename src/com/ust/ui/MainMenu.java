package com.ust.ui;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.ust.beans.CartBean;
import com.ust.beans.FoodBean;
import com.ust.beans.OrderBean;
import com.ust.beans.ProfileBean;
import com.ust.beans.StoreBean;
import com.ust.dao.AdminDao;
import com.ust.dao.CostumerDao;
import com.ust.util.DataStructure;

public class MainMenu {
    public static void main(String[] args) {
        AdminDao ad = new AdminDao();
        CostumerDao cd = new CostumerDao();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.println("**************************************");
            System.out.println("********* QuikTime Pizza ************");
            System.out.println("**************************************");
            System.out.println("1. Admin");
            System.out.println("2. Customer");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
            case 1:
                while (true) {
                    sc.nextLine();
                    System.out.println("**************************************");
                    System.out.println("********* ADMIN MENU ***************");
                    System.out.println("**************************************");
                    System.out.println("AD001 Add Store");
                    System.out.println("AD002 Delete Store");
                    System.out.println("AD003 Display Store");
                    System.out.println("AD004 Update Store");
                    System.out.println("AD005 Add Food");
                    System.out.println("AD006 Delete Food");
                    System.out.println("AD007 Display Food");
                    System.out.println("AD008 Update Food");
                    System.out.println("AD009 Update Order status");
                    System.out.println("AD000 Exit");
                    System.out.print("Enter choice: ");
                    String op = sc.nextLine();
                    
                    switch (op) {
                    case "AD001":
                        System.out.println("Enter pin:");
                        int pass = sc.nextInt();
                        if (pass == 0000) {
                            sc.nextLine();
                            StoreBean store = new StoreBean();
                            System.out.print("Enter Store ID: ");
                            store.setStoreId(sc.nextLine());
                            System.out.print("Enter Name: ");
                            store.setName(sc.nextLine());
                            System.out.print("Enter Street: ");
                            store.setStreet(sc.nextLine());
                            System.out.print("Enter City: ");
                            store.setCity(sc.nextLine());
                            System.out.print("Enter State: ");
                            store.setState(sc.nextLine());
                            System.out.print("Enter Pin code: ");
                            store.setPincode(sc.nextLine());
                            String result = ad.addStore(store);
                            System.out.println("**************************************");
                            System.out.println(result);
                            System.out.println("**************************************");
                            break;
                        } else {
                            System.out.println("Invalid Pin");
                            break;
                        }
                    case "AD002":
                        System.out.println("Enter pin:");
                        pass = sc.nextInt();
                        if (pass == 0000) {
                            ArrayList<String> list = new ArrayList<String>();
                            while (true) {
                                sc.nextLine();
                                System.out.print("Enter Store ID: ");
                                String id = sc.nextLine();
                                list.add(id);
                                System.out.print("Do you want to delete more stores? (Y/N): ");
                                String ans = sc.nextLine();
                                if (ans.equalsIgnoreCase("N")) {
                                    break;
                                }
                            }
                            int result = ad.removeStore(list);
                            System.out.println("**************************************");
                            System.out.println(result);
                            System.out.println("**************************************");
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
                            System.out.print("Enter Store ID: ");
                            String sid = sc.nextLine();
                            StoreBean result = ad.viewStore(sid);
                            System.out.println("**************************************");
                            System.out.println(result);
                            System.out.println("**************************************");
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
                            System.out.print("Enter Store ID: ");
                            store.setStoreId(sc.nextLine());
                            System.out.print("Enter Name: ");
                            store.setName(sc.nextLine());
                            System.out.print("Enter Street: ");
                            store.setStreet(sc.nextLine());
                            System.out.print("Enter City: ");
                            store.setCity(sc.nextLine());
                            System.out.print("Enter State: ");
                            store.setState(sc.nextLine());
                            System.out.print("Enter Pin code: ");
                            store.setPincode(sc.nextLine());
                            boolean result = ad.modifyStore(store);
                            System.out.println("**************************************");
                            System.out.println(result);
                            System.out.println("**************************************");
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
                            System.out.print("Enter Store ID: ");
                            food.setStoreId(sc.nextLine());
                            System.out.print("Enter Food ID: ");
                            food.setFoodId(sc.nextLine());
                            System.out.print("Enter Size: ");
                            food.setFoodSize(sc.nextLine());
                            System.out.print("Enter Name: ");
                            food.setName(sc.nextLine());
                            System.out.print("Enter Type: ");
                            food.setType(sc.nextLine());
                            System.out.print("Enter Price: ");
                            food.setPrice(sc.nextLine());
                            System.out.print("Enter Quantity: ");
                            food.setQuantity(sc.nextInt());
                            String result = ad.addFood(food);
                            System.out.println("**************************************");
                            System.out.println(result);
                            System.out.println("**************************************");
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
                            System.out.print("Enter Store ID: ");
                            String sid = sc.nextLine();
                            System.out.print("Enter Food ID: ");
                            String fid = sc.nextLine();
                            boolean result = ad.removeFood(sid, fid);
                            System.out.println("**************************************");
                            System.out.println(result);
                            System.out.println("**************************************");
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
                            System.out.print("Enter Food ID: ");
                            String fid = sc.nextLine();
                            FoodBean result = ad.viewFood(fid);
                            System.out.println("**************************************");
                            System.out.println(result);
                            System.out.println("**************************************");
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
                            System.out.print("Enter Store ID: ");
                            food.setStoreId(sc.nextLine());
                            System.out.print("Enter Food ID: ");
                            food.setFoodId(sc.nextLine());
                            System.out.print("Enter Size: ");
                            food.setFoodSize(sc.nextLine());
                            System.out.print("Enter Name: ");
                            food.setName(sc.nextLine());
                            System.out.print("Enter Type: ");
                            food.setType(sc.nextLine());
                            System.out.print("Enter Price: ");
                            food.setPrice(sc.nextLine());
                            System.out.print("Enter Quantity: ");
                            food.setQuantity(sc.nextInt());
                            boolean result = ad.modifyFood(food);
                            System.out.println("**************************************");
                            System.out.println(result);
                            System.out.println("**************************************");
                            break;
                        } else {
                            System.out.println("Invalid Pin");
                            break;
                        }
                    case "AD009":
                        System.out.println("Enter pin:");
                        pass = sc.nextInt();
                        if (pass == 0000) {
                            sc.nextLine();
                            System.out.print("Enter Order ID: ");
                            String oid = sc.nextLine();
                            String result = ad.changeOrderStatus(oid);
                            System.out.println("**************************************");
                            System.out.println(result);
                            System.out.println("**************************************");
                            break;
                        } else {
                            System.out.println("Invalid Pin");
                            break;
                        }
                    case "AD000":
                        break;
                    default:
                        System.out.println("Invalid Choice");
                    }
                    cd.setDs(ad.getDs());
                    break;
                }
                break;
            case 2:
                System.out.println("**************************************");
                System.out.println("********* CUSTOMER MENU *************");
                System.out.println("**************************************");
                System.out.println("1. Login");
                System.out.println("2. Register");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");
                choice = sc.nextInt();
                
                switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter User ID: ");
                    String uid = sc.nextLine();
                    System.out.print("Enter City: ");
                    String city = sc.nextLine();
                    ArrayList<StoreBean> stores = cd.viewStore(city);
                    System.out.println("**************************************");
                    System.out.println(stores);
                    System.out.println("**************************************");
                    System.out.print("Enter Store ID: ");
                    String sid = sc.nextLine();
                    Random r = new Random();
                    int id = r.nextInt(50);
                    while (true) {
                        System.out.println("**************************************");
                        System.out.println("********* LET'S HAVE SOME PIZZA! ***");
                        System.out.println("**************************************");
                        System.out.println("US002 Select Dish");
                        System.out.println("US003 View Cart");
                        System.out.println("US004 Edit Cart");
                        System.out.println("US005 Checkout");
                        System.out.println("US006 Cancel Order");
                        System.out.println("US000 Exit");
                        System.out.print("Enter choice: ");
                        String op = sc.nextLine();
                        
                        switch (op) {
                        case "US002":
                            sc.nextLine();
                            CartBean cart = new CartBean();
                            System.out.println(ad.viewAllFood(sid));
                            System.out.print("Enter Food ID: ");
                            String fid = sc.nextLine();
                            cart.setFoodId(fid);
                            cart.setCartId(id);
                            cart.setOrderDate("null");
                            System.out.print("Enter Quantity: ");
                            int q = sc.nextInt();
                            cart.setQuantity(q);
                            cart.setUserId(uid);
                            int cartResult = cd.addToCart(cart);
                            System.out.println("**************************************");
                            System.out.println(cartResult);
                            System.out.println("**************************************");
                            break;
                        case "US003":
                            sc.nextLine();
                            ArrayList<CartBean> cartDetails = cd.viewCart(uid);
                            System.out.println("**************************************");
                            System.out.println(cartDetails);
                            System.out.println("**************************************");
                            break;
                        case "US004":
                            sc.nextLine();
                            cart = new CartBean();
                            ArrayList<CartBean> viewCart = cd.viewCart(uid);
                            System.out.println(viewCart);
                            System.out.print("Enter Cart ID: ");
                            fid = sc.nextLine();
                            cart.setFoodId(fid);
                            cart.setCartId(id);
                            cart.setOrderDate("null");
                            System.out.print("Enter Quantity: ");
                            q = sc.nextInt();
                            cart.setQuantity(q);
                            cart.setUserId(uid);
                            boolean modifyCartResult = cd.modifyCart(cart);
                            System.out.println("**************************************");
                            System.out.println(modifyCartResult);
                            System.out.println("**************************************");
                            break;
                        case "US005":
                            sc.nextLine();
                            OrderBean order = new OrderBean();
                            System.out.print("Enter Order ID: ");
                            String o = sc.nextLine();
                            order.setOrderId(o);
                            order.setUserId(uid);
                            order.setCartId(id);
                            order.setOrderDate("null");
                            order.setOrderStatus("Pending");
                            order.setCity(city);
                            System.out.print("Enter Area Pin code: ");
                            String p = sc.nextLine();
                            order.setPincode(p);
                            System.out.print("Enter Street: ");
                            String s = sc.nextLine();
                            order.setStreet(s);
                            System.out.print("Enter Landmark: ");
                            String l = sc.nextLine();
                            order.setStreet(l);
                            System.out.print("Enter Phone Number: ");
                            String ph = sc.nextLine();
                            order.setMobileNo(ph);
                            String confirmOrder = cd.confirmOrder(order, cd.viewCart(uid));
                            System.out.println("**************************************");
                            System.out.println(confirmOrder);
                            System.out.println("**************************************");
                            break;
                        case "US006":
                            sc.nextLine();
                            System.out.print("Enter Order ID: ");
                            String oid = sc.nextLine();
                            String cancelOrder = cd.cancelOrder(oid);
                            System.out.println("**************************************");
                            System.out.println(cancelOrder);
                            System.out.println("**************************************");
                            break;
                        case "US000":
                            break;
                        default:
                            System.out.println("Invalid Choice");
                            break;
                        }
                    }
                case 2:
                    sc.nextLine();
                    ProfileBean profile = new ProfileBean();
                    System.out.print("Enter User ID: ");
                    profile.setUserId(sc.nextLine());
                    System.out.print("Enter First Name: ");
                    profile.setFirstName(sc.nextLine());
                    System.out.print("Enter Last Name: ");
                    profile.setLastName(sc.nextLine());
                    System.out.print("Enter City: ");
                    profile.setCity(sc.nextLine());
                    System.out.print("Enter Street: ");
                    profile.setStreet(sc.nextLine());
                    System.out.print("Enter Location: ");
                    profile.setLocation(sc.nextLine());
                    System.out.print("Enter Mobile Number: ");
                    profile.setMobileNo(sc.nextLine());
                    System.out.print("Enter Pincode: ");
                    profile.setPincode(sc.nextLine());
                    System.out.print("Enter Password: ");
                    profile.setPassword(sc.nextLine());
                    System.out.print("Enter Email ID: ");
                    profile.setEmailId(sc.nextLine());
                    System.out.print("Enter Gender: ");
                    profile.setGendere(sc.nextLine());
                    System.out.print("Enter Date Of Birth: ");
                    profile.setDateOfBirth(sc.nextLine());
                    System.out.print("Enter State: ");
                    profile.setState(sc.nextLine());
                    String addUserResult = cd.addUser(profile);
                    System.out.println("**************************************");
                    System.out.println(addUserResult);
                    System.out.println("**************************************");
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
                }
                ad.setDs(cd.getDs());
                break;
            default:
                System.out.println("Invalid Choice");
                break;
            }
        }
    }
}



//package com.ust.ui;
//
//import java.util.ArrayList;
//import java.util.Random;
//import java.util.Scanner;
//
//import com.ust.beans.CartBean;
//import com.ust.beans.FoodBean;
//import com.ust.beans.OrderBean;
//import com.ust.beans.ProfileBean;
//import com.ust.beans.StoreBean;
//import com.ust.dao.AdminDao;
//import com.ust.dao.CostumerDao;
//import com.ust.util.DataStructure;
//
//
//public class MainMenu {
//	public static void main(String[] args) {
//		AdminDao ad = new AdminDao();
//		CostumerDao cd = new CostumerDao();
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			System.out.println("<<<<<<<<<<<<< QuikTime Pizza >>>>>>>>>>>>>>>\n" + "1.Admin\n" + "2.Customer");
//			int choice = sc.nextInt();
//			switch (choice) {
//			case 1:
//				while (true) {
//					sc.nextLine();
//					System.out.println("<<<<<<<<<<<<< ADMIN MENU >>>>>>>>>>>>>>>\n" + "AD001 Add Store\n"
//							+ "AD002 Delete Store\n" + "AD003 Display Store\n" + "AD004 Update Store\n"
//							+ "AD005 Add Food\n" + "AD006 Delete Food\n" + "AD007 Display Food\n"
//							+ "AD008 Update Food\n" + "AD009 Update Order status\n" + "AD000 Exit");
//					String op = sc.nextLine();
//					switch (op) {
//					case "AD001":
//						System.out.println("Enter pin:");
//						int pass = sc.nextInt();
//						if (pass == 0000) {
//							sc.nextLine();
//							StoreBean store = new StoreBean();
//							System.out.println("Enter Store ID : ");
//							store.setStoreId(sc.nextLine());
//							System.out.println("Enter Name : ");
//							store.setName(sc.nextLine());
//							System.out.println("Enter Street : ");
//							store.setStreet(sc.nextLine());
//							System.out.println("Enter City : ");
//							store.setCity(sc.nextLine());
//							System.out.println("Enter State : ");
//							store.setState(sc.nextLine());
//							System.out.println("Enter Pin code: ");
//							store.setPincode(sc.nextLine());
//							System.out.println(ad.addStore(store));
//							break;
//						} else {
//							System.out.println("Invalid Pin");
//							break;
//						}
//					case "ÄD002":
//						System.out.println("Enter pin:");
//						pass = sc.nextInt();
//						if (pass == 0000) {
//							ArrayList<String> list = new ArrayList<String>();
//							while (true) {
//								System.out.println("Enter Store ID : ");
//								String id = sc.nextLine();
//								list.add(id);
//								System.out.println("Do you want to delete more stores? (Y/N)");
//								String ans = sc.nextLine();
//								if (ans.equalsIgnoreCase("N")) {
//									break;
//								}
//							}
//							System.out.println(ad.removeStore(list));
//							break;
//						} else {
//							System.out.println("Invalid Pin");
//							break;
//						}
//					case "AD003":
//						System.out.println("Enter pin:");
//						pass = sc.nextInt();
//						if (pass == 0000) {
//							sc.nextLine();
//							System.out.println("Enter Store ID : ");
//							String sid = sc.nextLine();
//							System.out.println(ad.viewStore(sid));
//							break;
//						} else {
//							System.out.println("Invalid Pin");
//							break;
//						}
//					case "AD004":
//						System.out.println("Enter pin:");
//						pass = sc.nextInt();
//						if (pass == 0000) {
//							sc.nextLine();
//							StoreBean store = new StoreBean();
//							System.out.println("Enter Store ID : ");
//							store.setStoreId(sc.nextLine());
//							System.out.println("Enter Name : ");
//							store.setName(sc.nextLine());
//							System.out.println("Enter Street : ");
//							store.setStreet(sc.nextLine());
//							System.out.println("Enter City : ");
//							store.setCity(sc.nextLine());
//							System.out.println("Enter State : ");
//							store.setState(sc.nextLine());
//							System.out.println("Enter Pin code: ");
//							store.setPincode(sc.nextLine());
//							System.out.println(ad.modifyStore(store));
//							break;
//						} else {
//							System.out.println("Invalid Pin");
//							break;
//						}
//					case "AD005":
//						System.out.println("Enter pin:");
//						pass = sc.nextInt();
//						if (pass == 0000) {
//							sc.nextLine();
//							FoodBean food = new FoodBean();
//							System.out.println("Enter Store ID : ");
//							food.setStoreId(sc.nextLine());
//							System.out.println("Enter Food ID : ");
//							food.setFoodId(sc.nextLine());
//							System.out.println("Enter size : ");
//							food.setFoodSize(sc.nextLine());
//							System.out.println("Enter Name : ");
//							food.setName(sc.nextLine());
//							System.out.println("Enter Type : ");
//							food.setType(sc.nextLine());
//							System.out.println("Enter Price : ");
//							food.setPrice(sc.nextLine());
//							System.out.println("Enter Quantity : ");
//							food.setQuantity(sc.nextInt());
//							System.out.println(ad.addFood(food));
//							break;
//						} else {
//							System.out.println("Invalid Pin");
//							break;
//						}
//					case "AD006":
//						System.out.println("Enter pin:");
//						pass = sc.nextInt();
//						if (pass == 0000) {
//							sc.nextLine();
//							System.out.println("Enter Store ID : ");
//							String sid = sc.nextLine();
//							System.out.println("Enter Food ID : ");
//							String fid = sc.nextLine();
//							System.out.println(ad.removeFood(sid, fid));
//							break;
//						} else {
//							System.out.println("Invalid Pin");
//							break;
//						}
//					case "AD007":
//						System.out.println("Enter pin:");
//						pass = sc.nextInt();
//						if (pass == 0000) {
//							sc.nextLine();
//							System.out.println("Enter Food ID : ");
//							String fid = sc.nextLine();
//							System.out.println(ad.viewFood(fid));
//							break;
//						} else {
//							System.out.println("Invalid Pin");
//							break;
//						}
//					case "AD008":
//						System.out.println("Enter pin:");
//						pass = sc.nextInt();
//						if (pass == 0000) {
//							sc.nextLine();
//							FoodBean food = new FoodBean();
//							System.out.println("Enter Store ID : ");
//							food.setStoreId(sc.nextLine());
//							System.out.println("Enter Food ID : ");
//							food.setFoodId(sc.nextLine());
//							System.out.println("Enter size : ");
//							food.setFoodSize(sc.nextLine());
//							System.out.println("Enter Name : ");
//							food.setName(sc.nextLine());
//							System.out.println("Enter Type : ");
//							food.setType(sc.nextLine());
//							System.out.println("Enter Price : ");
//							food.setPrice(sc.nextLine());
//							System.out.println("Enter Quantity : ");
//							food.setQuantity(sc.nextInt());
//							System.out.println(ad.modifyFood(food));
//							break;
//						} else {
//							System.out.println("Invalid Pin");
//							break;
//						}
//					case "AD009":
//						System.out.println("Enter pin:");
//						pass = sc.nextInt();
//						if (pass == 0000) {
//							sc.nextLine();
//							System.out.println("Enter Order ID : ");
//							String oid = sc.nextLine();
//							System.out.println(ad.changeOrderStatus(oid));
//							break;
//
//						} else {
//							System.out.println("Invalid Pin");
//							break;
//						}
//					case "AD000":
//						break;
//					default:
//						System.out.println("Invalid Choice");
//					}
//					cd.setDs(ad.getDs());
//					break;
//				}
//				break;
//			case 2:
//				System.out.println("<<<<<<<<<<<<<<<< Customer >>>>>>>>>>>>>>>>>>>>\n 1.Login\n 2.Register\n 3.Exit\n");
//				choice = sc.nextInt();
//				switch (choice) {
//				case 1:
//					sc.nextLine();
//					System.out.println("Enter User ID : ");
//					String uid = sc.nextLine();
//					System.out.println("Enter City : ");
//					String city = sc.nextLine();
//					System.out.println(cd.viewStore(city));
//					System.out.println("Enter Store ID : ");
//					String sid = sc.nextLine();
//					Random r = new Random();
//					int id = r.nextInt(50);
//					while (true) {
//						System.out.println("\"<<<<<<<<<<<<<<<< Lets Have some Pizza!! >>>>>>>>>>>>>>>>>>>>\n"
//								+ "US002 Select Dish\nUS003 View Cart\nUS004 Edit cart\nUS005 Checkout \nUS006 Cancel Order\nUS000 Exit\n\"");
//						String op = sc.nextLine();
//						switch (op) {
//						case "US002":
//							sc.nextLine();
//							CartBean cart = new CartBean();
//							System.out.println(ad.viewAllFood(sid));
//							System.out.println("Enter Food ID : ");
//							String fid = sc.nextLine();
//							cart.setFoodId(fid);
//							cart.setCartId(id);
//							cart.setOrderDate("null");
//							System.out.println("Enter Quantity : ");
//							int q = sc.nextInt();
//							cart.setQuantity(q);
//							cart.setUserId(uid);
//							System.out.println(cd.addToCart(cart));
//							break;
//						case "US003":
//							sc.nextLine();
//							System.out.println(cd.viewCart(uid));
//							break;
//						case "US004":
//							sc.nextLine();
//							cart = new CartBean();
//							System.out.println(cd.viewCart(uid));
//							System.out.println("Enter Cart ID : ");
//							fid = sc.nextLine();
//							cart.setFoodId(fid);
//							cart.setCartId(id);
//							cart.setOrderDate("null");
//							System.out.println("Enter Quantity : ");
//							q = sc.nextInt();
//							cart.setQuantity(q);
//							cart.setUserId(uid);
//							System.out.println(cd.modifyCart(cart));
//							break;
//						case "US005":
//							sc.nextLine();
//							OrderBean order = new OrderBean();
//							System.out.println("Enter order id:");
//							String o = sc.nextLine();
//							order.setOrderId(o);
//							order.setUserId(uid);
//							order.setCartId(id);
//							order.setOrderDate("null");
//							order.setOrderStatus("Pending");
//							order.setCity(city);
//							System.out.println("Enter Area Pin code:");
//							String p = sc.nextLine();
//							order.setPincode(p);
//							System.out.println("Enter Street:");
//							String s = sc.nextLine();
//							order.setStreet(s);
//							System.out.println("Enter Landmark:");
//							String l = sc.nextLine();
//							order.setStreet(l);
//							System.out.println("Enter Phone Number:");
//							String ph = sc.nextLine();
//							order.setMobileNo(ph);
//							System.out.println(cd.confirmOrder(order, cd.viewCart(uid)));
//							break;
//						case "US006":
//							sc.nextLine();
//							System.out.println("Enter Order ID : ");
//							String oid = sc.nextLine();
//							System.out.println(cd.cancelOrder(oid));
//							break;
//						case "US000":
//							break;
//						default:
//							System.out.println("Invalid Choice");
//							break;
//						}
//					}
//				case 2:
//					sc.nextLine();
//					ProfileBean profile = new ProfileBean();
//					System.out.println("Enter User ID : ");
//					profile.setUserId(sc.nextLine());
//					System.out.println("Enter First Name : ");
//					profile.setFirstName(sc.nextLine());
//					System.out.println("Enter Last Name : ");
//					profile.setLastName(sc.nextLine());
//					System.out.println("Enter City : ");
//					profile.setCity(sc.nextLine());
//					System.out.println("Enter Street : ");
//					profile.setStreet(sc.nextLine());
//					System.out.println("Enter Location : ");
//					profile.setLocation(sc.nextLine());
//					System.out.println("Enter Mobile Number : ");
//					profile.setMobileNo(sc.nextLine());
//					System.out.println("Enter Pincode : ");
//					profile.setPincode(sc.nextLine());
//					System.out.println("Enter Password : ");
//					profile.setPassword(sc.nextLine());
//					System.out.println("Enter Email ID : ");
//					profile.setEmailId(sc.nextLine());
//					System.out.println("Enter Gender : ");
//					profile.setGendere(sc.nextLine());
//					System.out.println("Enter Date Of Birth : ");
//					profile.setDateOfBirth(sc.nextLine());
//					System.out.println("Enter State : ");
//					profile.setState(sc.nextLine());
//					System.out.println(cd.addUser(profile));
//					break;
//				case 3:
//					break;
//				default:
//					System.out.println("Invalid Choice");
//					break;
//				}
//				ad.setDs(cd.getDs());
//				break;
//			default:
//				System.out.println("Invalid Choice");
//				break;
//			}
//		}
//	}
//}
