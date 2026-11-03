//factorial of the no.(Functional)
import java.util.Scanner;
public class factorial
{
    static int f(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return(n*f(n-1));
    }
    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
        if(n<0)
        {
            System.out.println("Factorial of the Negative no. not defined:");
        }
        else
        {
            System.out.println("Factorial:"+f(n));
        }
        sc.close();
    }
}