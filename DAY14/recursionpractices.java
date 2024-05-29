public class recursionpractices {
    public static void main(String[] args) {
        
        System.out.println("The factorial of the given number is"+factorial(5));
        System.out.println("The value of the power is"+ power(5, 2));
        System.out.println("Ascending Order ");
        printAsc(5);
        System.out.println("Descending order");
        printDsc(10);
        
        
    }

    public static int factorial(int n){
        if(n==1) {
            return 1;
        }

        int fact=n*factorial(n-1);

        return fact;
    }

    public static int power(int x, int p){
        if(p==0){
            return 1;
        }

        int result= x*power(x, p-1);
        return result;
    }

    public static void printAsc(int n){
        if(n==0) return;

        printAsc(n-1);
        System.out.println(n);
    }

    public static void printDsc(int n){
        if(n==0) return;
        System.out.println(n);
        printDsc(n-1);
        
    }

}
