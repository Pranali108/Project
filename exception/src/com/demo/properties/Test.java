package com.demo.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws IOException {
		File f1 = new File("C:\\Users\\Pratik\\Documents\\J55\\exception\\src\\com\\setdemo\\e\\db.properties");
		FileInputStream f2 = new FileInputStream(f1);
		Properties p1 = new Properties();
		p1.load(f2);
		
		System.out.println(p1.getProperty("url"));
		System.out.println(p1.getProperty("user"));
		System.out.println(p1.getProperty("password"));
		System.out.println(p1.getProperty("driver"));
		
		
				
	}
}
