
public class Student {

    String name;
    int age;
    int roll;
    char section;
    String branch;
    

     void introduceYourself(){

        System.out.println("Hey User, Your name is: "+ name+" Your age is: "+ age+" Your roll is: "+roll+" of section "+section+" And Your branch is "+branch);

    }

    //Default Constructor
    public Student(){

    }
    public Student (String name){
        this.name=name;
        
    }
    public Student (String name, int age, int roll, char section, String branch) throws Exception {
        this.name=name;
        
        this.age=age;
        if(age<1 || age>50)
        throw new Exception("Age must be greater than one");
        
        this.roll=roll;
        this.section=section;
        this.branch=branch;
    }

    public Student(String name , int age){
        this.name=name;
        this.age=age;
    }

    static{
        System.out.println("Welcome to our game");
    }

    //Static keyword has only 2 properties that is 
    //1. if there is something inside the static block of code then it will be read first as soon a class is invoked
    //2. Static methods/functions are that methods which does not require creating any object to be used or invoked.
    //3. We can't call any normal function  inside a static function
    
}