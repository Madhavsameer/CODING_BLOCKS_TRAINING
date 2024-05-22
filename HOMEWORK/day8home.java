public class day8home {

    public static void main(String[] args) {

        int myArray[]={1,2,3,4,5};
        // rotateByOne(myArray);
        rotateArrayByD(myArray, 8);

    }

    public static void rotateByOne(int arr[]){

        System.out.print("Array before shifting: ");
        printArray(arr);
        
        int temp= arr[arr.length-1];

        for(int i=arr.length-1; i>0; i--){
            arr[i]=arr[i-1];
        }

        System.out.print("Array after shifting: ");

        arr[0]=temp;

        printArray(arr);



    }

    public static void rotateArrayByD(int arr[], int d){
        if(d>arr.length){
            d=d%arr.length;
        }
        System.out.println("Array before shifting: ");
        printArray(arr);

        //values stored in temp
        int temp[]= new int [d];
        for(int i=0; i<d; i++){
            temp[i]=arr[i+(arr.length-d)];
        }

         //shifting array
         for(int i=arr.length-1; i>=d; i--){
            arr[i]=arr[i-d]; 
        }

        System.out.println("Array After shifting: ");
        for(int i=0; i<d; i++){
            System.out.print(temp[i]+" ");
        }
        for(int i=d; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void printArray(int []arr){
        for(int i:arr){
            System.out.print(i+" \t");
        }
        System.out.println();
    }
    
}
