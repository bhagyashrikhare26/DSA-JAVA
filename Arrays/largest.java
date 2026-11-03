// optimal
//package practiceStriver.Arrays;

public class largest 
{
    public static void main (String args[])
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
		System.out.println("Largest Elememt:"+largest);
	}	
	
    
}
 /* in the 0ptimal solution 
 sort the array first and then print arr(n-1)
 last index element is largest. any sorting array time complexity is O(n log n) 
 and space complexity is O(1) as quick sort is apply in the sorting 
 array n = [10,20,30];
 largest = a[0];
 for(int i=0; i<n ;i++)
 {
	 if(a[i]>largest)
	 {
		largest= a[i];
	 }
System.out.println("Largest Element:"+largest);	 
 }
 
in brute force i compare each element in the array like bubble sort .*/