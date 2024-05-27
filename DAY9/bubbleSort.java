public class bubbleSort {


    public static void main(String[] args) {
        int myArr[]={8,7,9,5,4,3};
        bubbleSort(myArr);
        
    }

    
    public static void bubbleSort(int arr[]){
        for(int turn = 0; turn < arr.length-1; turn++){
            for(int i = 0; i < arr.length - turn-1; i++){
                if(arr[i] > arr[i + 1]){
                    swap(arr, i, i + 1);
                }
            }
        }
        System.out.println("Array After Bubble Sort is: ");
        printArr(arr);
    }
    
    public static void swap(int arr[], int firstIndex, int secondIndex){
        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }
    
    public static void printArr(int arr[]){
        for(int i : arr){
            System.out.print(i + "\t");
        }
    }
    



}
