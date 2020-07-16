package javaTutorial;
import java.util.Scanner;
public class PrimeNumberOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int number = sc.nextInt();
		int i;
		for(i=2;i<number;)
		{
			if(number%i==0)
				break;
			else
				i++;
		}
		if(i==number)
			System.out.println("The Number is a prime Number.");
		else
			System.out.println("The Number is not Prime Number.");

	}

}
