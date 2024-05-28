import java.util.ArrayList;
import java.util.Collections;

public class arraylistt {

    //dynamic array

    public static void main(String[] args) {

        //Syntax
        ArrayList <Integer> arr= new ArrayList<>();

        //Add an Element to the list
        arr.add(10);
        arr.add(129);
        arr.add(73);
        arr.add(82);
        arr.add(2,50);

        //Access an element
        System.out.println(arr.get(0));

        //Display an arrayList
        System.out.println(arr);


        //Remove an element
        arr.remove(4);
        System.out.println(arr);


        //Update an element
        arr.set(1,20);
        arr.set(1,arr.get(1)+75);
        System.out.println(arr);


        //size of an arrayList
        System.out.println(arr.size());


        //Sort an arrayList
        Collections.sort(arr);
        System.out.println(arr);


        

    }
}
