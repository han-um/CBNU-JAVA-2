package DoubleArray;

public class DoubleArray {

	public static void main(String[] args) {
		int ar[][] = {{1,2},{3,4},{5,6}};
		int i,j;
		
		for(i=0; i<ar.length; i++) {
			for(j=0; j<ar[i].length; j++) {
				System.out.print("  " + ar[i][j]);
			}
			System.out.println();
			System.out.println("---------------------");
		}
	}

}
