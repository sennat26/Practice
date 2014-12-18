
public class PivotedBinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr = {23, 45, 78, 88, 100, 236, 2, 9, 12, 20};
		int[] arr = {23, 45, 78, 88, 100, 236	};
		
		int a = 45;
		
		
		int index = findPivot(arr, 0, arr.length - 1);
		System.out.println("Pivot : " + index);
		if (index == arr.length - 1)
			System.out.println(binarySearch(arr, 0, arr.length - 1, a));
		else if (arr[index] == a)
			System.out.println(index);
		else if (arr[0] < a && arr[index] > a) 
			System.out.println(binarySearch(arr, 0, index - 1, a));
		else 
			System.out.println(binarySearch(arr, index + 1, arr.length - 1, a));
		
//		System.out.println(binaryPivotedSearch(arr, 0, arr.length - 1, a));

	}

	private static int findPivot(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		
		if (high < low) {
			return -1;
		}
		
		if (low == high) {
			return low;
		}
		
		int mid = low + ((high - low)/2);
		
		if (arr[mid] > arr[mid + 1] && mid < high)
			return mid;
		else if (arr[mid] < arr[mid - 1] && mid > low)
			return mid - 1;
		
		if (arr[low] >= arr[mid])
			return findPivot(arr, low, mid - 1);
		else 
			return findPivot(arr, mid + 1, high);
		
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
