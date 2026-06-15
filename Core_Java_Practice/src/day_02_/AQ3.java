//A number is increased by 20% and 
//then decreased by 20%. What is the overall percentage change?
package day_02_;

import java.util.Scanner;

public class AQ3 {
    public static void main(String[] args) 
 {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        double n = sc.nextDouble();
        double increaseNumber = n * (20.0 / 100);
        double afterIncrease = n + increaseNumber;
        double decreaseAmount = afterIncrease * (20.0 / 100);
        double finalNumber = afterIncrease - decreaseAmount;
        double percentageChange = ((finalNumber - n) / n) * 100;
        System.out.println("Final Number : " + finalNumber);
        System.out.println("Overall Percentage Change : " + percentageChange + "%");

      
    }
}