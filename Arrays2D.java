package JavaCore;

public class Arrays2D {

	public static void main(String args[]) {

		int[][] a = new int[3][3];

		int[][] b = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < b.length; i++) {
			for(int j=0;j<b.length;j++) {
				
				if(i==j) {
					System.out.print(b[i][j]+" ");
				}
			}
			System.out.println();
		}

	}

}
