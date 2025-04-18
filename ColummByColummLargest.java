package TwoDimensionalArrays;

public class ColummByColummLargest {
	
		public static void main(String[] args) {
			int[][] arr = ArrayOperations2D.readArray();
			isLargest(arr);
		}

		public static void isLargest(int[][] arr) {

			for (int i = 0; i < arr.length; i++) {
				int big = 0;
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[j][i] > big)
						big = arr[i][j];
				}
				System.out.println(i + "---------------->" + big);
			}

		}

	}


