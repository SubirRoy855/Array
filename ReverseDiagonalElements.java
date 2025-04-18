package TwoDimensionalArrays;

public class ReverseDiagonalElements {
	public static void main(String[] args) {
		int[][] arr=ArrayOperations2D.readArray();
		isReverseDiagonalElements(arr);
	}
	public static void isReverseDiagonalElements(int[][] arr) {
		int f=0;
		int l=arr.length-1;
		while(f<l) {
			int temp=arr[f][f];
			arr[f][f]=arr[l][l];
			arr[l][l]=temp;
			
			
			temp=arr[f][l];
			arr[f][l]=arr[l][f];
			arr[l][f]=temp;
			f++;
			l--;
		}
		System.out.println("-----------------------");
		ArrayOperations2D.displayArray(arr);
	}

}
