package string;
import java.awt.SecondaryLoop;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the first word:");
		String first_word = sc.nextLine();
		System.out.println("Enter the second word:");
		String second_word =sc.nextLine();
		boolean isAnagrame=true;
		int[] al =new int[256];
//		int[] bl=new int[256];
		for(char c : first_word.toCharArray())
		{
			int index =(int)c;
			al[index]++;
		}
		for(char c : second_word.toCharArray())
		{
			int index =(int)c;
			al[index]--;
		}
		for(int i=0;i<256;i++)
		{
			if(al[i]!=0)
			{
				isAnagrame=false;
				break;
			}
		}
//		if(first_word.length()==second_word.length())
//		{
//			boolean[] visit= new boolean[second_word.length()];
//			for(int i=0;i<first_word.length();i++)
//			{
//				char c= first_word.charAt(i);
//				for(int j=0;j<second_word.length();j++)
//					{if(second_word.charAt(j)==c && !visit[j])
//						{visit[j]=true;
//					    isAnagrame=true;
//				         break;}
//				
//			}
//			if(!isAnagrame)
//				break;
//		}
//		}
		if(isAnagrame)
		{
			System.out.println("Anagramme");
		}
		else
			System.out.println("No Anagramme");
			

	}

}
