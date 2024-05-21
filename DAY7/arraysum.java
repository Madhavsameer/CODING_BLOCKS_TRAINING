public class arraysum {
    public static void main(String[] args) {
        
        int myArr[]={10,15,7,8,5};
        findSumInRange(myArr, 0, 2);
    }

    public static int findSumInRange(int arr[], int start, int end){

        int sum=0;
        for(int i=start; i<=end; i++){
            sum+=arr[i];
        }

        System.out.println("The sum of the given range is "+sum);
        return 1;
    }
    
}
