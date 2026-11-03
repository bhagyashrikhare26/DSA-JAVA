// print from N to 1 (By backtracking)
import java.util.Scanner;
public class nto1backtracking
{
    static void recursion(int i ,int n)
    {
        if(i>n)
        {
            return;
        }
        recursion(i+1,n);
        System.out.println(i);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number(N to 1):");
        int n = sc.nextInt();
        recursion(1 ,n);
        sc.close();
    }
    
}