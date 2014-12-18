package com.epic;

public class PrintMatrixDiagonally {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16},
                {17, 18, 19, 20},
                //{17, 18, 19, 20},
               };
		
		
		int row = 5;
		int col = 4;
		int i = 0;
		int j = 0;
		for (; i < row; i++) {
			
			int k = i;
			while (k >= 0 && j < col && k < row) {
				System.out.print(matrix[k][j] + "\t");
				k--;
				j++;
			}
			j = 0;
			System.out.println();
			
		}
		int start = i - 1;
		for (j = 1; j < col; j++) {
			int k = start;
			int y = j;
			while (k >= 0 && y < col && k < row) {
				System.out.print(matrix[k][y] + "\t");
				k--;
				y++;
			}
			start = i - 1;
			System.out.println();
		}

	}

}
