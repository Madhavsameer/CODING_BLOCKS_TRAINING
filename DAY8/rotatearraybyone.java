public class rotatearraybyone {



    public static void shiftByOne(int arr[]){
        int temp=arr.length;
        for(int i=arr.length-1; i>0; i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

        System.out.println("Array after shifting by one  Right is");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void shiftByD(int []arr, int d){

        int temp[]= new int [d];
        //values stored in temp
        for(int i=0; i<d; i++){
            temp[i]=arr[i+(arr.length-d)];
        }

        //shifting array
        for(int i=arr.length-1; i>=d; i--){
            arr[i]=arr[i-d];
        }

        for(int i=0; i<d; i++){
            System.out.print(temp[i]+" ");
        }
        for(int i=d; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }



    }



    public static void main(String[] args) {
        int myArr[]={1,2,3,4,5};

        // shiftByOne(myArr);
        shiftByD(myArr, 2);
    }
}
