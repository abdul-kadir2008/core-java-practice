//Write a Java program to create a function isArmstrong(int n) 
//that checks whether a given number is an Armstrong number or not.
package java_05_;
import java.util.Scanner;
public class Q9 {
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Number : ");
	int num=sc.nextInt();
	isArmstrong(num);
    
}
 static void isArmstrong(int n) {
	int count =0,check=n,copy=n;
	while(check!=0)
	{
		check/=10;
		count++;
	}
	
	int armstronNumber = 0;
	while(n!=0)
	{
		int temp =n%10;
	int result =	(int) Math.pow(temp, count);
	armstronNumber+=result;
	n/=10;
	
	}
	
	if (copy==armstronNumber)
	{
		System.out.println("Your Number is Armstrone Number :" + armstronNumber);
	}
	else
	{
		System.out.println("Your Number is not a Armstrone Number :" + copy);
	}
	
	
}

}
