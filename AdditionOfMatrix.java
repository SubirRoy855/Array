package TwoDimensionalArrays;

public class AdditionOfMatrix {

	public static void main(String[] args) {
		int[][] arr = ArrayOperations2D.readArray();
		int[][] brr = ArrayOperations2D.readArray();

		if (arr.length == brr.length && arr[0].length == brr[0].length) {
			int[][] crr = new int[arr.length][arr[0].length];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					crr[i][j] = arr[i][j] + brr[i][j];
				}
			}
			ArrayOperations2D.displayArray(crr);

		} else
			System.out.println("order are not same");
	}

}
