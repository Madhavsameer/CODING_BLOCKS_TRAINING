public class ClassRoom {
    

    public static void main(String[] args) {
        
        Student s= new Student();
        s.name="Madhav";
        s.age=22;
        s.roll=97;
        s.section='B';
        s.branch="CSE";
        s.introduceYourself();

        Student sam=new Student("Sameer");
        sam.introduceYourself();

        Student adi= new Student("Aditya", 21, 97,'B',"CSE");
        adi.introduceYourself();


    }
}
