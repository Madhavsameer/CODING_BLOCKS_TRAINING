import java.util.*;

public class booksearching {
    public static void main(String[] args) {

        int myArr[]={10,20,30,40};
        System.out.println(search(myArr, 2));

    }

    public static int arrSum(int arr[]){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static boolean check(int arr[], int pages,int s ){
        int currStudent=1;
        int cSum=0;
        for(int i:arr){
            if(cSum+i<=pages){
                cSum+=i;
            }
            else{
                currStudent++;
                if(currStudent>s ||i>pages)
                return false;
                cSum=i;
            }
        }
        return true;
    }

    public static int search(int books[], int s){
        int ans=-1;

        int i=0;
        int j=arrSum(books);

        while(i<j){

            int mid = i+(j-i)/2;
            if(check(books,mid,s)){
                ans=mid;
                j=mid-1;
            }
            else{
               i= mid+1;
            }

        }

        return ans;
            
    }
}
