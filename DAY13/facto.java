public class facto {
    public static void main(String[] args) {

        int myArr[]={8,5,6,3,9,7};
        System.out.println(factorial(5));
        System.out.println(sumrec(myArr, 0, 0));
        


    }

    public static int factorial(int n){

        if(n==1) return 1;
        int fact=n*factorial(n-1);
        return fact;
    }

    public static int sumrec(int arr[], int sum, int i){
        if(i==arr.length) return sum;
        sum=sum+arr[i];
        return sumrec(arr, sum, i+1);
    }
}
