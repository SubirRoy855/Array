package TwoDimensionalArrays;

public class RotateArrayAntiClockWise {

	public static void main(String[] args) {
	int[][] arr=	ArrayOperations2D.readArray();

		int[][] brr=UserTranspose.isTranspose(arr);
		ColummWiseReverse.isReverse(brr);
		System.out.println("-----------");
		ArrayOperations2D.displayArray(brr);
		
	}

}
