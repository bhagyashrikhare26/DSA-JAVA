// base condition for the infinity loop stops
public class Baserecursion {
    int count = 0;
    void recursion1()
    {
        // Base condition.
        if(count==3)
        {
            return;
        }
        System.out.println("Guddu!");
        count++;
        recursion1();
    }
    public static void main(String args[])
    {
        Baserecursion obj = new Baserecursion();
        obj.recursion1();
    }
    
}
