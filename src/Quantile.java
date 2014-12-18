import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Quantile {
       public static void main(String args[]) throws IOException
       {
              int q,m;
              ArrayList<Integer> val = new ArrayList<Integer>();
              
              Scanner in = new Scanner(System.in);
              System.out.println("Enter Q");
              q = Integer.parseInt(in.nextLine());
              int[] finalVal = new int[q];
              System.out.println("Enter M");
              m = Integer.parseInt(in.nextLine());
              System.out.println("Enter all values of the elements");
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              for(int i=0;i<m;i++)
              {
                     String value = br.readLine();
                     String[] valueArray = value.split(" ");
                     for(int j = 0;j < Integer.parseInt(valueArray[1]);j++)
                     {
                           val.add(Integer.parseInt(valueArray[0]));
                     }                    
              }
              int n = val.size();
              System.out.println("Size is "+n);
              int getValue = 0,pos = 0;
              for(int k = 0;k < val.size(); k++)
              {
                     getValue = (n*k)/q;
                     System.out.println("GetValue is "+getValue);
                     if(getValue > n)
                     {
                           break;
                     }
                     else if(getValue > 0)
                     {
                           finalVal[pos] = val.get(getValue-1);
                           pos++;
                     }
              }
              Arrays.sort(finalVal);
              for(int f = 0;f<finalVal.length;f++)
              {
                     System.out.println(finalVal[f]);
              }
       }

}
