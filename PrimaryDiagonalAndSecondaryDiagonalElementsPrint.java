package TwoDimensionalArrays;

public class PrimaryDiagonalAndSecondaryDiagonalElementsPrint {
	public static void main(String[] args) {
		int[][] arr=ArrayOperations2D.readArray();
		isPrimaryDiagonalAndSecondaryDiagonalElementsPrint(arr);
	}
	public static void isPrimaryDiagonalAndSecondaryDiagonalElementsPrint(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j || i+j==arr.length-1) {
					System.out.print(arr[i][j] +" ");
				}
					
			}
		}
	}

}
