//Write a Java program to create a function isPalindrome(int n) 
//that checks whether a given number is a palindrome or not.
package day_03_;
import java.util.Scanner;
public class Q5 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Number : ");
	int n= sc.nextInt();
	isPalindrome(n);
	
}
static void isPalindrome(int num)
 {
	 int copy =num,rev=0,rem;
	 while(num!=0)
	 {
		 rem=num%10;
		 rev=rev*10+rem;
		 num/=10;
		 
	 }
	 if(rev==copy)
	 {
		 System.out.println(rev+" is Palindrome Number.");
		 
		 
	 }
	 else 
	 {
		 System.out.println(copy+" is not a Palindrome Number.");
	 }
 }

}
