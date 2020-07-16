package arrayProblems;

import java.util.Scanner;

public class MultipicationOfMatrics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of row and column of the first matrics: ");
		int row_first_matrics = sc.nextInt();
		int column_first_matrics = sc.nextInt();
		System.out.print("Enter the value of row and column of the Second matrics: ");
		int row_second_matrics = sc.nextInt();
		int column_second_matrics = sc.nextInt();
		if (column_first_matrics == row_second_matrics) {
			System.out.println("Multipication evailabele:");
			int[][] array_first = new int[row_first_matrics][column_first_matrics];
			int i, j;
			System.out.println("Enter the values of the first matics:");
			for (i = 0; i < row_first_matrics; i++)
				for (j = 0; j < column_first_matrics; j++)
					array_first[i][j] = sc.nextInt();
			int[][] array_second = new int[row_second_matrics][column_second_matrics];
			System.out.println("Enter the values of the second matics:");
			for (i = 0; i < row_second_matrics; i++) {
				for (j = 0; j < column_second_matrics; j++) {
					array_second[i][j] = sc.nextInt();
				}
			}
			int[][] final_array = new int[row_first_matrics][column_second_matrics];
			for (i = 0; i < row_first_matrics; i++) {
				for (j = 0; j < column_second_matrics; j++) {
					int result = 0;
					for (j = 0; j < column_first_matrics; j++) {
						result += array_first[i][j] * array_second[j][i];
					}
					final_array[i][j] = result;
				}
			}
			for (i = 0; i < row_first_matrics; i++) {
				for (j = 0; j < column_second_matrics; j++) {
					System.out.print(final_array[i][j] + "\t");
				}
				System.out.println();
			}
		} else {
			System.out.println("Multipication is not available.");
		}
	}

}
