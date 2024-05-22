public class day8homes {


    public static void rotateArrayByD(int arr[], int d) {
        if (d > arr.length) {
            d = d % arr.length;
        }
        System.out.println("Array before shifting: ");
        printArray(arr);

        // Reverse the entire array
        reverseArray(arr, 0, arr.length - 1);
    
        // Reverse the first d elements
        reverseArray(arr, 0, d - 1);

        // Reverse the remaining elements
        reverseArray(arr, d, arr.length - 1);
        
    
        System.out.println("Array after shifting: ");
        printArray(arr);
    }
    
    private static void reverseArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    private static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int myArr[]={1,2,3,4,5,6};

        rotateArrayByD(myArr, 7);
    }
    
    
}
