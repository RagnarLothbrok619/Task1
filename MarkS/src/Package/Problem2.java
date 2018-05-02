package Package;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int fibrange = 0, result;

		System.out.println("Enter the range: ");
		fibrange = scan.nextInt();

		System.out.println("Sum: ");
		result = calculatefibSum(fibrange);
		if (result == 0) {
			System.out.println("No even numbers in the given range");
		} else if (result == -1) {
			System.out.println("Fibonacci value exceeded 4 million!");
		} else {
			System.out.println(result);
		}
	}

	public static int calculatefibSum(int fibrange) {

		int n1 = 0, n2 = 1, n3, i, sum = 0;
		short flag1 = 0, flag2 = 0;
		for (i = 2; i < fibrange; ++i) {
			n3 = n1 + n2;
			if (n3 > 4000000) {
				flag1 = 1;
				break;
			} else if (n3 % 2 == 0) {
				flag2 = 1;
				sum += n3;
			}
			n1 = n2;
			n2 = n3;
		}
		if (flag1 == 1) {
			return -1;
		} else if (flag2 == 1) {
			return sum;
		} else {
			return 0;
		}

	}

}