public class coinChange {

    public static void main(String[] args) {
        coinChange(5, "");
        

    }

    public static void coinChange(int n, String ans){
        if(n==0){

            System.out.println(ans);
            return;
            
        }

        coinChange(n-1, ans+"H");
        coinChange(n-1, ans+"T");
    }
    
}
