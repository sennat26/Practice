// you can also use imports, for example:
// import java.math.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution1 {
    public int solution(int N) {
        // write your code in Java SE 8
        
        
        //N(r) = 1 + 4N + 4 Sum(sqrt(N^2 - i^2)), i = 1 to N
        int count = 1 + (4 * N);
        double tot = 0;
        for (int i = 1; i <= N; i++) {
            int nSq = N * N;
            int iSq = i * i;
            double sqrt = Math.sqrt(nSq - iSq);
            tot = tot + Math.floor(sqrt);
        }
        
        count = count + (4 * (int) tot);
        return count;
    }
}
