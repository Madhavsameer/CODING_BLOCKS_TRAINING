
public class stri {
    public static void main(String[] args) {
        // String s1= "Table";
        
        // System.out.println(s1);
        // System.out.println(s1.substring(2,5));

        
        // System.out.println(checkpal("level"));
        // goodstring("sameer");

        
        System.out.println(stringrev("Hey this is sameer"));
    }

    public static boolean checkpal(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i++)!=str.charAt(j--)){
                return false;
            }
        }

        return true;
    }



    //Find the longest good substring

    public static void goodstring(String str){

        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length();  j++){

                // str.substring(i, j);
                System.out.println(str.substring(i, j));

            }
    }
     
}


    public static String stringrev(String  s){
        s.trim();
        String []arr =s.split("\s+");
        String ans="";
        for(int i=arr.length-1; i>=0; i--){
            ans+=arr[i]+" ";
            
        }
        return ans.trim();
        }
    }


