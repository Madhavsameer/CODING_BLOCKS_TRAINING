public class pracday13 {
    public static void main(String[] args) {

        int myArr[]={8,4,2,3,9};
        
        System.out.println(searchRoll(myArr, 9));
        System.out.println(searchRecursiveroll(myArr, 3, 0));
        

    }

    public static int searchRoll(int arr[], int roll){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==roll){
                return i;
            }
        }


        return -1;
    }


    //Search roll using Recursive function

    public static int searchRecursiveroll(int [] arr, int roll, int i){
        if(i==arr.length) return -1;
        if(arr[i]==roll) return i;
        return searchRecursiveroll(arr, roll, i+1);
    }
}
