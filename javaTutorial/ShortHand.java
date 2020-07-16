package javaTutorial;

import java.util.Scanner;

public class ShortHand {

	public static void main(String[] args) {
		// x and y
		Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the two integers:");
	     byte x=sc.nextByte();
	     byte y=sc.nextByte();
	     byte result = (x>y) ? x:y ;
	     System.out.println("The gretter number of "+x+" and "+y+" is : "+result);

	}

}
