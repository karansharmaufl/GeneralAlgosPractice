opublic class SubarraySum{
    
    public int subarraySum(int[] arr){
        int sum = 0;
        int n = arr.length;
        for(int i=0;i<arr.length;i++){
            sum += arr[i]*(n-i)*(i+1);
        }
        return sum;
    }

     public static void main(String []args){
         SubarraySum sam = new SubarraySum();
         int ans = sam.subarraySum(new int[] {1, 2, 3});
         System.out.println("Subarray Sum:    "+ans);
         
     }
}
