public class RotateArray{
    
    public int[] rotate(int[] arr_orig, int[] rotate){
        int max = 0;
        int iof_max = -1;
        int[] arr = arr_orig; 
        
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        //System.out.println("MAX:    "+max);
        
        for(int j=0; j<rotate.length; j++){
            for(int k=0; k<rotate[j]; k++){
                for(int i=0; i<arr.length-1; i++){
                if(arr[i+1] == max)
                    iof_max = i;
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                }    
            }
        if(iof_max < 0)
            iof_max = arr.length-1;
        rotate[j] = iof_max;
        }
        
        return rotate;
    }
    
    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+"   ");
        }
    }

     public static void main(String []args){
         RotateArray ra = new RotateArray();
         int[] arr = new int[] {1, 2, 4, 3};
         int[] rot = new int[] {0, 2};
         arr = ra.rotate(arr, rot);
         printArr(arr);
     }
}
