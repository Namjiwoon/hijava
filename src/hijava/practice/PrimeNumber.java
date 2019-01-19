package hijava.practice;

public class PrimeNumber {

	public static void main(String[] args) {
		int total = 0;

		for (int i = 2; i <= 100; i++) {
			int number = 0;

			for (int j = 1; j <= i; j++) {

				if (i % j == 0)
					number++;
			}
			if (number == 2)
				total += i;
		}
		System.out.println(total);

	}
}
