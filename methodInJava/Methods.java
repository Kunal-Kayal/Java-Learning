package methodInJava;

import java.util.Scanner;

class Ball {
	int weight;
}

public class Methods {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eter the two integers:");
		int i_1 = sc.nextInt();
		int i_2 = sc.nextInt();
		int result = maxOf(i_1, i_2);
		System.out.println("The largest number is: " + result);
		System.out.println("Enter the weight of the ball:");
		Ball ball = new Ball();
		ball.weight = sc.nextInt();
		change(ball);
		System.out.println(ball.weight);
		int a[]={1,2,3,4,5};
		arr(a);
	}
	static int[] arr(int[] a) {
		return a;
	}

	// call by value;
	static int maxOf(int a, int b) {
		return (a > b) ? a : b;
	}

	// call by reference;
	static void change(Ball b) {
		b.weight += 3;
	}

}
