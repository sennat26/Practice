package com.epic;

public class Triangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawTri(3, 5);
	}
	
	private static void drawTri(int height, int width) {
		for (int i = 1; i <= height; i++) {
			for (int j = 0; j < (i * (width / height)); j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}

}
