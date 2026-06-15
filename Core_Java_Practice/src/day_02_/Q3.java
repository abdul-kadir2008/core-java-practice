//Write a Java program to create a function countDigits(int n) 
//that returns the total number of digits present in a given number.
package day_02_;
import java.util.Scanner;
public class Q3 {
	
public static void main()
{
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter Your Number :");
int n=sc.nextInt();
System.out.println(countDigits(n));
	}
 static int countDigits(int num)
{
	int count=0;
	while(num!=0)
	{
		num/=10;
		count++;
		
	}
	return count;
}
}
