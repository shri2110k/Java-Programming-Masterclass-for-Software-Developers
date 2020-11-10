package com.udemy.masterclass.firststep;

public class PrimitiveTypes {

	public static void main(String[] args) {
	
		int intMinValue = Integer.MIN_VALUE;
		int intMaxvalue = Integer.MAX_VALUE;
		
		System.out.println("Minumun value of integer: " + intMinValue);
		System.out.println("Maximum value of integer: " + intMaxvalue);
		System.out.println();
		//underflow
		System.out.println("Minumun Bursted value of integer: " + (intMinValue - 1));
		
		//overflow
		System.out.println("Maximum Bursted value of integer: " + (intMaxvalue + 1));
		System.out.println();
		
		//How to cal range? 
		
		/*
		 * integer has 4 byte ie. 8*4=32 
		 * one byte is for storing a sign ie. - or + 
		 * range : 2^31 postive and negative value
		 * as 0 is in positive side
		 * min= 2^31
		 * max=2^31-1
		 */
		
		System.out.println("Lets Check: ");
		
		int base = 2, exponent = 31;

		int result = 1;
		
		while(exponent!= 0) {
			result = result * base;
			exponent--;
		}
        
        System.out.println("Minumun value of integer: " + result);
        System.out.println("Maximum value of integer: " + (result - 1));
        
        
        byte byteMinValue = Byte.MIN_VALUE;
        byte byteMaxValue = Byte.MAX_VALUE;
        System.out.println("Minumun value of byte: " + byteMinValue);
		System.out.println("Maximum value of byte: " + byteMaxValue);
		System.out.println();
		
		short shortMinValue = Short.MIN_VALUE;
		short shortMaxValue = Short.MAX_VALUE;
        System.out.println("Minumun value of short: " + shortMinValue);
		System.out.println("Maximum value of short: " + shortMaxValue);
		System.out.println();
		
		long longMinValue = Long.MIN_VALUE;
		long longMaxValue = Long.MAX_VALUE;
        System.out.println("Minumun value of long: " + longMinValue);
		System.out.println("Maximum value of long: " + longMaxValue);
		System.out.println();
        
		
		long num = 2_147_483_647_123L;
		System.out.println("Long Munber: " + num);
		System.out.println();
		
		float floatMinNum = Float.MIN_VALUE;
		float floatmaxNum = Float.MAX_VALUE;
		System.out.println("Minumun value of float: " + floatMinNum);
		System.out.println("Maximum value of float: " + floatmaxNum);
		System.out.println();
		
		double doubleMinNum = Double.MIN_VALUE;
		double doublemaxNum = Double.MAX_VALUE;
		System.out.println("Minumun value of double: " + doubleMinNum);
		System.out.println("Maximum value of double: " + doublemaxNum);
		System.out.println();
		
		
    }

}
