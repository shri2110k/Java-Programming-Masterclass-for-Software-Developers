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
		
		int intNum = 5 / 2;
		//float floatNum = 5.35;
		// Default folating point num consider as double in java
		//float floatNum = (float) 5.35;
		
		float floatNum = 5f / 2f;
		double doubleNum = 5d / 2d;
		
		System.out.println( intNum + " " + floatNum + " " + doubleNum );
		
		int intNum1 = 5 / 3;
		float floatNum1 = 5f / 3f;
		//double doubleNum1 = 5d / 3d;
		// no need to metion D as java consider floating point num as doub
		double doubleNum1 = 5.00 / 3.00;
		System.out.println( intNum1 + " " + floatNum1 + " " + doubleNum1 );
		//Double is recommonded to use insted float
		
	}

}
