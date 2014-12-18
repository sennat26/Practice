package com.epic;

public class PasswordSequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(checkSeq("a123qs123qsqw"));

	}
	
	
	private static boolean checkSeq(String passwd) {
		for (int index = 0; index < passwd.length(); index++) {
			char c1 = passwd.charAt(index);
			int index2 = passwd.indexOf(c1, index + 1);
			if (index2 != -1) {
				String str1 = passwd.substring(index, index2);
				String str2 = "";
				if ((2 * index2 - index) > passwd.length()) {
					str2 = passwd.substring(index2, passwd.length());
				} else {
					str2 = passwd.substring(index2, 2 * index2 - index);
				}
				
				if(str1.equals(str2)){
					return true;
				}
			}
		}
		return false;
	}

}
