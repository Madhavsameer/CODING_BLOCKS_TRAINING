import java.util.Scanner;

public class hey {
    public static void main(String[] args) {
        
        System.out.println("Hello");
        int a=7,b=5;
        System.out.println(a+b);
        if(a<7){
            System.out.println("Your Sum is less than 10");
        }
        else{
            System.out.println("Your sum is greater or equal to 10");
        }


        int evensum=0;
        int oddsum=0;
        int totalsum=0;
        for(int i=1; i<=10; i++){
            if(i%2==0){
                System.out.println(i+" is even number");
                evensum+=i;

            }

            else{
                System.out.println(i +" is odd number");
                oddsum+=i;
            }
            totalsum=evensum+oddsum;
        }
        System.out.println("The sum of all Even numbers is "+evensum);
            System.out.println("The sum of odd number is "+oddsum);
            System.out.println("The total sum of the given number is"+totalsum);

            // createArr();
            patternprint(5);
    }
    public static void createArr(){
        System.out.println("Enter the size of the array");
        Scanner s= new Scanner(System.in);
        int size=s.nextInt();
    int myArr[]=new int [size];
    System.out.println("Enter the elements of array");
    for(int i=0; i<size; i++){
        myArr[i]=s.nextInt();
    }

    System.out.println("Your array is");
    for(int i:myArr){
        System.out.println(i);
    }

}


    public static void patternprint(int n){

        for(int i=0; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    


}
