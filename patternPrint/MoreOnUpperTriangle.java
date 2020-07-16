package patternPrint;

import java.util.Scanner;

public class MoreOnUpperTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the vlue of n:");
		int n = sc.nextInt();
		int j;
		for(int i=1;i<=n;i++)
//			{for(int j=1;j<=n;j++)
//				if(j>=i)
//					System.out.print("* ");
		{
		for(j=1;j<=(n-i+1);j++)
			{
				System.out.print("* ");
			}
		    System.out.println();
			}

	}

}
