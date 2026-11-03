public class pattern1
{
    public static void main (String args[])
    {
        int n= 8;
        for(int row=1 ; row<=n; row++)
            // for each row --> n columns
        {
            for(int col=1; col<=n; col++)
            {
                // print star
                System.out.print(" * ");
            }
            // move to next line or row
            //  System.out.println(); OR
            System.out.println("\n");
        }
        
        
    }
}