package Package;

public class Problem1 {

	public static void main(String[] args) {
		System.out.println("Sum of all the multiples of 3 or 5 below 1000: " + calculateSum(1000));

	}

	public static int calculateSum(int range) {
		int sum = 0;
		for (short i = 1; i < range; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		return sum;
	}

}
