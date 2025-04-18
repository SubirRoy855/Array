package TwoDimensionalArrays;

public class Program2 {
	public static void main(String[] args) {
		
		int[][] arr=new int[3][3];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				
				
			}
			System.out.println();
		}
		
		
		double[][] drr=new double[4][4];

		for(int i=0;i<drr.length;i++) {
			for(int j=0;j<drr[i].length;j++) {
				System.out.print(drr[i][j]+" ");
				
				
			}
			System.out.println();
		}
		
		
		boolean[][] brr=new boolean[5][5];

		for(int i=0;i<brr.length;i++) {
			for(int j=0;j<brr[i].length;j++) {
				System.out.print(brr[i][j]+" ");
				
				
			}
			System.out.println();
		}
		
	}

}
