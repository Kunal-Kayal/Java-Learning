package javaTutorial;
import java.util.Scanner;
public class SereseSum {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n = sc.nextInt();
		int i;
		float sum=0f;
		for(i=1;i<=n;i++)
		{
			sum+=(1/(float)i);
		}
		System.out.println("The sum of the sereis up to "+n+" is :"+sum);

	}

}
