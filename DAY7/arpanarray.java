public class arpanarray {

    public static void main(String[] args) {
        
        int myArr[]={10,5,7,8,13,5,7,9,5};
        // findLastIndex(myArr, 5);
        findLasterIndex(myArr, 5);

    }

//     public static void findLastIndex(int[]arr, int key){
//         int largestIndex=0;
//     for(int i=0; i<arr.length; i++ ){
        
//         if(key==arr[i]){
//             largestIndex=i;
//         }
        

//     }
//     System.out.println("largest index of key is "+largestIndex);
    
// }

public static void findLasterIndex(int arr[], int targetElement){
    int lastIndex=0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]==targetElement){
            lastIndex=i;
            
        }
    }
    System.out.println(lastIndex);
}

    
}
