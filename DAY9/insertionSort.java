public class insertionSort {
    public static void main(String[] args) {
        
        int myArr[]={1,8,5,9,3,7};
        insertionSort(myArr);

    }

    
    public static void insertionSort(int arr[]){
        int n=arr.length;
        for(int i=1; i<n; i++){
            int key=arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;

            }
            arr[j+1]=key;
        }

        System.out.println("Array after insertion sort is ");

        printArr(arr);
    }
    public static void printArr(int arr[]){
        for(int i:arr){
            System.out.print(i+"\t");
        }
    }
}
