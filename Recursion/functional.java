// sum of the first three no. or sum of n numbers.(Functional)
import java.util.Scanner;
public class functional
{
    static int f(int n)
    {
        if(n==0)
        {
            return 0;
        }
        return (n+f(n-1));
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        System.out.println(f(n));
        sc.close();
        
    }
}