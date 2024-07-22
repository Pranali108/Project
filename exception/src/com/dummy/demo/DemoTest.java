package com.dummy.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoTest {

	//public static void main(String[] args) throws IOException{
		
//		File f1 = new File("C:\\Users\\Pratik\\Documents\\BE_SMART.pdf");
//		FileInputStream f2 = null;
//		try {
//			f2 = new FileInputStream(f1);
//			System.out.println("File Found");
//		} finally {
//			// TODO: handle finally clause
//			f2.close();
//			System.out.println("Hello finally block");
//		}
		public static void main(String[] args) throws FileNotFoundException, IOException{
			try(FileInputStream f1 = new FileInputStream("Hello")){
				
				
				f1.close();
		}
		
	}
}
