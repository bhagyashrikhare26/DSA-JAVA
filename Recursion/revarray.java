// reverse array using recursion used two pointers technique.
/* public class revarray
{
    static void f(int[] array ,int l , int r)
    {
        if(l>=r)
        {
            return ;
        }
        int temp = array[l];
        array[l] = array[r];
        array[r] = temp;
        f(array, l+1, r-1);
    }
    public static void main(String args[])
    {
        int array[]={1,2,3,4,5};
        int n = array.length;
        f(array,0,n-1);
        for(int i =0;i<n;i++)
        {
            System.out.println(array[i]+"");
        }
    }
} */
// one pointer approach 
public class revarray
{
    static void f(int[] array,int i)
    {
        int n = array.length;
        if(i>=n/2)
        {
            return;
        }
        int temp = array[i];
        array[i] = array[n-i-1];
        array[n-i-1] = temp;
        f(array,i+1);
    }
    public static void main(String args[])
    {
        int array[] = {1,2,3,4,5};
        f(array,0);
        for(int i=0;i<array.length;i++)
        {
            System.out.println(array[i]+"");
        }
    }
}
/* userdefined copy pasted try
import java.util.Scanner;

public class revarray {

    static void f(int[] array, int i) {
        int n = array.length;

        if (i >= n / 2) {
            return;
        }

        int temp = array[i];
        array[i] = array[n - i - 1];
        array[n - i - 1] = temp;

        f(array, i + 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] array = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        f(array, 0);

        System.out.println("Reversed Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        sc.close();
    }
}
 */