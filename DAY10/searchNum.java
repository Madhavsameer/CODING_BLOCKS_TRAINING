import java.util.*;
public class searchNum {
    public static void main(String[] args) {
        int[] myArr = {1, 2, 3, 4, 6, 7, 8};

        int mynewArr[]={1,13,9,11,3,6,12,16,9,7,6,20,8,16};
        Arrays.sort(mynewArr);



        binarySearch bs= new binarySearch();
        
        // System.out.println(bs.search(myArr, 5));

        System.out.println(binarySearch.lowerBound(mynewArr, 6));
        System.out.println(binarySearch.upperBound(mynewArr, 6));
    }
}
