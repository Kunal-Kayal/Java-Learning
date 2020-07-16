package javaTutorial;

import java.util.Scanner;

public class FibonnaciLoop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Value of n:");
		int n = sc.nextInt();
		int a, b, c;
		int i;
		a = 0;
		b = 1;
		System.out.print(a + " " + b + " ");
		for (i = 1; i <= n - 2; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}

	}

}
