package com.edai.msend;

import java.text.DecimalFormat;

public class MyTest {

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		DecimalFormat fmt = new DecimalFormat("#0.0#%");
		System.out.println(fmt.format(0.2233));
		
		System.out.println(fmt.format(34.555));
		
	}
	
}
