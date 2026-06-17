//Write a Java program to find the second largest element in an 
//integer array without sorting the array.
package day_03_;
import java.util.Iterator;
import java.util.Scanner;
public class Q6 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter How Many Number's in Your Array : ");
	int n=sc.nextInt();
	int[] arr = new int[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter Your "+(i+1)+" Element : ");
		arr[i]=sc.nextInt();
		
	}
int	firstLarge=arr[0],secondLarge=arr[1];
if(firstLarge<arr[1])
{
	int temp=secondLarge;
	secondLarge=firstLarge;
	firstLarge=temp;
	
}
	for (int i=2;i<n;i++)
		
	{
		if(secondLarge<=arr[i])
		{
			secondLarge=arr[i];
			if(firstLarge<arr[i])
			{
				int temp=secondLarge;
				secondLarge=firstLarge;
				firstLarge=temp;
				
			}
				
		}
		
	}
	System.out.println("First Large Number is : "+firstLarge);
	System.out.println("Second Large Number is : "+secondLarge);
	
}
}
