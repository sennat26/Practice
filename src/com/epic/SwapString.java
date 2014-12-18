package com.epic;
import java.util.Arrays;


public class SwapString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] s1 = "TEHUNOOL".toCharArray();
		char[] s2 = "ONLEHTUO".toCharArray();

		int i = 0,counter=0;
		System.out.println(Arrays.toString(s1));
		System.out.println(Arrays.toString(s2) + "\n");
		while (i < s2.length) {
			if (s2[i] == s1[i]) {
				i++;
				System.out.println(Arrays.toString(s1));
				counter++;
			} else {
				for (int j = i; j < s1.length - 1; j++) {
					counter++;
					char temp = s1[j];
					s1[j] = s1[j + 1];
					s1[j + 1] = temp;
				}
			}
		}
		System.out.println("\n" + Arrays.toString(s1));
		System.out.println(Arrays.toString(s2));
		System.out.println(counter);

	}

}
