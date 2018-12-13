import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DegreeOfArray{

    public int degreeOfArray(int[] arr){
        int max = 0;
        int rval = 0;
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }

        Iterator it = hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry kvp = (Map.Entry) it.next();
            //System.out.println("OBJ     "+kvp);
            //System.out.println("KVP_VAL"+(int)kvp.getValue());
            if(max<=(int)kvp.getValue()){
                max = (int)kvp.getValue();
                rval = (int)kvp.getKey();
            }
                
        }
        return rval;
    }

    public static void main(String[] args){
        DegreeOfArray doa = new DegreeOfArray();
        int[] arr = new int[]{1,2,3,4,4,2,3,5,6,3,3,4,5,6,4,2,3,4,5,6,6,6,7,1,1,1,1,1,1,1,1,1,1,1,1,4,4,4,4};
        int r_doa=doa.degreeOfArray(arr);
        System.out.println("DOA:    "+r_doa);
    }
}