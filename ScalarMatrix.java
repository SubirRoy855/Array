package TwoDimensionalArrays;

public class ScalarMatrix {
	public static void main(String[] args) {
		int[][] arr = ArrayOperations2D.readArray();
		isScalarMatrix(arr);
	}

	public static void isScalarMatrix(int[][] arr) {
		int temp=arr[0][0];
		
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				if ((i == j && arr[i][j] == temp) ||(i!=j && arr[i][j]==0))
					
					count++;
				else
					break;
			}
		}
		if(count==arr.length*arr[0].length)
			System.out.println("it is Scalar matrix");
		else
			System.out.println("not a Scalar matrix");
	}

}
