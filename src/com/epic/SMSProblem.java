package com.epic;

public class SMSProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "2222222#23*777772";
		
		String[] charArray = {"", "ABC", "DEF", "GHI", "JKL", "MON", "PQRS", 
				"TUV", "WXYZ"};

		String finalString = "";
		int count = 0;
		char[] strChar = str.toCharArray();
		for (int i = 0; i < strChar.length; i++) {
			count++;
			if (i+1 < strChar.length) {
				if (strChar[i] == '*') {
					finalString = finalString + " ";
					count = 0;
				} else if (strChar[i] == '#'){
					count = 0;
				} else if (strChar[i] == strChar[i + 1]) {
					continue;
				} else if (count == 1) {
					int no = Integer.parseInt(strChar[i] + "") - 1;
					String aplha = charArray[no];
					finalString = finalString + aplha.charAt(0);
					count = 0;
				} else {
					int no = Integer.parseInt(strChar[i] + "") - 1;
					String aplha = charArray[no];
					int total = aplha.length() + 1;
					int rem = count % total;
					if (rem == 0) {
						finalString = finalString + (no + 1);
					} else {
						char ch = aplha.charAt(rem - 1);
						finalString = finalString + ch;
					}
					
				}
			} else {
				if (i == 0) {
					int no = Integer.parseInt(strChar[i] + "") - 1;
					String aplha = charArray[no];
					finalString = finalString + aplha.charAt(0);
				} else if (strChar[i] != strChar[i - 1]) {
					if (strChar[i] == '*') {
						finalString = finalString + " ";
						count = 0;
					} else if (strChar[i] == '#'){
						count = 0;
					} else {
						int no = Integer.parseInt(strChar[i] + "") - 1;
						String aplha = charArray[no];
						finalString = finalString + aplha.charAt(0);
					}
				} else {
					int no = Integer.parseInt(strChar[i] + "") - 1;
					String aplha = charArray[no];
					int total = aplha.length() + 1;
					int rem = count % total;
					if (rem == 0) {
						finalString = finalString + (no + 1);
					} else {
						char ch = aplha.charAt(rem - 1);
						finalString = finalString + ch;
					}
				}
			}
			
		}
		
		System.out.println(finalString);
		
	}

}
