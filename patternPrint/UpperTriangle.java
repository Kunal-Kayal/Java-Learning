package patternPrint;

import java.util.Scanner;

public class UpperTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbr of row:");
		int row = sc.nextInt();
		System.out.println("Enter the number of column:");
		int column =sc.nextInt();
		for(int i=1;i<=row;i++)
			{for(int j=1;j<=column;j++)
				if(j>=i)
					System.out.print("* ");
				else
					System.out.print("  ");
		    System.out.println();
			}

	}

}
