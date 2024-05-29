public class recprac {

    public static void main(String[] args) {

       System.out.println(recursivefact(4));
       
        


    }

    public static void factorial(int n){
        for(int i=n-1; i>0; i--){
            n*=i;
        }
        System.out.println(n);
    }

    public static int recursivefact(int n){
        if(n==1) return 1;
        int fact=n*recursivefact(n-1);
        return fact;

        
        }

    }




    
    

