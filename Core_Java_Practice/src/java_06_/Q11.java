//Write a Java program to create a function countFrequency(int n, int digit)
//that counts how many times a given digit appears in a number.
package java_06_;
import java.util.Scanner;
public class Q11 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Number :");
	double num = sc.nextInt();
	System.out.println("Enter Your digit For counting :");
	int digit = sc.nextInt();
	countFrequency(num,digit);
	
}
static void countFrequency(double n, int digit) {
	int count =0;
	while(n!=0) {
		int temp = (int) (n%10);
		if(temp==digit)
		{
			count++;
		}
		n/=10;
		
	}
	System.out.println("Digit "+digit+" appears "+count +" times");
}
}
