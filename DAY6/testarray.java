public class testarray {
    public static void main(String[] args) {
        
        int []rollNumbers={3,5,13,2};
        String []box ={"Pen","Pencil","Eraser"};
        boolean founditem= searchItem(box, "Pen");
        System.out.println(founditem);

        
        int foundindex=searchRoll(rollNumbers, 5);
        System.out.println("Roll number found at index" +foundindex);

        int foundlargest= findlargest(rollNumbers);
        System.out.println("Largest roll number is " +foundlargest);

        int foundsmallest= findsmallest(rollNumbers);
        System.out.println("Smallest roll number is"+foundsmallest);

        int foundinglargest=findinglargest(rollNumbers);
        System.out.println("Largest number is"+findinglargest(rollNumbers));

        int foundsum=findsum(rollNumbers);
        System.out.println("Sum of roll numbers is"+foundsum);

        int foundsumrange=findsumrange(rollNumbers, 1, 2);
        System.out.println("The sum of the given range is"+foundsumrange);
    }

    public static boolean searchItem(String []b, String item){
        for(int i=0;i<b.length;i++){
            if(b[i]==item)
            return true;
        }
        return false;
    }

    public static int searchRoll(int []r, int getroll){
        for(int i=0;i<r.length;i++){
            if(r[i]==getroll){
                return i;
            }
        }
        return -1;
    }

    public static int findlargest(int []roll){
        int largest=0;
        for(int i=0; i<roll.length;i++){
            if(roll[i]>=largest){
                largest=roll[i];
            }
            else{
                continue;
            }
        }
        return largest;
    }

    public static int findsmallest(int []roll){
        int smallest=Integer.MAX_VALUE;
        for(int i=0; i<roll.length;i++){
            if(roll[i]<smallest){
                smallest=roll[i];
            }
            else{
                continue;
            }
        }
        return smallest;
    }

    public static int findinglargest(int []roll){
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i < roll.length; i++) {
            if (roll[i] > largest) {
                largest = roll[i];
            
        }
        else{
            continue;
        }
    }
    return largest;
    }

    public static int findsum(int []roll){
        int temp=0;
        for (int i = 0; i < roll.length; i++) {
            temp+=roll[i];
        
    }
    return temp;
    }

    public static int findsumrange(int[]roll, int start, int end){
        int sum=0;

        for(int i=start; i<=end; i++){
            sum+=roll[i];
        }
        return sum;
    }


}
