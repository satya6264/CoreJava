package com.vidvaan.costum.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class OrdersTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		FileOutputStream fos = new FileOutputStream("Orders.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		Orders orders = new Orders();
//		orders.setPid(100101);
//		orders.setPname("Laptop");
//		orders.setPrice(400000.00);
//		orders.setOrderName("ASUS");
//		orders.setOrderStatus("Delivered");
//		oos.writeObject(orders);
//		System.out.println("Order Serialization success");
//		fos.close();
//		oos.close();

		FileInputStream fis = new FileInputStream("Orders.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Orders orders = (Orders) ois.readObject();
		System.out.println("Deserialization Success");
		System.out.println(orders);
//		System.out.println(Product.getPid());
	}

}
