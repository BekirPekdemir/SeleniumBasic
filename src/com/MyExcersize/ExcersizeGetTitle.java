package com.MyExcersize;

import utils.CommonMethods;

public class ExcersizeGetTitle extends CommonMethods{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://www.saucedemo.com/";
		setUpDriver("chrome", url);
		String title=driver.getTitle();
		System.out.println(title);
	}

}
