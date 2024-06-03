import java.util.LinkedList;

public class LinkedLists {

    public static void main(String[] args) {
        LinkedList<Integer> ll= new LinkedList<>();

        ll.add(5);
        ll.add(9);
        ll.add(3);
        ll.addFirst(13);
        ll.add(2,1);
        System.out.println(ll);

        ll.remove();
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll);


        
        System.out.println(ll.contains(9));


        System.out.println(ll.get(1));

        System.out.println(ll.indexOf(1));
        System.out.println(ll.size());


        ll.clear();
        System.out.println(ll);
    }
}
