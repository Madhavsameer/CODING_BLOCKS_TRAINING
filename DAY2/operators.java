public class operators {
    public static void main(String[] args) {

        //Arithmetic operators("+" , "-" , "*" , "/" , "%")
        int num1=5;
        int num2=7;
        int sum=num1+num2;
        System.out.println(sum);

        //Relational operators("==" , "!=" , ">" , "<" , "<=" , ">=")
        int x=4;
        int y=5;
        System.out.println(x == y); 

        //Logical Operators("&&" , "||" , "!")
        boolean a = true;
        boolean b = false;
        System.out.println(a && b);

        //Assignment Operators 

        int weight=64;
        weight +=6;
        System.out.println(weight);

        //Ternary Operator

        int number = 10;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + result);




        
    }
    
}
