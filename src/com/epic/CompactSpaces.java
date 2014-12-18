package com.epic;

public class CompactSpaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "This is  test     and India";
		char[] st = str.toCharArray();
		boolean space = false;
		int swap = 0;
		int j = 0;
		for (int i = 0; i < st.length; i++) {
			if (i < st.length - 1) {
				if (st[i] == st[i+1] && st[i] == ' ') {
					if (space) {
						swap++;
					} else {
						st[i-swap] = st[i];
						j++;
					}
					space = true;
					
				} else if (st[i] != st[i+1] && st[i] == ' ' && space) {
					swap++;
					space = false;
				} else {
					st[i-swap] = st[i];
					j++;
				}
			} else {
				if (st[i] == st[i-1] && st[i] == ' ') {
					if (!space) {
						space = true;
					} else {
						swap++;
					}
				} else {
					st[i-swap] = st[i];
					j++;
				}
			}
		}
		
		st[j] = '\0';
		for (char c : st) {
			System.out.print(c);
		}

	}

}
