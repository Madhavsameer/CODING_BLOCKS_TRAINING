public class day3 {
    public static void main(String[] args) {

        System.out.println("Rectangle");
        first(5);

        System.out.println("Right Pyramid");
        second(5);

        System.out.println("vertically flipped Right Pyramid");
        third(5);

        System.out.println("Left Pyramid");
        fourth(5);

        System.out.println("Vertically flipped Left Pyramid");
        fifth(5);

        System.out.println("Sixth pattern leaving two star");
        sixth(5);

        System.out.println("X pattern");
        seventh(4);

        System.out.println("Hollow Rectangle");
        eighth(5);

        System.out.println("Inverted Pyramid");
        nine(5);
        


    }

    //First Pattern Rectangle
    public static void first(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }


    //Second pattern Right Pyramid
    public static void second(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //Third Pattern vertically flipped Right pyramid

    public static void third(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
    }
    System.out.println();
}
    }

    //Fourth pattern left pyramid
    public static void fourth(int n){
    for(int i =1; i<=n; i++){
        for(int j=1; j<=5-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

    //Fifth pattern vertically flipped left Pyramid

    public static void fifth(int n){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //Sixth pattern

    public static void sixth(int n){
        for (int i = 0; i < n; i++) {
           
            for (int j = 0; j < i * 2; j++) {
                System.out.print(" ");
            }
            
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }


    //seventh pattern X
    public static void seventh(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                if(j==i || j==n-i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }





    //Eighth pattern hollow rectangle
    public static void eighth(int n){
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        if (i == 1 || i == n  || j == 1 || j == n ) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
    }

    //inverted pyramid
    public static void nine(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    


}
