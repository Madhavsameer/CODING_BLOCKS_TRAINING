public class arrayreversal {
    public static void main(String[] args) {

        int []myArr={1,2,3,4,5};

        // reverseArray(myArr);
        arrayReversing(myArr);


       
        

    }

    // public static void reverseArray(int []arr){
    //     System.out.println("Array before reversal");
    //     for( int k=0; k<arr.length; k++){
    //      System.out.print(arr[k]+"\t");
    //     }
    //     System.out.println();

    //    int i=0, j=arr.length-1; 
    //    while(i<j){
    //     int temp=arr[i];
    //     arr[i]=arr[j];
    //     arr[j]=temp;
    //     i++; j--;
    //    }

    //    System.out.println("Array after reversal");
    //    for( int k=0; k<arr.length; k++){
    //     System.out.print(arr[k]+"\t");
    //    }
    // }

    public static void arrayReversing(int [] arr){
        int start=0;
        int end=arr.length-1;

        System.out.print("Array before reversal ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ "\t");
        }
        System.out.println();

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

        System.out.print("Array after reversal: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + "\t");
        }




    }
}
