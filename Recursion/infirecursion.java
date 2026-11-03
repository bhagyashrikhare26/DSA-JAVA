// when an function calls itself and the not specified the condition the pgm goes to infinity loop of o/p.
public class infirecursion {
    void recursion()
    {
        System.out.println("Gudduu");
        recursion();
    }
    public static void main(String args[])
    {
        infirecursion obj = new infirecursion();
        obj.recursion();
    }
    
}
// it creates stack overflow.
