
public class BinrySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,5,9,15,30,55,96,200,230};
		
		int a = 201;
		
		System.out.println(binarySearch(arr, 0, arr.length - 1, a));

	}
	
	private static int binarySearch(int[] arr, int low, int high, int a) {
		
		if (low > high) {
			return -1;
		}
		
		int mid = low + ((high - low)/2);
		
		if (arr[mid] == a) {
			return mid;
		} else if (arr[mid] > a) {
			return binarySearch(arr, 0, mid - 1, a);
		} else {
			return binarySearch(arr, mid + 1, high, a);
		}
		
		
	}

}
