public class day4 {
    public static void main(String[] args) {

        System.out.println("Square");
        square(5);

        System.out.println("Right Triangle");
        right(5);

        System.out.println("Right Inverted Triangle");
        rightInverted(5);

        System.out.println("Left Triangle");
        left(5);

        System.out.println("Left Inverted Triangle");
        leftInverted(5);

        System.out.println("Hollow Square");
        seventh(5);

        System.out.println("Merged Right");
        mergedright(5);

        System.out.println(" X line");
        eighth(5);
        


    }

    public static void square(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void right(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightInverted(int n){
        for(int i=n; i>=1; i--){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void left(int n){
        for(int i=1; i<=n; i++){
            for(int k=1; k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void leftInverted(int n){
        for(int i=n; i>=1; i--){
            for(int k=1; k<=n-i;k++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void sixth(){

    }

        public static void seventh(int n){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(j==1 || i==1 || j==n || i==n){
                        System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }

                }
                System.out.println();

            }
        }
        public static void eighth(int n){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(j==i || j==n-i+1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        public static void mergedright( int n){
            for(int i=1; i<=n; i++){
                for(int k=1; k<=n-i;k++){
                    System.out.print(" ");
                }
                for(int j=0; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int i=n; i>=1; i--){
                for(int k=1; k<=n-i;k++){
                    System.out.print(" ");
                }
                for(int j=0; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            

        }

    
}
