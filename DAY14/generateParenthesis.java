public class generateParenthesis {
    public static void main(String[] args) {
        gp(3, 0, 0, "");
        
    }

    public static void gp(int n, int open, int close, String ans){
        if(open ==n && close ==n){
            System.out.println(ans+ " ");
        }
        if(open>n || close>open){
            return;
        }
        gp(n, open+1, close, ans+"(");
        gp(n, open, close+1, ans+ ")");
    }
}
