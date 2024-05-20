public class pattern {
    public static void main(String[] args) {
        
        //first
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.println("*");
        //     }
        //     System.out.println();
        // }


        //second
        int n=5;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.println("*");
            }
            System.out.println();
        }
        
    }
}
