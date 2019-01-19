package hijava.practice;

public class Loop3 {

	public static void main(String[] args) {
		int i = 0;
		int n = 0;
		
		while(++i <= 100) {
			if (i % 2 == 0)
				continue;
		
			n += i;
		
		}
		System.out.println(n);
	}

}
