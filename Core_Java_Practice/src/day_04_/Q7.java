//Write a Java program to create a function isPerfect(int n) 
//that checks whether a given number is a Perfect Number or not.
package day_04_;
import java.util.Scanner;
public class Q7 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Your Number : ");
	int n =sc.nextInt();
	isPerfect(n);
}
 static void isPerfect(int n) 
{
	
	int sum=0;
	for (int i=1;i<=n/2;i++)
	{
		if (n%i==0)
		{
			System.out.println("facor : "+i);
			sum=sum+i;
		}
	}
	if(n==sum)
	{
		System.out.println("Your Number is Prime number : "+sum);
	}
	else
	{
		System.out.println("Your Number is not a Prime number : "+sum);	
	}
}
}
