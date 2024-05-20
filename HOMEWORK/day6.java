import java.util.Scanner;
public class day6 {
    public static void main(String[] args) {

        int myArr[]={10,7,18,5,4};
        findElement(myArr, 7);
        findLargest(myArr);
        findSmallest(myArr);
        findSum(myArr);
        findSumInRange(myArr, 2, 4);
        findLargestInRange(myArr, 0, 1);
        findSmallestInRange(myArr, 0, 2);
        arrayElementSwapping(myArr,0,1);
        
        

        
    }

    public static int findElement(int arr[], int target){

        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                System.out.println("You array element "+target+" found at index "+i);
            }

           
        }

        return 1;
        

    }

    public static int findLargest(int arr[]){
        int largestElement=Integer.MIN_VALUE;
      
        for(int i=0;i<arr.length; i++){
            if(arr[i]>largestElement){
                largestElement=arr[i];
            }

        }
        System.out.println("The largest element is "+largestElement);
        return 1;
    }


    public static int findSmallest(int arr[]){
        int smallestElement=Integer.MAX_VALUE;
        
        for(int i=0;i<arr.length; i++){
            if(arr[i]<smallestElement){
                smallestElement=arr[i];
            }

        }
        System.out.println("The Smallest element is "+smallestElement);
        return 1;
    }

    public static void findSum(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];

        }
        System.out.println("The sum of the given array elements is "+sum);
    }

    public static void findSumInRange(int arr[], int start, int end){
        int sum=0;
        for(int i=start; i<=end; i++){
            sum+=arr[i];

        }
        System.out.println("The sum of the given range of elements is "+sum);
    }

    public static int findLargestInRange(int arr[],int start, int end){
        int largestElement=Integer.MIN_VALUE;
      
        for(int i=start;i<=end; i++){
            if(arr[i]>largestElement){
                largestElement=arr[i];
            }
        }
        System.out.println("The largest element in the given range is "+largestElement);
        return 1;
    }

    public static int findSmallestInRange(int arr[],int start, int end){
        int smallestElement=Integer.MAX_VALUE;
      
        for(int i=start;i<=end; i++){
            if(arr[i]<smallestElement){
                smallestElement=arr[i];
            }
        }
        System.out.println("The smallest element in the given range is "+smallestElement);
        return 1;
    }

    public static void arrayElementSwapping(int[] arr, int index1,int index2){
        System.out.print("Array before Swapping: ");
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        int temp=arr[index1];
         arr[index1]=arr[index2];
         arr[index2]=temp;

        System.out.print("Array after Swapping: ");
        for(int i=0;i<arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
    }

    

    

   
    
}
