package com.class_07;

import utils.CommonMethods;

public class test extends CommonMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CommonMethods.setUpDriver("firefox", "http://google.com");
		driver.close();

	}

}
