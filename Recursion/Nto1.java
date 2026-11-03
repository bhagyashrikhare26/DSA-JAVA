// print in terms of n to 1 opposite fashion like 4,3,2,1.
import java.util.Scanner;
public class Nto1 {
    static void funrecursion(int i , int n)
    {
        if(i<1)
        {
            return;
        }
        System.out.println(i);
        funrecursion(i-1,n); //i-- or i-1   
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter the number to print in reverse n to 1:");
        int n = sc.nextInt();
        funrecursion(n,n); // n and n because the descending (3,3)
        sc.close();
    }
    
}
