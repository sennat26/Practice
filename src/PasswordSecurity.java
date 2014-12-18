import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class PasswordSecurity {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		File file = new File("password.txt");
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
		
		String line = bufferedReader.readLine();
		
		while(!line.equals("end")) {
			char[] charArray = line.toCharArray();
			boolean correct = false;
			if (checkForOneVowel(charArray)) {
				if (checkForThreeConsecutiveLetters(charArray)) {
					if (checkForSameLetter(charArray)) {
						correct = true;
					}
				}
			}
			
			if (correct) {
				System.out.println("<" + line + "> is acceptable");
			} else {
				System.out.println("<" + line + "> is not acceptable");
			}
			
			line = bufferedReader.readLine();
		}
	}

	private static boolean checkForSameLetter(char[] charArray) {
		// TODO Auto-generated method stub
		char c = charArray[0];
		for (int i = 1; i < charArray.length; i++) {
			if (c != 'e' && c != 'o' && c == charArray[i]) {
				return false;
			}
			c = charArray[i];
		}
		return true;
	}

	private static boolean checkForThreeConsecutiveLetters(char[] charArray) {
		// TODO Auto-generated method stub
		
		char c = charArray[0];
		int count = 1;
		boolean isVowel = false;
		if (c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u') {
			isVowel = true;
		}
		for (int i = 1; i < charArray.length; i++) {
			char ch = charArray[i];
			if (ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u') {
				if (isVowel) {
					count++;
				} else {
					count = 1;
				}
				isVowel = true;
			} else {
				if (isVowel) {
					count = 1;
				} else {
					count++;
				}
				isVowel = false;
			}
			
			if (count == 3) {
				return false;
			}
		}
		
		return true;
	}

	private static boolean checkForOneVowel(char[] charArray) {
		// TODO Auto-generated method stub
		for (char c : charArray) {
			if (c == 'a' || c == 'e' ||c == 'i' ||c == 'o' ||c == 'u') {
				return true;
			}
		}
		return false;
	}

}
