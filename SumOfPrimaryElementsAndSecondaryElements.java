package TwoDimensionalArrays;

public class SumOfPrimaryElementsAndSecondaryElements {
	public static void main(String[] args) {
		int[][] arr = ArrayOperations2D.readArray();
		isSumOfPrimaryAndSecondary(arr);
	}

	public static void isSumOfPrimaryAndSecondary(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j || i + j == arr.length - 1) {
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.println("--------------------------");
		System.out.println("sum of elements is: "+sum);
	}

}
