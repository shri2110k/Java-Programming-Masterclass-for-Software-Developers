package com.udemy.masterclass.firststep;

public class TypeCasting {

	public static void main(String[] args) {
		
		int intMinValue = Integer.MIN_VALUE;
		int total = intMinValue/2;
		
		byte byteMinValue = Byte.MIN_VALUE;
		
		// we are getting error here default whole is consider as int in java
		// byte halfOfNum = byteMinValue/2;
		byte halfOfNum = (byte) (byteMinValue/2); 
		
		short shortMinValue = Short.MIN_VALUE;
		
		short halfOfNumuber = (short) (shortMinValue/2) ;
		
		System.out.println(halfOfNum );
		System.out.println(halfOfNumuber );
		
	}

}
