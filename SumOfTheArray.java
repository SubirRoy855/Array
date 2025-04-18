package TwoDimensionalArrays;

public class SumOfTheArray {
	public static void main(String[] args) {
		int[][] arr=ArrayOperations2D.readArray();
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
			sum=sum+arr[i][j];
			}
		}
		System.out.println(sum);
	}

}
