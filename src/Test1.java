import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        double q = 0;
        int i = 0;
        int m = 0;
        int ch = 0;
        int count = 0;
        List<String> inputList = new ArrayList<String>();
        while (ch < m || ch == 0){
        	line = br.readLine();
           if (i == 0) {
               q = Integer.parseInt(line);
           } else if (i == 1) {
               m = Integer.parseInt(line);
           } else {
               String[] split = line.split(" ");
               count += Integer.parseInt(split[1]);
               int val = Integer.parseInt(split[0]);
               inputList.add(count + " " + val);
               ch++;
           }
            
           i++;
           
        }
        
//        int n = inputList.size();
        int index = 0;
        List<Integer> outputList = new ArrayList<Integer>();
        double k = 1;
        int prev = 0;
        int quantCount = 0;
        while (k < count) {
//        	if (quantCount == q -1){
//        		break;
//        	}
            double quant = (count*k)/q;
            int quantIndex = (int)Math.ceil(quant);
            index=0;
            for (;index < inputList.size(); index++) {
            	String val = inputList.get(index);
            	String[] split = val.split(" ");
            	
            	if (prev < quantIndex && quantIndex <= Integer.parseInt(split[0])) {
            		outputList.add(Integer.parseInt(split[1]));
            		index++;
            		quantCount++;
            		break;
            	}
            	prev = Integer.parseInt(split[0]);
            }
            
            if (quantIndex >= count) {
            	break;
            }
            
            k++;
        }
        
        Collections.sort(outputList);
        
        for(int out : outputList) {
            System.out.println(out);
        }
        
    }
}