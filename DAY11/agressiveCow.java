public class agressiveCow {
public static void main(String[] args) {
    

}


public static int search(int arr[], int s){
    int ans=arr[0];

    int i=0;
    int j=arr.length-1;

    while(i<j){

        int mid = i+(j-i)/2;
        if(check(arr,mid,s)){
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
