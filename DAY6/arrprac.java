

public class arrprac {
    public static void main(String[] args) {

        arrayinit(9);
        
        
    }

    //function for declaration and initialization of array

    public static void arrayinit(int n){
        int []arr= new int [n];
        // arr={1,7,5,2,8};
        for(int i=0; i<=arr.length-1; i++){
            arr[i]=i;
        }


        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i]+"\t");
        }
        
    }

    
}