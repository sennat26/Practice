// you can also use imports, for example:
// import java.math.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution111 {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        if (A == null || A.length == 0) {
            return 0;
        }
        
        if (A.length == 1) {
            if (A[0] == -1)
                return 1;
            else 
                return 0;
        } 
        
        int indexVal = A[0];
        int count = 0;
        while (indexVal != -1) {
            count++;
            indexVal = A[indexVal];
        }
        count++;
        
        return count;
    }
}
