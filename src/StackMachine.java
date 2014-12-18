// you can also use imports, for example:
// import java.math.*;
import java.util.Stack;
// you can use System.out.println for debugging purposes, e.g.
// System.out.println("this is a debug message");

class StackSolution {
    public int solution(String S) {
        // write your code in Java SE 8
    	if (S == null || S.length() == 0) {
            return -1;
        }
        
    	
        Stack<Integer> stackList = new Stack<Integer>();
        char[] charArray = S.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == '+') {
                if (stackList.size() > 1) {
                    int val1 = stackList.pop();
                    int val2 = stackList.pop();
                    stackList.push(val1 + val2);
                } else {
                    return -1;
                }
            } else if (c == '*') {
                if (stackList.size() > 1) {
                    int val1 = stackList.pop();
                    int val2 = stackList.pop();
                    stackList.push(val1 * val2);
                } else {
                    return -1;
                }
            } else {
                stackList.push(c - '0');
            }
            
        }
        
        return stackList.pop();
    }
}
