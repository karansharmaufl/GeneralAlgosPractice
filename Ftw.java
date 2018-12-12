public class FindTheWinner{

    public String returnWinner(int[] andrea, int[] maria, String gameType){
        int len = andrea.length;
        int s_andrea = 0;
        int s_maria = 0;
        switch(gameType){
            case "Odd":
                for(int i=1;i<len;i=i+2){
                    s_andrea = s_andrea + (andrea[i] - maria[i]);
                    s_maria = s_maria + (maria[i] - andrea[i]);
                }
                break;
                
            case "Even":
                for(int i=0;i<len;i=i+2){
                    s_andrea = s_andrea + (andrea[i] - maria[i]);
                    s_maria = s_maria + (maria[i] - andrea[i]);
                }
                break;
                    
            default:
                System.out.println("No such case exists");
                break;        
        }
        
        return s_andrea > s_maria ? "Andrea" : "Maria";
    }

     public static void main(String []args){
         FindTheWinner ftw = new FindTheWinner();
        String res = ftw.returnWinner(new int[] {1,2,3}, new int[] {2,1,3}, "Even");
        System.out.println("THE WINNER IS "+ res);
     }
}
