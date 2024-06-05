import java.util.LinkedList;

public class linkedlistsum {

    public static void main(String[] args) {

        LinkedList<Integer> ll= new LinkedList<>();
        ll.add(5);
        ll.add(9);
        ll.add(8);
        ll.add(7);
        ll.add(11);

        int size=ll.size();
        
        int sum=0;
        for(int i=0;i<size; i++){
            
            sum+=ll.get(i);
        }

        System.out.println(sum);


        



    }
    
}
