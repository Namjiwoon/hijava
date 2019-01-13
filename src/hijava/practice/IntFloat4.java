package hijava.practice;

public class IntFloat4 {

	public static void main(String[] args) {
		int i = 10;
		double d = 2.0;
		
		int r1 = (int)(i + d);
		int r2 = (int)(i - d);
		int r3 = (int)(i * d);
		int r4 = (int)(i / d);
		int r5 = (int)(i % d);
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		
		System.out.println(i + (int)d);

	}

}
