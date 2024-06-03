public class Queues {
    private int arr[];
    private int start,end,currSize,maxSize;
    public static void main(String[] args) {
        
    }

    public Queues(){
        arr=new int[5];
        start=-1;
        end=-1;
        currSize=0;
    }

    public Queues (int n){
        this.maxSize=maxSize;
        arr=new int[maxSize];
        start=-1;
        end=-1;
        currSize=0;
    }

     void addElement(int element){
        if (currSize==maxSize){
            System.out.println("Queue is full");
            System.exit(1);
        }
        if(end==-1){
            start=0;
            end=0;
        }
        else{
            ebd=(end+1)%maxSize;
            arr[end]=element;
            currSize++;
        }

    }

    public int removeElement(){
        if (start==-1){
            System.out.println("Queue Empty");
            System.exit(1);
        }
        int popped=arr[start];
        if(currSize==1){
            start=-1;
            end=-1;
        }
        else{
            start=(start+1)%maxSize;
            currSize--;
            
        }
        return popped;
        
    }

    public int top(){
        if(start==-1){
            System.out.println("Queue Empty");
            System.exit(1);
        }
        return arr[start];
        
    }

    public int size(){
        return currSize;
    }

    public boolean isEmpty(){
        return start ==-1;
    }

    // public void display(){
    //     if(start==-1)
    // }

    


}
