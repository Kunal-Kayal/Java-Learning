package string;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the sentence to reverse:");
	  String sentence = sc.nextLine();
	  int i = sentence.length()-1;
	  while(i>=0)
	  {
		  if(sentence.charAt(i)!=' ')
		  {
			  System.out.print(sentence.charAt(i));
		  }
		  else if(sentence.charAt(i)==' ' && sentence.charAt(i+1)!=' ')
		  {
			  System.out.print(sentence.charAt(i));
		  }
		  
		  i--;
	  }
	  

	}

}
