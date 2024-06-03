import java.util.Stack;

public class Stacks {

    int [] stack= new int[5];
    int index=-1;

    //Inserting in stack
    void insert(int data){
        if (index==stack.length-1){
            System.out.println("Stack Overflow");
        }

        else{
            index++;
            stack[index]=data;
        
        }
        
    }

    //Removing in stack
    void remove(){
        if(index>=0){
            index--;

        }
        else{
            System.out.println("Stack Underflow");
        }
        
    }

    int size(){
       return this.index+1;
    }


    void display(){
        for(int i=0; i<=this.index;i++){
            System.out.print(stack[i]);
        }
        System.out.println();
    }

    boolean isempty(){
        if(this.index==-1){
            return true;
        }

        return false;
    }

    int peak(){
        if(index<0){
            System.out.println("Stack Underflow");
        }
        return stack[index];
    }

   
    
}
