package com.udemy.masterclass.firststep;

public class PrimitiveTypeChallenge {

	public static void main(String[] args) {
		
		byte byteNum = 10;
		short shortNum = 16844;
		int intNum = 168445;
		
		long longNum = 50000L + 10L * (byteNum + shortNum + intNum);
		System.out.println("Result : " + longNum);
		
		short shortSum = (short) (50000 + 10 * (byteNum + shortNum + intNum));
		System.out.println("Result : " + shortSum);
		

	}

}
