package TwoDimensionalArrays;

public class ColummWiseReverse {
	public static void main(String[] args) {
		int[][] arr = ArrayOperations2D.readArray();
		isReverse(arr);
		ArrayOperations2D.displayArray(arr);
	}

	public static void isReverse(int[][] arr) {
		int k = arr.length - 1;
		for (int i = 0; i < arr.length / 2; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				int temp = arr[i][j];
				
				arr[i][j] = arr[k][j];
				arr[k][j] = temp;
			}
			k--;
		}
		System.out.println("-----------------------------------");
		
	}

}
