import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    static int min = 0;
    static int max = 0;
   
    
    public static long[] maxMin(String[] ops, int[] vals){
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        long[] res = new long[2];
        for(int i=0;i<ops.length;i++){
            String ith = ops[i];
            switch(ith){
                case "PUSH":
                    pq.add(ith);
                    System.out.println("PQ_PUSH: ", pq);
                    break;
                    
                case "POP":
                    pq.remove(ith);
                    System.out.println("PQ_POP: ", pq);
                    break;
                    
                default:
                    break;  
            }
        }
        return new long[] {};
    }
    
    
    public static void minmax(PriorityQueue<Integer> pq){
        min = pq.peek();
    }

    public static void printArr(String[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"   ");
        }
    }
    
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        maxMin(new int[] {"PUSH", "PUSH", "PUSH", "POP"}, new int[] {1, 2, 3, 1});
    }
}
