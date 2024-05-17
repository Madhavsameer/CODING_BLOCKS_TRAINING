public class patternpractice {
    public static void main(String[] args) {
        // for(int i=0;i<10;i++){
        //     System.out.println("Read");
        //     if(i<5)
        //     System.out.println(i);
        //     else
        //     continue; //continue ussi loop me repeat krta hai
        //     //break //break for loop se bahar chala jaat hai
        //     System.out.println("not read");
        // }



    //    for(int i=0;i<5;i++){
    //     System.out.print("*");
    //    }


        //Rectangle Printing
       for(int i=0; i<5; i++){
        for(int j=0; j<5;j++){
            System.out.print("*");
        }
        System.out.println();
       }

       //Pyramid Printing
       for(int i=1; i<=5; i++){
        for(int j=1;j<=i; j++){
            System.out.print("*");
        }
        System.out.println();
       }
       


    }
    
}
