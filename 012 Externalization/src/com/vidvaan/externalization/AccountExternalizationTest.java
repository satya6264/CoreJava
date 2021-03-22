package com.vidvaan.externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AccountExternalizationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		FileOutputStream fos = new FileOutputStream("account.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		Account account = new Account();
//		account.setAcNo(202012345);
//		account.setAcName("Satya");
//		account.setAcBalance(20000.0);
//		oos.writeObject(account);
//		System.out.println("Success");
//		fos.close();
//		oos.close();

		FileInputStream fis = new FileInputStream("account.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account account = (Account) ois.readObject();
		System.out.println("account deserialization");
		System.out.println(account.getAcNo());
		System.out.println(account.getAcName());
		System.out.println(account.getAcBalance());
//		System.out.println(account);
		fis.close();
		ois.close();

	}

}