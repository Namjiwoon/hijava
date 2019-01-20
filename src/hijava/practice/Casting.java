package hijava.practice;

public class Casting {
	public static void main(String[] args) {
		byte b = 1;
		int i = b;
		long l = 1234567;
		char c = 65;  
		int n = (char)c;

		
		System.out.println(i + l + 10);
		System.out.println(i + l + b + 10);
		System.out.println(n + b);

	}

}
