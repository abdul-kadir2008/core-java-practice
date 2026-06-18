//Write a Java program to create a function findLargest(int a, int b, int c) 
//that returns the largest among three given numbers.
package java_05_;
import java.util.Scanner;
public class Q10 {
public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int [] arr = new int[5];
for (int i=0;i<=2;i++)
{
	System.out.println("Enter Your "+i+" Number ");
	arr[i]=sc.nextInt();
	
}
findLargest(arr[0], arr[1],arr[2]);

}
static void  findLargest(int a, int b, int c)
{
	if(a>b && b>c)
	{
		System.out.println("a is Large number : "+a);
	}
	else if(b>c)
	{
		System.out.println("b is Large number : "+b);
	}
	else
	{
		System.out.println("c is Large number : "+c);
	}
}
}
