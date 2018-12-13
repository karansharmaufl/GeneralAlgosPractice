import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BalanceChars {
    
    static int min = 0;
    static int max = 0;
    
    
    public  boolean checkBal(String str, int reps){
        int count = 0;
        boolean b;
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '<'){
                st.push('<');
            }else{
                if(!st.isEmpty() && st.peek()=='<'){
                    st.pop();
                }else if(!st.isEmpty() && st.peek()=='<'){
                    ++count;
                }else if(st.isEmpty()){
                    ++count;
                }
            }
        }
        if(count<=reps){
            b=true;
        }else{
            b=false;
        }
        return b;
    }
    
 

    public static void printArr(long[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"   ");
        }
    }
    
    
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        BalanceChars bchs = new BalanceChars();
        System.out.println("PRINT:  "+bchs.checkBal("<<<>><>>",0));
    }
}
