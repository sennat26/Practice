package com.epic;

public class MaximumSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
		
		int maximumSum = 0;
		int max = 0;
		for (int i : a) {
			if (maximumSum + i > i) {
				maximumSum = maximumSum + i;
			} else {
				maximumSum = i;
			}
			
			if (max < maximumSum) {
				max =  maximumSum;
			}
			
		}
		
		System.out.println(max);
//		maximumSum = 1;
//		max = 1;
//		for (int i : a) {
//			if (maximumSum * i > i) {
//				maximumSum = maximumSum * i;
//			} else {
//				maximumSum = i;
//			}
//			
//			if (max < maximumSum) {
//				max =  maximumSum;
//			}
//			
//		}
//		
//		System.out.println(max);

	}

}
