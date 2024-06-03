public class ExceptionHandlings {


    String name;
    int age;
    
    public static void main(String[] args) throws Exception {
        ExceptionHandlings eh= new ExceptionHandlings("Madhav", 15);

        

        
        
    }
    public  ExceptionHandlings(String name, int age) throws Exception{
        this.name=name;
        this.age=age;
        System.out.println("Hey User, Your name is: "+ name+" Your age is: "+ age);

    }

    


}
