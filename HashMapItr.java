import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HashMapItr{
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");
        hm.put(4,"four");

        System.out.println("Map contains 3: "+hm.containsKey(3));
        System.out.println("Get english lang for 3: "+hm.get(2));
        Iterator it = hm.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry kvp = (Map.Entry) it.next();
            System.out.println(kvp.getKey()+":"+kvp.getValue()); 
        }
    }
}