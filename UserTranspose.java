package TwoDimensionalArrays;

public class UserTranspose {
	public static void main(String[] args) {
		int[][] arr = ArrayOperations2D.readArray();
		isTranspose(arr);
	}

	public static int[][] isTranspose(int[][] arr) {
		int[][] brr=new int[arr[0].length][arr.length];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				

				{
					
					brr[j][i] = arr[i][j];
					
				}
			}
			
		}
		
		return brr;
		
	}


}
