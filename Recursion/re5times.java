// wap to print Name 5 times.
public class re5times {
   static int count = 0;
    static void name()
    {
        if(count==5)
        {
            return;
        }
        System.out.println("Guddu!");
        count++;
        name();
    }
    public static void main (String args[])
    {
        name();
    }
    
}
