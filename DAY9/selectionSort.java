public class selectionSort {
    public static void main(String[] args) {

        int myArr[]={8,3,5,9,7,6};

        selectionSort(myArr);
        
    }

    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            int index=minIndex(arr, i);
            swap(arr, i, index);
        }

        System.out.println("Array after Selection sort is: ");

        printArr(arr);

    }

    public static int minIndex(int arr[], int i){
        int minIndex=i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[j]<arr[minIndex]){
                minIndex=j;
            }

        }
        return minIndex;
    }

    public static void swap(int arr[], int firstIndex, int secondIndex){
        
        int temp= arr[firstIndex];
        arr[firstIndex]=arr[secondIndex];
        arr[secondIndex]=temp;
    }

    public static void printArr(int arr[]){
        for(int i:arr){
            System.out.print(i+"\t");
        }
    }
}
