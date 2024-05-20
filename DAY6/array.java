import java.util.Scanner;
public class array {
    public static void main(String[] args) {

        //creation of an array
        int []myarr= new int[5];
        Scanner s=new Scanner(System.in);

        System.out.println("Input the Array Elements");
        for(int i=0; i<=myarr.length-1; i++){
            myarr[i]=s.nextInt();

        }

        System.out.println("The array Elements are:- ");
        for(int i=0; i<=myarr.length-1; i++){
            System.out.print(myarr[i]+ "\t");
        }
        System.out.println();

        System.out.println("My 2d array is");
        myarr2();
    }

    

    

    //2d array
    public static void myarr2(){
        int [][]arr2={{2,3},{4,7},{8,5}};

        for(int i =0; i<=arr2.length-1; i++){
            for(int j=0;j<2; j++){
                System.out.print(+arr2[i][j]);
            }
            System.out.println();
        }

    }
    
    


    
}
