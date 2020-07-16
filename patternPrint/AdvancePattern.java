package patternPrint;

import java.util.Scanner;

public class AdvancePattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the vlue of n:");
		int n = sc.nextInt();
		int count =1;
		for(int i=1;i<=n;i++)
			{for(int j=1;j<=n;j++)
				if(j>=(n-i+1))
					{System.out.print(count+"   ");
			       count++;}
				else
					System.out.print("  ");
             System.out.println();
			}

	}

}
