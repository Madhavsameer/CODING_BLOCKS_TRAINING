import java.util.HashMap;
import java.util.Map;

public class HashTables {

    //Syntax of Hashmap
  //  Map<T, T> mp = new HashMap<>(); 
  //Where T is a Datatype of Wrapper class
  //First T is for Key and Second T is for Value

    public static void main(String[] args) {

        String myArr[]={"Gaurav", "Sameer", "Raushan"};

        Map <Integer, String> stu= new HashMap<>();

        Map <Character, String> stud= new HashMap<>();
        
        
        
        System.out.println(stu.containsKey(3));
        for(int i=1; i<=myArr.length; i++){
            stu.put(i,myArr[i-1]);
        }
        stu.put(4, "Aditya");
        System.out.println(stu);

        for(char i=0; i<myArr.length; i++){
            stud.put((char)(97+i),myArr[i]);
        }
        System.out.println(stu.get(1));

        System.out.println(stud);


        //Display Our Hashmap
        for(Map.Entry<Integer, String> entry: stu.entrySet()){
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }
  
        
    }
}