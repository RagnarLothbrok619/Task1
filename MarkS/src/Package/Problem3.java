package Package;




public class Problem3 {
	public static void main(String[] args) {
		System.out.println("Largest prime factor of 600851475143: " + largestPrime(600851475143L));

	}

	public static long largestPrime(long n) {
		long i=2,j=2;

		while (n != j) {
			if (n % i == 0) {
				n = n / i;
				i = 2;
			} else {
				i++;
				j = i;
			}
		}
		return j;

	}
}
