public class binarySearch {
    
    public static int search(int arr[], int target){

        int i=0; 
        int j=arr.length-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(arr[mid]==target){
                return mid;
            }

            if(arr[mid]>target){
                j=mid-1;
            }
            else{
               i= mid+1;
            }

        }

        return -1;
    }



    public static int lowerBound(int []arr, int target){
        int ans=arr.length;
        int i=0; 
        int j=ans-1;
        
        while (i<j) {
            int mid=(i+j)/2;
            if(arr[mid]<=target){
                ans=mid;
                i=mid+1;
            }

            else{
                j=mid-1;
            }
            
        }



        return ans;
    }

    public static int upperBound(int []arr, int target){

        int i=0; 
        int j=arr.length-1;
        int ans=arr.length;

        while (i<j) {
            int mid=(i+j)/2;
            if(arr[mid]>target){
                ans=mid;
                j=mid-1;
            }

            else{
                i=mid+1;
            }
            
        }



        return ans;
    }




}
