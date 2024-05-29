public class StringReverse {
    

    public static void main(String[] args) {
        int myArr[]={1,2,1};

        ReversedString("Sam", 0, "");
        sumOfArray(myArr);


        

    }

    public static void ReversedString( String str,int i,String rev){
        if(i==str.length()){
            System.out.println(rev);
            return;
        }
        ReversedString(str, i+1 ,str.charAt(i)+rev);
    }

    public static void sumOfArray(int arr[]){
        int sum=0;
        float length=arr.length;
        for(int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        float average= sum/length;

        System.out.println("Sum of Array is"+sum);
        System.out.println("Avaerage of Array elements is "+average);
    }


    //dry run this
    public static float mean(int arr[], int i){
        if(i==0) return arr[i];

        return (mean(arr, i-1)*i+arr[i])/(float)(i+1);



        
    }
}
