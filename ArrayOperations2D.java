package TwoDimensionalArrays;

import java.util.Scanner;

public class ArrayOperations2D {

	public static int[][] readArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row size: ");
		int rowSize = sc.nextInt();
		System.out.println("Enter the columm size: ");
		int colummSize = sc.nextInt();

		int[][] ar = new int[rowSize][colummSize];

		System.out.println("Enter the value : ");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		return ar;
	}

	public static void displayArray(int[][] ar) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar[i].length; j++) {
				System.out.print(ar[i][j] + " ");

			}
			System.out.println();
		}
	}

}
