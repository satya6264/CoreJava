package com.vidvaan.files;

import java.io.File;
import java.io.IOException;

public class FilesDemo {
	public static void main(String[] args) {

		try {
			File file = new File("file.txt");
			System.out.println("The application can create file     :: " + file.createNewFile());
			System.out.println("The application can read the file   :: " + file.canRead());
			System.out.println("The application can modify the file :: " + file.canWrite());
			System.out.println("The absolute pathname string        :: " + file.getAbsolutePath());
			System.out.println("The file is a directory             :: " + file.isDirectory());
			System.out.println("The file is a hidden file           :: " + file.isHidden());
//			System.out.println("Deletes the file or directory       :: " + file.delete());
			System.out.println("The file or directory exists        :: " + file.exists());
			System.out.println(file.list());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
