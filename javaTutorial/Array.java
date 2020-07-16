package javaTutorial;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
      int array[]= {1,2,3,4,5};
//      System.out.println(array[2]);
//      for(int i=0;i<array.length;i++)
//      {
//    	  System.out.println(array[i]);
//      }
      int i;
      int[] age =new int[5];
      for(i=0;i<5;i++)
      {
    	  age[i]=sc.nextInt();
      }
      for(i=0;i<array.length;i++)
      {
    	  System.out.print(array[i]);
      }
	}

}
