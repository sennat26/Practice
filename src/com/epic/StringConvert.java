package com.epic;
public class StringConvert {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strConverter("zabcde"));
	}

	public static String strConverter(String str) {
		StringBuilder newStr = new StringBuilder();
		int shift = 2; // shift value

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// perform Caesar shift
			if ((ch >= 'a') && (ch <= 'z'))
				ch = (char) ('a' + (ch - 'a' + shift) % 26);
			else if ((ch >= 'A') && (ch <= 'Z'))
				ch = (char) ('A' + (ch - 'A' + shift) % 26);
			// build the string with the shifted char
			newStr.append(ch);
		}
		return newStr.toString();
	}

}
