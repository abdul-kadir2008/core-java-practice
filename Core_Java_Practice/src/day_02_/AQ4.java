//A shopkeeper buys an item for ₹800 and sells it for ₹960.
//Find the profit percentage.
package day_02_;
import java.util.Scanner;
public class AQ4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Buy Price : ");
	float buyPrice=sc.nextInt();
    System.out.println("Enter Your Selling Price : ");	
    float sellPrice=sc.nextInt();
    float profit=sellPrice-buyPrice;
    float profitePercentage=(profit/buyPrice)*100;
    System.out.println("Total profit Precent is :"+profitePercentage);
}
}
