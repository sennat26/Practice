
public class TwoColorSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,0,1,0,1,1,0,1,0,0};
		int zero = 0;
		int one = 1;
		while (true) {
			
			
			
			while(zero < arr.length && arr[zero] == 0) {
				zero+=2;
			}
			
			
			while(one < arr.length && arr[one] == 1) {
				one+=2;
			}
			
			if (zero < arr.length && one < arr.length) {
				arr[zero] = 0;
				arr[one] = 1;
				zero+=2;
				one+=2;
			} else {
				break;
			}
			
		}
		
		for (int i : arr) {
			System.out.println(i);
		}

	}

}
