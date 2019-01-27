package hijava.oop;

import hijava.practice.Man;

public class Korean extends Man {

	public static void eatRice() {
		System.out.println("Eat Rice");
	}

	public void sayHello() {
		System.out.println("안녕하세요.");
		System.out.println("제 이름은 " + this.getName() + "입니다.");
	}
}
