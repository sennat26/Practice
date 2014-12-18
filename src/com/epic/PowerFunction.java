package com.epic;

public class PowerFunction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 21;
		int c = pow(a, b);
		System.out.println(c);

	}

	private static int pow(int a, int b) {
		// TODO Auto-generated method stub
		
		if (b == 1) {
			return a;
		} else if (b == 0) {
			return a;
		}
		boolean neg = false;
		if (b < 0) {
			b = b * -1;
			neg = true;
		}
		
		int c = b/2;
		int d = pow(a, c);
		
		if (b%2 == 1) {
			if (neg) {
				return (1/(d * d * a));
			} else {
				return d * d * a;
			}
		} else {
			if (neg) {
				return (1/(d * d));
			} else {
				return d * d;
			}
		}
	}

}
