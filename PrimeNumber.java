package TwoDimensionalArrays;

public class PrimeNumber {
	public static void main(String[] args) {
		int[][] arr=ArrayOperations2D.readArray();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(isPrimeNumber (arr[i][j]))
					count++;
			}
		}
		System.out.println("Count of prime number is: "+count);
		
	}
	public static boolean isPrimeNumber(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return true;
			}
			
		}
		return false;
		
	}

}
