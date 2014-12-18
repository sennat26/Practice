package com.epic;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String word = "This is great";
		char[] wordArray = reverse(word);
		String reverse = "";
		String w = "";
		for (int i = 0; i < wordArray.length; i++) {
			if (wordArray[i] == ' ') {
				reverse = reverse + getString(reverse(w)) + " ";
				w = "";
			} else if (i == wordArray.length - 1) {
				w = w + wordArray[i];
				reverse = reverse + getString(reverse(w));
				w = "";
			} else {
				w = w + wordArray[i];
			}
		}
		
		System.out.println(reverse);
	}
	
	private static char[] reverse(String word) {
		int i = 0;
		int j = word.length() - 1;
		char[] charArray = word.toCharArray();
		while (i < j) {
			char a = charArray[i];
			charArray[i] = charArray[j];
			charArray[j] = a;
			i++;
			j--;
		}
		
		return charArray;
		
	}
	
	private static String getString(char[] word) {
		String a = "";
		for (int i = 0; i < word.length; i++) {
			a = a + word[i];
		}
		return a;
	}

}
