// Better time complexity is o(N)
public class secondlargest
{
    public static void main(String args[])
    {
        
            int arr[]= {10,20,30};
            int largest = arr[0];
            for(int i=0; i<arr.length ;i++)
            {
                if(arr[i]>largest)
                {
                    largest= arr[i];
                }
            }	 
           // System.out.println("Largest Elememt:"+largest);
        
        int slargest = -1;
        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]>slargest && arr[i]!=largest)
            {
                slargest=arr[i];
            }
        }
        System.out.println("Second Largest Element:"+slargest);
        
    }
    
}

/*Brute force is the first i sort the elements and
goes to the last from-- behind and compare not equal and print 
    array n = [10,20,30];
    largest = a[0];
    for(int i=0; i<n ;i++)
    {
	 if(a[i]>largest)
	 {
		largest= a[i];
	 }
    // brute time complexity is the nlogn+n
    for(int i= arr-2; i>=0;i--)
    {
        if(arr[i]!=largest)
        {
            int secondlargest = arr[i];
            break;
        }
    }
  */