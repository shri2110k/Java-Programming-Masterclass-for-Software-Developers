package com.udemy.masterclass.firststep;

public class VaribleAndExpression {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		System.out.println(num1+ num2);

		int num3 = 10;
		int num4 = 20;
		int num5 = num3 * 2;
		int num6 = num3 + num4 + num5;
		System.out.println(num6);
		
		int finalSum = 1000 - num6;
		System.out.println(finalSum);
	}

}
