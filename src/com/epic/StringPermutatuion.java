package com.epic;
public class StringPermutatuion {

	// /**
	// * @param args
	// */
	// public static void main(String[] args) {
	// // TODO Auto-generated method stub
	//
	// String no = "0123456789";
	// char[] noChar = no.toCharArray();
	// permute(noChar, 0, noChar.length);
	// }
	//
	// private static void permute(char[] noChar, int start, int length) {
	// // TODO Auto-generated method stub
	// if (length == start) {
	// for (char c : noChar) {
	// System.out.print(c);
	// }
	// System.out.println();
	// } else {
	// for (int j = start; j < length; j++) {
	// swap(start, j, noChar);
	// permute(noChar, start + 1, length);
	// swap(start, j, noChar);
	// }
	// }
	//
	//
	//
	// }
	//
	// private static void swap(int start, int j, char[] noChar) {
	// // TODO Auto-generated method stub
	// char temp = noChar[start];
	// noChar[start] = noChar[j];
	// noChar[j] = temp;
	// }

	public static void permutation(int n, int perlength, int[] perm) {
		int temp;
		if (n == 0) {
			for (int i = 0; i < 4; i++) {
				System.out.print(perm[i]);
			}
			System.out.println();
		} else {
			for (int count = 0; count < perlength; count++) {
				temp = perm[0];
				perm[0] = perm[count];
				perm[count] = temp;
				permutation(n - 1, perlength, perm);
				temp = perm[0];
				perm[0] = perm[count];
				perm[count] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] base = { 0, 1, 2, 3, 4};
		int[] perm = new int[5];
		perm = base;
		permutation(4, 5, perm);
	}

}
