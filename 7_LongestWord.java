public class LongestWord{
    
    public String findWord(String str){
        String[] arr = str.split(" ");
        String currMax = "";
        int maxlen = 0;
        
        
        for(int i=0;i<arr.length;i++){
            int len = arr[i].length();
            int modulo = len%2;
            System.out.print(arr[i]+"  ");
            switch(modulo){
                case 1:
                    System.out.println("Do nothing");
                    break;
                
                case 0:
                    if(len > maxlen){
                        maxlen = len;
                        currMax = arr[i];
                    }
                    System.out.println("");
            }
        }
        
        return currMax;
    }
    

    public static void printArr(String[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"   ");
        }
    }

     public static void main(String []args){
         LongestWord ra = new LongestWord();
         String str =ra.findWord("It is a pleasant day today");
         System.out.println("Longest Word:  "+str);
     }
}
