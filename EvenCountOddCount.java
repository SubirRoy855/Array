package TwoDimensionalArrays;

public class EvenCountOddCount {
	public static void main(String[] args) {
		int[][] arr=ArrayOperations2D.readArray();
		isEvenOdd(arr);
	}
	public static void isEvenOdd(int[][] arr) {
		int odd=0;
		int even=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]%2==0) 
					even++;
				else
					odd++;
			}
			
			
		}
		System.out.println("Even count is: "+even);
		System.out.println("Odd count is: "+odd);
				
	}

}
