package com.epic;

public class PrintNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		double startNo = 0;
		int no = 1;
		for (int i = n - 1; i >= 0; i--) {
			startNo = no * (Math.pow(10, i)) + startNo;
			no++;
		}
		
		//System.out.println(startNo);
		int start = (int) startNo;
		//System.out.println(start);
		
		int base = 10;
		double maxNo = 0;
		int maxStart = 10 - n;
		int pow = n - 1;
		for (int i = maxStart ; i < 10; i++) {
			maxNo = i * (Math.pow(10, pow)) + maxNo;
			pow--;
		}
		System.out.println("maxNo " + maxNo);
		while (start <= maxNo) {
			int rem = start % base;
			int quo = start / base;
			for (int next = rem; next <10; next++) {
				System.out.println((quo*base) + next);
			}
			//base = base * 10;
			double nextStart = 0;
			for (int i = n - 1 ; i >= 0; i--) {
				nextStart = 1 * (Math.pow(10, i)) + nextStart;
			}
			//System.out.println(nextStart + "--------------");
			start = start + (int) nextStart;
			
		}
	}

}
