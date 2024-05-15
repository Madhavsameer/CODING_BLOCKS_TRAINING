import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your age");
        int age=s.nextInt();
        if(age<5){
            System.out.println("You are an infant");
        }
        else if (age>6 && age<15) {
            System.out.println("You are a child");
            
        } else {
            System.out.println("You are an adult");
            
        }
    }

    
}