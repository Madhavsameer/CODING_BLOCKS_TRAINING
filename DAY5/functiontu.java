public class functiontu {
    public static void main(String[] args) {
       System.out.println("The product is "+product(5, 7));
       System.out.println("The sum of these numbers is "+sum(7, 9));
       star(5);
       System.out.println();
       System.out.println("Right triangle");
       righttriangle(5);
       System.out.println();
       System.out.println("First five natural numbers are");
       naturalnumbers(5);
        
    }

    public static int product(int a, int b){
        int p=a*b;
        return p;
    }

    public static int sum(int a, int b){
        int result=a+b;
        return result;
    }
    public static void star(int n)
    {
        for(int i=1; i<=n; i++){
            System.out.print("*");
        }
    }

    public static void righttriangle(int n){
        for(int i=n; i>=1; i--){
            for(int k=1; k<=n-i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void naturalnumbers(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
            System.out.println(sum);
        }

    }
}
