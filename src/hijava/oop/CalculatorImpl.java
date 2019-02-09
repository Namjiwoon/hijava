package hijava.oop;

public class CalculatorImpl implements Calculator{

	public void add(int x, int y) {
		System.out.println(x + y);
	}

	public void sub(int x, int y) {
		System.out.println(x - y);
	}

	public void mul(int x, int y) {
		System.out.println(x * y);
	}

	public void div(int x, int y) {
		if (y != 0)
		System.out.println(x / y);
	}
	
}
