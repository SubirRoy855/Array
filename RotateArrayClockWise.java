package TwoDimensionalArrays;

public class RotateArrayClockWise {
	public static void main(String[] args) {
		int[][] arr=ArrayOperations2D.readArray();
		
		int[][] brr=UserTranspose.isTranspose(arr);
		
		System.out.println("----------------------------------");
		ReverseTheMatrixRowWise.isReverse(brr);
		
		ArrayOperations2D.displayArray(brr);
		
	}

}
