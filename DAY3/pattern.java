public class pattern {
    public static void main(String[] args) {
        

        //Rectangle
        for(int i=1; i<=5; i++){
            for(int j=0; j<=4; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        //Pyramid
        for(int i=0; i<=5; i++){

            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
