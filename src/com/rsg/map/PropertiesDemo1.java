package com.rsg.map;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo1 {

	public static void main(String[] args) throws IOException {
		
		Properties properties = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Ravindra Singh\\java\\javamay2024\\abc.properties");
		properties.load(fis);
		String userName = properties.getProperty("user");
		System.out.println(userName);
		
		properties.setProperty("user2", "root");
		FileOutputStream fos = new FileOutputStream("C:\\Ravindra Singh\\java\\javamay2024\\abc.properties");
		properties.store(fos, "updated by ravindra");

	}

}
