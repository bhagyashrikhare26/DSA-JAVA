//import java.util.*;
import java.util.Scanner;
public class solidrecpt1
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a rows:");
        int n = sc.nextInt();
        System.out.println("Enter a cloumn:");
        int n1 = sc.nextInt();

 //       int n = 4;     
 //       int n1 = 6;
        
        for(int row=1; row<=n; row++)
        {
        
            for(int col=1; col<=n1; col++) 
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
        sc.close();
    
    }
    
}
