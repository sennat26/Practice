package com.epic;

public class PowerOf2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 31;
		if ((n & (n-1)) == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
