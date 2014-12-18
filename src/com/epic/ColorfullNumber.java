package com.epic;
import java.util.HashSet;
import java.util.Set;


public class ColorfullNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 263;
		
		int base = 10;
		int newNo = no;
		int noOfDigits = 0;
		int finalProduct = 1;
		int prevNo = -1;
		Set<String> list = new HashSet<String>();
		while (newNo > 0) {
			int quo = newNo / base;
			int rem = newNo % base;
			list.add(rem + "");
			noOfDigits++;
			finalProduct = finalProduct * rem;
			if (prevNo == -1) {
				prevNo = rem;
			} else {
				list.add(prevNo * rem + "");
				prevNo = rem;
			}
			newNo = quo;
			
		}
		list.add(finalProduct + "");
		
		if (list.size() == noOfDigits * 2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}
