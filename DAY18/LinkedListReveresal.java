public class LinkedListReveresal {

    public class node{
        int data;
        node next;
        



        node(int d){
            this.data = d;
            this.next=null;
        }

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

    public static void main(String[] args) {
        
    }


    
}
