// wap to print Linearly from 1 to N using recursion.
// O(N)
import java.util.Scanner;
public class onetoNLinear     
{

    static void recursion(int i,int num)
    {
        // base condition 
        if(i>num)
        {
            return;
        }
        System.out.println("Guddu!"+i);

       // recursive call
        recursion(i+1,num);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter how many times print the name:");
        int num = sc.nextInt();
        recursion(1,num);
        sc.close();
    }
}
