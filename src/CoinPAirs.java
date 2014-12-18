
public class CoinPAirs {
	
	public CoinPAirs() {
		// TODO Auto-generated constructor stub
		int[] A = new int[6];
		A[0] = 1;
		A[1] = 1;  
		A[2] = 1;
		A[3] = 1; 
		A[4] = 1; 
		A[5] = 1;
//		A[6] = 0;
//		A[7] = 0;
//		A[8] = 0;
		System.out.println(solution(A));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CoinPAirs();
	}
	
	
	    int solution(int[] A) {
	        int n = A.length;
	        int result = 0;
	        for (int i = 0; i < n - 1; i++) {
	            if (A[i] == A[i + 1])
	                result = result + 1;
	        }
	        if ((result) == n-1) {
	        	return n-2;
	        }
	        
	        int r = 0;
	        for (int i = 0; i < n; i++) {
	            int count = 0;
	            if (i > 0) {
	                if (A[i - 1] != A[i])
	                    count = count + 1;
	                else
	                    count = count - 1;
	            }
	            if (i < n - 1) {
	                if (A[i + 1] != A[i])
	                    count = count + 1;
	                else
	                    count = count - 1;
	            }
	            r = Math.max(r, count);
	        }
	        return result + r;
	    }


}


