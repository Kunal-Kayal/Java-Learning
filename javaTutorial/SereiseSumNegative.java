package javaTutorial;

import java.util.Scanner;

public class SereiseSumNegative {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		int i, j;
		int result = 1;
		float sum = 0f;
		for (i = 1; i <= n; i++) {
			for (j = 1; j < i; j++)
				result *= (-1);
			sum += result * (1 / (float) i);
		}
		System.out.println("The sum of the sereis up to " + n + " is :" + sum);

	}

}
