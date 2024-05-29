public class recurs {

    public static void main(String[] args) {
        System.out.println("Hii! ");

        
        System.out.println("That factorial of given number is "+factorial(5));
        System.out.println(powerfunction(5, 2));
        System.out.println(powerfunctions(5, 3));
        System.out.println(tailfactorial(4, 1));
        subsequence("CAR", "");
        

    }

    public static int factorial(int n){

        if(n==1){
            return 1;
        }
        int fact=n*factorial(n-1);
        return fact;
    }

    public static int tailfactorial(int n, int ans){
        if(n==0) return ans;
        return tailfactorial(n-1, ans*n);
    }


    public static int powerfunction (int x, int p){ 
        int power=1;
        for(int i=1; i<=p; i++){
            power*=x;
        }
        return power;
    }

    public static int powerfunctions (int x, int p){ 
       if(p==0) return 1;
       int ans= x*powerfunctions(x, p-1);
        return ans;
    }
//eureca moment
    public static int fibonnaci(int n){

        if(n==0 || n==1) return n;
        return fibonnaci(n-1)+fibonnaci(n-2);
        }

    
    public static void subsequence(String str, String ans){

        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch= str.charAt(0);
        subsequence(str.substring(1), ans+ch);
        subsequence(str.substring(1), ans);





    }
    








    }



