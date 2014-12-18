// you can also use imports, for example:
// import java.math.*;

// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution3 {
    public int solution(String S1, String S2) {
        // write your code in Java SE 8
        
        if ((S1 == null && S2 == null) || (S1.length() == 0 && S2.length() == 0)) {
            return 0;
        }
        
        if ((S1 != null && S2 == null) || (S1.length() != 0 && S2.length() == 0)) {
            return 1;
        }
        
        if ((S1 == null && S2 != null) || (S1.length() == 0 && S2.length() != 0)) {
            return -1;
        }
        
        
        S1 = S1.toLowerCase();
        S2 = S2.toLowerCase();
        char[] S1Char = S1.toCharArray();
        char[] S2Char = S2.toCharArray();
        int minLen = Math.min(S1Char.length, S2Char.length);
        int i = 0, j =0;
        if (i == j) {
            int k = i;
            int limit = minLen + i;
            while (k < limit) {
                char c1 = S1Char[k];
                char c2 = S2Char[k];
                if (c1 != c2) {
                    if ((c1 - c2) > 0) {
                        return 1;
                    } else if ((c1 - c2) < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
                k++;
            }
        } else {
            while (minLen-- != 0) {
                char c1 = S1Char[i++];
                char c2 = S2Char[j++];
                if (c1 != c2) {
                    if ((c1 - c2) > 0) {
                        return 1;
                    } else if ((c1 - c2) < 0) {
                        return -1;
                    } else {
                        return 0;
                    }
                }
            }
        }
        
        int n1 = S1Char.length;
        int n2 = S2Char.length;
        if ((n1 - n2) > 0) {
            return 1;
        } else if ((n1 - n2) < 0) {
            return -1;
        } else {
            return 0;
        }
        
        
        
    }
}
