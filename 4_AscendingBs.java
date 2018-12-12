public class AscendingBs{

    public int[] ascendingBinary(int n, int[] arr_orig){
        int[] arr_bin = new int[n];
        for(int i=0; i<n ;i++){
            arr_bin[i] = Integer.bitCount(arr_orig[i]);
        }
        
        for(int i=1; i<arr_bin.length;i++){
            int curr_key = arr_bin[i];
            
            int j = i-1;
            
            while(j>=0 && bin_orig[j] < curr_key){
                
            }
        }
        
        
        for(int i=1; i<n; i++){
            
        }
        
        
        return new int[] {};
    }

     public static void main(String []args){
         AscendingBs asb = new AscendingBs();
         asb.ascendingBinary(5, new int[] {5, 3, 7, 10, 14});
     }
}
