public class function {

    public static void main(String[] args) {

        name();
        String str=welcome("Aditya");
        System.out.println(str);
        int result=sum(4, 5);
        System.out.println(result);
        
        
    }

    static void name(){
        System.out.println("My name is Madhav");
    }

    static String welcome (String myname){

        return "Welcome to DSA Course "+myname;
    }
    static int sum(int a, int b){
        return a+b;

    }
    
}
