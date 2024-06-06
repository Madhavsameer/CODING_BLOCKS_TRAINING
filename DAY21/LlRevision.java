import java.util.LinkedList;

public class LlRevision {
    public static void main(String[] args) {

        LinkedList <Integer> ll = new LinkedList<>();
        System.out.println(ll.size());
        int arr[]={0,1,2,3,4,5,6};
        for(int i=0; i<arr.length; i++){
            ll.add(arr[i]);
        }
        System.out.println(ll);
        System.out.println();
        
        System.out.println(ll.remove(5));
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        System.out.println(ll.add(9));
        ll.addFirst(5);
        ll.addLast(9);
        System.out.println(ll.size());
        System.out.println(ll.indexOf(9));
        System.out.println(ll.contains(6));
        
        System.out.println(ll);
        
        
        
       
        ll.clear();
        
        


        


    }
}
