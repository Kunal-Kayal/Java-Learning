package javaTutorial;
import java.util.Scanner;
public class MultiDimensionalarray {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int [][] array;
		int i,j;
		System.out.println("Enter the value of row:");
		int row=sc.nextInt();
		System.out.println("Enter the value of column:");
		int column=sc.nextInt();
		array =new int[row][column];
		System.out.println("Enter the values:");
		for(int k=0;k<row;k++)
			for(int l=0;l<column;l++)
				array[k][l]=sc.nextInt();
		System.out.println("The array is:");
		for(i=0;i<row;i++)
			{for(j=0;j<column;j++)
				{System.out.print(array[i][j]+" ");}
		    System.out.println();}

	}

}
