package TwoDimensionalArrays;

public class Transpose {
	public static void main(String[] args) {
		int[][] arr = ArrayOperations2D.readArray();
		isTranspose(arr);
	}

	public static void isTranspose(int[][] arr) {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i+1; j < arr[i].length; j++) {
				

				{
					int temp=arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i]=temp;
				}
			}
		}
		System.out.println("------------------------------");
		ArrayOperations2D.displayArray(arr);
	}

}
