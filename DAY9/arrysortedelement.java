import java.util.*;
public class arrysortedelement {
    public static void main(String[] args) {
        
      int []  myArr={1,5,3,7,2,8,9};
      arrayPosition(myArr);
    }

    public static void arrayPosition(int arr[]){
      Arrays.sort(arr); //Time complexity of this array.sort is NLogN
     System.out.println( "Element at array first position is "+ arr[0]); 
     System.out.println( "Element at array second position is "+ arr[1]); 
      System.out.println("Element at array last position is "+arr[arr.length-1]);


    }

    
}
