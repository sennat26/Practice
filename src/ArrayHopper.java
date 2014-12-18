import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        List<Integer> inputList = new ArrayList<Integer>();
        while (in != null) {
            int val = Integer.parseInt(in);
            inputList.add(val);
            //System.out.println(val);
            try {
                in = sc.nextLine();
            } catch (Exception e){
                in = null;
            }
        }
        
        if (inputList.size() == 0) {
            
            System.out.println("failure\n");
        }
        
        List<Integer> outputList = new ArrayList<Integer>();
        
        int l = 0, curr = 0, ind = 0;
        int size = 0;
        int i;
        
        for (i = 0; i<inputList.size(); i++) {
            if (i > curr) {
                break;
            }
            if (i > l) {
                l = curr;
                size++;
                //System.out.print(ind + ", ");
                outputList.add(ind);
            }
            int s = i + inputList.get(i);
            if (s > curr) {
                ind = i;
            }
            if (curr < s) {
                curr = s;
            }
            
        }
        
        if ((i > l) && (outputList.size() > 0) && (outputList.get(outputList.size() - 1)) != ind) {
            //System.out.print(ind + ", ");
            outputList.add(ind);
            
        }
        
        if (outputList.size() > 0 && l >= inputList.size() -1 ) {
            for(int val : outputList) {
                System.out.print(val + ", ");    
            }
            System.out.print("out\n");
        } else {
            System.out.print("failure\n");
        }
    }
}