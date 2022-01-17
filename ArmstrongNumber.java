/**
 * 
 */
package com.lambda.example;

/**
 * @author akalgutk
 *
 */
public class ArmstrongNumber {

	public static void main(String args[]) {
		int number = 408;
		int remainder;
		int sum = 0;
		int digits = findDigits(number);
		int temp = number;
		while (number > 0) {
			remainder = number % 10;
			sum = (int) (sum + Math.pow(remainder, digits));
			number = number / 10;
		}
		if (sum == temp) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not Armstrong number");
		}

	}

	private static int findDigits(int number) {
		int count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}
		return count;

	}

}
