public class dataTypes {
    public static void main(String[] args) {
        byte num1=2; //Size 1 bytes      
        short num2=10; //Size 2 bytes
        int age=20; //Size 4 bytes
        long num3=15; //Size 8 bytes
        char letter='a'; //Size 2 bytes
        float marks=8.5f;  // Size 4 bytes
        double weight =62.857d; //Size 8 bytes
        boolean isMarried=false; //Size 1 bytes
        String name="Madhav"; //Size depends on length

//Note:Range of any data types can be calculated by keeping power-1 as size in bits on 2
//For example: byte is 1 bytes so 8 bits. So range of int is -2^7 to 2^7 -1 (-128 to 127)

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(age);
        System.out.println(num3);
        System.out.println(letter);
        System.out.println(marks);
        System.out.println(weight);
        System.out.println(isMarried);
        System.out.println(name);

    }
    
}
