package javaTutorial;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// fractorial
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of n:");
		int n = sc.nextInt();
		long result = 1;
		int i;
		for (i = 1; i <= n; i++) {
			result *= i;
		}
		System.out.println("The result is " + n + "! =" + result);

	}

}
