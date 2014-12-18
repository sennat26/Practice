package com.epic;

public class PassowrdCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int enteredPwd = 164;
		int expectedPassword = 18684;
		
		int faultKey = 9;
		
		int enteredNo = enteredPwd;
		int expectedNo = expectedPassword;
		
		
		if (enteredNo == expectedNo) {
			System.out.println("Password Correct");
		} else {
			while (enteredNo > 0 && expectedNo > 0) {
				
				int enteredRem = enteredNo % 10;
				int enteredQuo = enteredNo / 10;
				int expectedRem = expectedNo % 10;
				int expectedQuo = expectedNo / 10;
				if (enteredRem == expectedRem) {
					enteredNo = enteredQuo;
					expectedNo = expectedQuo;
				} else {
					
					if (expectedRem == faultKey) {
						expectedNo = expectedQuo;
					} else {
						System.out.println("Password Wrong");
						System.exit(0);
					}
					
				}
				
			}
			
			
			System.out.println("Password Correct");
			
		}
		
		

	}

}
