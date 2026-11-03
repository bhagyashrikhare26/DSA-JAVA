// sum of the first three no. or sum of n numbers.(parameterized)
import java.util.Scanner;
public class reparameter 
{
    static void fun(int i , int sum)
    {
        if(i<1)
        {
            System.out.println("Sum:"+sum);
            return;
        }
        fun(i-1,sum+i);
    }
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int i = sc.nextInt();
        fun(i,0);
        sc.close();
    }
}
