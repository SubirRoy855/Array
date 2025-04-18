package TwoDimensionalArrays;

public class LargestElements {
	public static void main(String[] args) {
		int[][] arr=ArrayOperations2D.readArray();
		isLargest(arr);
	}
	public static void isLargest(int[][] arr) {
		int big=arr[0][0];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]>big)
					big=arr[i][j];
			}
		}
		System.out.println("The largest elements is: "+big);
	}

}
