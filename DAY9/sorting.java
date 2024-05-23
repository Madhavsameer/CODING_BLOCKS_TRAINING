import java.util.*;
public class sorting {

    public static void main(String[] args) {
        int myArr[]={1,5,3,8,4,6};
        Arrays.sort(myArr);
        printArr(myArr);

        // bubbleSort(myArr);
        // selectionSort(myArr);
        // insertionSort(myArr);
        

       
    }

    public static void bubbleSort(int arr[]){
        for(int turn =1; turn<arr.length;turn++){
            for(int i=0; i<arr.length-turn; i++){
                if(arr[i]>arr[i+1]){
                    swap(arr, i, i+1);
                }
        }
    }
    System.out.println("Array After Bubble Sort is: ");
        printArr(arr);
}

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int index=minIndex(arr, i);
            swap(arr, i, index);
        }

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

        printArr(arr);
    }



    public static int minIndex(int arr[], int i){
        int minIndex=i;
        for(int j=i+1; i<arr.length; j++){
            if(arr[j]<arr[minIndex]){
                minIndex=j;
            }

        }
        return minIndex;
    }

    


    public static void swap(int arr[], int firstIndex, int secondIndex){
        for(int i=0; i<arr.length; i++){
            int temp= arr[firstIndex];
            arr[firstIndex]=arr[secondIndex];
            arr[secondIndex]=temp;
        }
    }

    public static void printArr(int arr[]){
        for(int i:arr){
            System.out.print(i+"\t");
        }
    }
}
