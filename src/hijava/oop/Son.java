package hijava.oop;

public class Son extends Mom {

	public static void drinkMilk() {
		System.out.println("Drink Milk!!");
	}

	public Son() {
		super("아들");
	}

	public Son(String name) {
		super(name);
	}

	public void say() {
		System.out.println("Son said...");
	}

	public void ttt() {
		System.out.println("TTT");
	}

}
