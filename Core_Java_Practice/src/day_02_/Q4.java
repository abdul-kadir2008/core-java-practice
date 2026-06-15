//Write a Java program to create a recursive function factorial(int n) 
//that calculates the factorial of a given number.
package day_02_;
import java.util.Scanner;
public class Q4 {
public static void main()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Number :");
	int n =sc.nextInt();
	factorial(n);
}
 public static void factorial(int num)
 {
	 int fac =1;
	 while(num!=1)
	 {
		 fac=fac*num;
		 num--;
	 }
	 System.out.println("fabonic Number = " + fac);
 }
}
