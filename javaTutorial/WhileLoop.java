package javaTutorial;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = sc.nextInt();
		int num = number;
		int reverse = 0, temp;
		int digit = (int) Math.log10(number) + 1;
		while (number > 0) {
			temp = number % 10;
			reverse += temp * (int) Math.pow(10, (digit - 1));
			number /= 10;
			digit--;
		}
		if (num == reverse)
			System.out.println("This is a palindrome number.");
		else
			System.out.println("This is not a palindrome number.");

	}

}
