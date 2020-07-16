package javaTutorial;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		// point co-ordination
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Co-ordination of the point (x,y) respectively: \n");
		byte x = sc.nextByte();
		byte y = sc.nextByte();

		if (x == 0 && y != 0)
			System.out.println("The point lies on x-axis.");
		else if (x != 0 && y == 0)
			System.out.println("The point lies on y-axis.");
		else if (x == 0 && y == 0)

			System.out.println("The point is on the origin.");
		else
			System.out.println("The point is between x and y axis.");

	}

}
