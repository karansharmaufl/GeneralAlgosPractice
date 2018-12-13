import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMax {
    
    static int min = 0;
    static int max = 0;
   
    
    public static long[] maxMin(String[] ops, int[] vals){
        PriorityQueue<Integer> pqMin = new PriorityQueue<Integer>();
        PriorityQueue<Integer> pqMax = new PriorityQueue<Integer>(Collections.reverseOrder());
        long[] res = new long[2];
        for(int i=0;i<ops.length;i++){
            String ith = ops[i];
            switch(ith){
                case "PUSH":
                    pqMin.add(vals[i]);
                    pqMax.add(vals[i]);
                    System.out.println("PQ_MIN_PUSH: "+ pqMin);
                    System.out.println("PQ_MAX_PUSH: "+ pqMax);
                    break;
                    
                case "POP":
                    pqMin.remove(vals[i]);
                    pqMax.remove(vals[i]);
                    System.out.println("PQ_MIN_POP: "+ pqMin);
                    System.out.println("PQ_MAX_POP: "+ pqMax);
                    break;
                    
                default:
                    break;  
            }
        }
        return new long[] {getMin(pqMin), getMax(pqMax)};
    }
    
    
    public static long getMin(PriorityQueue<Integer> pqMin){
        min = pqMin.peek();
        return (long)min;
    }

    public static long getMax(PriorityQueue<Integer> pqMax){
        //Collections.reverse(pqMin);
        max = pqMax.peek();
        //Collections.reverse(pqMin);
        return (long)max;
    }

    public static void printArr(long[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"   ");
        }
    }
    
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        long[] res = maxMin(new String[] {"PUSH", "PUSH", "PUSH", "POP"}, new int[] {1, 2, 3, 1});
        printArr(res);
    }
}
