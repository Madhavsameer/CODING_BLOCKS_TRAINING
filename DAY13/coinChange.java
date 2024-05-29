public class coinChange {

    public static void main(String[] args) {
        // coinChange(5, "");
        
        printAsc(5);
        // printAscItr(10, 0);
        // printDscItr(10,0 );
        

    }

    public static void coinChange(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return; 
        }
        coinChange(n-1, ans+"H");
        coinChange(n-1, ans+"T");
    }

    

    public static void printAsc(int n){
        if(n==0) return;

        printAsc(n-1);
        System.out.println(n);
    }

    public static void printDsc(int n){
        if(n==0) return;
        
        System.out.println(n);
        printAsc(n-1);
        
    }

    public static void printAscItr(int n, int i){
        if(i==n) return;

        System.out.println(i);

        printAscItr(n, i+1);
    }

    public static void printDscItr(int n, int i){
        if(i==n) return;
        
        printAscItr(n, i+1);
        System.out.println(i);
        
    }
    
}
