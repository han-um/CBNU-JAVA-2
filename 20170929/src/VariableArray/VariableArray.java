package VariableArray;

public class VariableArray {

	public static void main(String[] args) {
		int ar[][] = new int[3][];
		ar[0] = new int[1];
		ar[1] = new int[2];
		ar[2] = new int[1];
		
		ar[0][0] = 100;
		ar[1][0] = 200;
		ar[1][1] = 30;
		ar[2][0] = 40;
		
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.print("ar["+i+"] ["+j+"] : " + ar[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
