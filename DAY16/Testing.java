public class Testing {


    public static void main(String[] args) {
        Stacks stk= new Stacks();

        stk.insert(7);
        stk.insert(8);
        stk.insert(9);
        stk.insert(5);
        stk.insert(3);
        stk.insert(3);
        stk.display();
        System.out.println(stk.isempty());
        System.out.println(stk.size());
        stk.remove();
        stk.display();
        System.out.println(stk.peak());
        

    }
}
