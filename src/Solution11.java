import java.io.*;
import java.util.*;
import java.lang.*;
public class Solution11 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        double q = 0;
        int i = 0;
        int m = 0;
        int ch = 0;
        int count = 0;
        List<String> inputList = new ArrayList<String>();
        while (ch < m || ch == 0) {
            line = reader.readLine();
            if (i == 0) {
                q = Integer.parseInt(line);
            } else if (i == 1) {
                m = Integer.parseInt(line);
            } else {
                String[] split = line.split(" ");
                count+=Integer.parseInt(split[1]);
                int val=Integer.parseInt(split[0]);
                inputList.add(count + " " + val);
                ch++;
            }
            
            
            i++;
        }
        int prev=0; 
        int index=0;
        double k=1;
        List<Integer> outputList = new ArrayList<Integer>();
        while (k<count) {
            double quant = (count*k)/q;
            int quantIndex = (int)Math.ceil(quant);
            for(;index < inputList.size(); index++) {
                String val = inputList.get(index);
                String [] split = val.split(" ");
                
                if(prev < quantIndex && quantIndex <= Integer.parseInt(split[0])) {
                    outputList.add(Integer.parseInt(split[1]));
                    index++;
                    break;
                }
                prev = Integer.parseInt(split[0]);
            }
            if (quantIndex <= count){
                break;
            }
                Collections.sort(outputList);
            for(int out : outputList) {
                System.out.println(out);
            }
        }
    }
}