import java.util.LinkedList;

public class Llsum {
    public static void main(String[] args) {
        
        LinkedList <Integer> ll= new LinkedList<>();
        ll.add(5);
        ll.add(9);
        ll.add(7);
        ll.add(8);
        ll.add(6);

        int sum=0;
        for(int i=0; i<ll.size(); i++){
            sum+=ll.get(i);
        }
        for(int i:ll){
            System.out.print(i +" ");
        }
        System.out.println("The sum of the given linked list is "+sum);
    }
}
