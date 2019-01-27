package hijava.practice;

public class Prime {

	public static void main(String[] args) {
		int total = 0;

		for (int num = 2; num <= 100; num++) {
			boolean isPrime = true;
			for (int j = 2; j < num; j++) {
				if (num % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime)
				total += num;
		}
		System.out.println("Total is " + total);
	}

}
