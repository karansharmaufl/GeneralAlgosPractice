public class MinimumMoves{

    public int minMoves(int[] andrea, int[] maria){
        int len = andrea.length;
        int count = 0;
        
        for(int i=0; i<len; i++){
            String s_an = Integer.toString(andrea[i]);
            String s_ma = Integer.toString(maria[i]);
            for(int j=0; j<s_an.length(); j++){
                // Simply add the absolute difference
                count = count + Math.abs(s_an.charAt(j) - s_ma.charAt(j));
            }
        }
        return count;
    }

     public static void main(String []args){
         MinimumMoves m = new MinimumMoves();
         int moves = m.minMoves(new int[] {1234, 4321}, new int[] {2345, 3214});
         System.out.println("Number of moves:   "+ moves);
     }
}