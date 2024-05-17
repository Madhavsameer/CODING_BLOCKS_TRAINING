import java.util.Scanner;
public class scanning {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your favourite number");
        int a=s.nextInt();
        System.out.println(a);
        System.out.println("Enter a String");
        String b=s.next();
        System.out.println(b);
        System.out.println("Enter a String");
        String c=s.nextLine();
        System.out.println(c);


    }
    
}
