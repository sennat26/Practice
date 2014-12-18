package com.epic;

public class MatrixSpiral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matrix =   {{1, 2, 3, 4},
			                {12, 13, 14, 5},
			                {11, 16, 15, 6},
			                {10, 9, 8, 7},
//			                {11, 10, 9, 8},
			                //{17, 18, 19, 20},
               };
		
		int i = 0, j = 0;
		int k = 3, l = 3;
		
		while (i < k && j < l) {
			for (int a = j; a <= l; a++) {
				System.out.println(matrix[i][a]);
			}
			i++;
			
			for (int b = i; b <= k; b++) {
				System.out.println(matrix[b][l]);
			}
			l--;
			for (int c = l; c >= j; c--) {
				System.out.println(matrix[k][c]);
			}
			k--;
			for (int d = k; d >= i; d--) {
				System.out.println(matrix[d][j]);
			}
			j++;
		}
	}

}
