package javaTutorial;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the valu to determin it's power:");
		int x = sc.nextInt();
		System.out.println("Enter the value of power:");
		int y = sc.nextInt();
		int i;
		long result = 1;
		for (i = 1; i <= y; i++) {
			result *= x;
		}
		System.out.println("The result:" + x + "^" + y + " = " + result);
	}

}
