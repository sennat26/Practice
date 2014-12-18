package com.epic;

public class CombinationString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1, 2, 3, 4, 5};
	    int n = 5;
	    printCombination(arr, n);
	}

	private static void printCombination(int[] arr, int n) {
		// TODO Auto-generated method stub
		 
	    // Print all combination using temprary array 'data[]'
	    combinationUtil(arr, 0, n-1, 0, "");
	    
	}

	private static void combinationUtil(int arr[], int start, int end, int index, String prefix) {
		// TODO Auto-generated method stub
		
		// Current combination is ready to be printed, print it
	 
	    // replace index with all possible elements. The condition
	    // "end-i+1 >= r-index" makes sure that including one element
	    // at index will make a combination with remaining elements
	    // at remaining positions
	    for (int i=start; i<=end; i++)
	    {
	    	prefix = prefix + arr[i];
//	    	System.out.println(i);
	        System.out.println(prefix);
	        combinationUtil(arr, i+1, end, index+1, prefix);
	        prefix = prefix.substring(0, prefix.length() - 1);
	    }
		
	}

}
