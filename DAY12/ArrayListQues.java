import java.util.*;
public class ArrayListQues {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        ArrayList <Integer> arr= new ArrayList<>();
        System.out.println("Input the size of the array ");
        int n= arr.size();
        n=s.nextInt();



        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr.add(s.nextInt());
        }

        //Array after sorting is
        Collections.sort(arr);
        System.out.println("Sorted array is: "+arr);

        //Sum of arrayList
        int sum=0;
        for(int i: arr){
            
            sum+=i;
        }
        System.out.println("The sum of the arrayList is"+sum);

        //Smallest and largest number
        int min=arr.get(0);
        int max=arr.get(n-1);
        System.out.println("Minimum element in the array is"+min);
        System.out.println("Maximum elment in the array is"+max);

        //Average of the arrayList
        double avg= sum/n-1;
        System.out.println("The Average of the Array list is"+avg);

        



        
    }
}
