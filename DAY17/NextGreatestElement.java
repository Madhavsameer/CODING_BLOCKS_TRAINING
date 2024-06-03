import java.util.*;
class NextGreatestElement{
    static int[] rightNGE(int arr[]){
        int[] right= new int[arr.length];
        Stack<Integer> stk= new Stack<>();

        for(int i= arr.length-1; i>=0;i--){
            while(!stk.isEmpty() && stk.peek()<arr[i])
                stk.pop();
            if(stk.isEmpty())
                right[i]=-1;
            else right[i]=stk.peek();
            stk.push(arr[i]);
        }
        return right;
    }

    static int[] leftNGE(int arr[]){
        int[] right= new int[arr.length];
        Stack<Integer> stk= new Stack<>();

        for(int i= 0; i<arr.length;i++){
            while(!stk.isEmpty() && stk.peek()<arr[i])
                stk.pop();
            if(stk.isEmpty())
                right[i]=-1;
            else right[i]=stk.peek();
            stk.push(arr[i]);
        }
        return right;
    }
    public static void main(String arg[]){
        int[] arr= {8,2,7,3,4,6,9};
        int[] right= rightNGE(arr);
        for(int i:right) System.out.print(i+" ");
        System.out.println();
        
        int[] left= leftNGE(arr);
        for(int i:left) System.out.print(i+" ");
    }
}