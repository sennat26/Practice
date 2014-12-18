
public class FindPath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String input = "SNICKERDOODLE";
		String[] grid = {"SNICKE","NRCRDO","IEKODS","CRDOLE"};
		char[][] check = new char[grid.length][grid[0].length()];
		
		
		findPath(input, grid, 0, 0, check, 0);
		
		for (int i = 0; i < check.length; i++) {
			char[] a = check[i];
			for (char c : a) {
				if(c == '\u0000') 
					System.out.print(".");
				else 
					System.out.print(c);
			}
			System.out.println();
		}
		
		
	}

	private static boolean findPath(String input, String[] grid, int charIndex, int gridIndex, char[][] check, int j) {
		// TODO Auto-generated method stub
		if (!(0 <= gridIndex && gridIndex < grid.length)) {
			return false;
		}
		
		
		if (charIndex == input.length()  || gridIndex == grid.length) {
			return true;
		}
		
		
		char inChar = input.charAt(charIndex);
		
		char[] gridVal = grid[gridIndex].toCharArray();
//		int i  = 0;
//		for (; i < gridVal.length; i++) {
//			if (inChar != gridVal[i]) {
//				break;
//			}
//			charIndex++;
//			
//			boolean track = findPath(input, grid, charIndex, gridIndex, check);
//		}
		
		
		if ((0 <= j && j < gridVal.length) && inChar == gridVal[j] ) {
			check[gridIndex][j] = inChar;
			
			if (findPath(input, grid, charIndex +1 , gridIndex, check,j+1))
				return true;
			
			
			if (findPath(input, grid, charIndex+1, gridIndex+1, check,j))
				return true;
			
			if (findPath(input, grid, charIndex+1, gridIndex, check,j-1))
				return true;
			
			if (findPath(input, grid, charIndex+1, gridIndex-1, check,j))
				return true;
			
			check[gridIndex][j] = '.';
			return false;
			
		}
		
		
		
		
		return false;
	}

}
