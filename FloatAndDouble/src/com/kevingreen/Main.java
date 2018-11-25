package com.kevingreen;

public class Main {

	public static void main(String[] args) {
		int myIntValue = 5;
		//7 values of precision
		// 32 bits
		float myFloatValue = 5f;
		//16 values of precision
		// 64 bits, faster!!
		double myDoubleValue = 5d;

		double numPounds = 200d;
		double convertedKilograms = numPounds * 0.45359237d;
		System.out.println("Killograms " + convertedKilograms);

	}
}
