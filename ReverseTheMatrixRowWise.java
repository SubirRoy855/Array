package TwoDimensionalArrays;

public class ReverseTheMatrixRowWise {
	public static void main(String[] args) {
		int[][] arr = ArrayOperations2D.readArray();
		isReverse(arr);
		ArrayOperations2D.displayArray(arr);
	}

	public static void isReverse(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int k = arr[i].length - 1;
			for (int j = 0; j < arr[i].length / 2; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[i][k];
				arr[i][k] = temp;
				k--;
			}
		}
		
	}

}
