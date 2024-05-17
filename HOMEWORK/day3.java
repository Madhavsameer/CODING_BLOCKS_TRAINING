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
        System.out.println("Hollow Rectangle");
        eighth(5);

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


    //Second pattern left Pyramid
    public static void second(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    //Third Pattern vertically flipped left pyramid

    public static void third(int n){
        for(int i=1;i<=n;i++){
            for(int j=i;j<=n;j++){
                System.out.print("*");
    }
    System.out.println();
}
    }

    //Fourth pattern right pyramid
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

    //Fifth pattern vertically flipped 




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


}
