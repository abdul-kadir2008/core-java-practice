package day_01_;

import java.util.Scanner;

public class PerfectNumber {
	void main() {
		Scanner sc = new Scanner(System.in);

		int avg = 40, t_Number = 5, sum = avg * t_Number;

		// After REmoving One Number.
		int avg_2 = 35, t_Number_2 = 4, rem = sum - (avg_2 * t_Number_2);
		System.out.println("Removing Number is" + rem);
	}

}
