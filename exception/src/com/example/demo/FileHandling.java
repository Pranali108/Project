package com.example.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\Pratik\\Documents\\BE_SMART.pdf");
		FileInputStream f2 = null;
		
		try {
			System.out.println("File Operation");
			f2=new FileInputStream(f1);
			f2.read();
			System.out.println("File is in read Mode");
			String sr = null;
			System.out.println(sr.charAt(0));
			System.out.println("file found");
		}catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.println("File Not Found");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("String Can not be null");
		}finally {
			f2.close();
			System.out.println("File Close");
		}
	}

}
