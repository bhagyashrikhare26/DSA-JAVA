// prit linearly from 1 to N (But by Backtracking).

import java.util.Scanner;

public class onetonbacktracking { 
    void recursion(int i , int n)
    {
        if(i<1)
        {
            return;
        }
        recursion(i-1,n); 
        System.out.println(i);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Nunmber(1 to n):");
        int n = sc.nextInt();
        onetonbacktracking obj = new  onetonbacktracking();
        obj.recursion(n,n);
        sc.close();
    }
} 