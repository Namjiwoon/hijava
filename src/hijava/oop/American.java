package hijava.oop;

import hijava.practice.Man;

public class American extends Man {

	public void sayHello() {
		System.out.println("Hello,");
		System.out.println("My name is " + this.getName() + ".");
	}

	public void eatBread() {
		System.out.println("Eat Bread");
	}
}
