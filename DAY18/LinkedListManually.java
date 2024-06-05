import java.util.LinkedList;

public class LinkedListManually {

    public class node{
        int data;
        node next;



        node(int d){
            this.data = d;
            this.next=null;
        }

    }

    public class linkedl{
        node head;
        node tail;

        linkedl(){
            this.head=null;
            this.tail=null;
        }

        public void add(int data){
            node curr= new node(data);
            if(head==null){
                head=curr;
                tail=curr;
            }
           
                tail.next=curr;
                tail=curr;
            
        }

        public int remove(){
            node curr=tail;
            node gaurav=head;
            if(head==null){
                return-1;
            }
            if(head.next==null){
                head=null;
                tail=null;
            }
            while(gaurav.next.next!=null){
                gaurav=gaurav.next;
            }
            gaurav.next=null;


            return curr.data;


        }

        public int size(){
            
            if(head==null){
                return -1;
            }
            node curr=head;
            int counter=0;
            while(curr!=null){
            counter++;
            curr=curr.next;
            }

            return counter;
        }

        public void addFirst(int data){
            node front= new node(data);
            if(head==null){
                head=front;
                tail=front;
            }
            front.next=head;
            head=front;

        }

        public void addLasst(int data){
            node end= new node(data);
            if(head==null){
                head=end;
                tail=end;
            }
            end.next=tail;
            tail=end;

        }

        public void clear(){
            this.head=null;
            this.tail=null;
        }

        public static void LlReversal(node head){

            if(head.next==null || head==null){
                return;
            }

            node prev;
            node curr;
            node right;

            prev=null;
            curr=head;
            right=head.next;

            while(curr!= null){
                curr.next=prev;
                curr=right;
                right=curr.next;
            }


        
        }

        

    }

    public int findl(int d){
        node curr=head;

    }

    public static void main(String[] args) {

        LinkedList <Integer> ll= new LinkedList<>();
        ll.add(5);
        ll.add(7);
        ll.add(11);
        System.out.println(ll);
        
    }



    
    
}
