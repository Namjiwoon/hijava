package hijava.oop;

import java.util.ArrayList;

import hijava.practice.Man;

public class Main {

	public static void main(String[] args) {
		// momAndSon();
		// drinkTest();
		// eatTest();
		//animal();
		//netSport();
		//software();
		//testInter();
		total();
		
		/*
		 * ArrayList<Man> people = new ArrayList<>(9);
		 * 
		 * for (int i = 0; i < 9; i++) { Man m = new Man("김" + (i + 1) + "수");
		 * m.buyCoffee(1);
		 * 
		 * people.add(m);
		 * 
		 * }
		 * 
		 * int size = people.size(); for (int i = 0; i < size; i++) {
		 * System.out.println(people.get(i));
		 * 
		 * }
		 */
	}
	
	private static void total() {
		int[] arr = new int[] {1, 2, 5, 9};
		Subtotal tt = new Subtotal();
		Total st = new TotalImpl();
		
		System.out.println("Total=" + st.sum(arr));
		System.out.println("Avg=" + tt.avg(arr));
	}
	
	private static void testInter() {
		TestInterface ti = new TestImpl();
		
		int i = 10, j = 5;
		ti.max(i, j);
		TestInterface.out(100);
	}
	
	private static void software() {
		SoftWare web = new WebSite();
		SoftWare app = new MobileApp();
		
		web.product();
		System.out.println("-------------");
		app.product();
	}
	
	private static void netSport() {
		NetSport pp = new PingPong();
		NetSport te = new Tennis();
		
		pp.play();
		System.out.println("-------------");
		te.play();
	}
	
	private static void animal() {
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		barkAnimal(dog);
		barkAnimal(cat);
	}
	
	private static void barkAnimal(Animal ani) {
		ani.bark();
	}

	private static void eatTest() {
		Man korean = new Korean();
		Man american = new American();
		
		eat(korean);
		eat(american);
	}

	private static void eat(Man m) {
		if (m instanceof Korean) {
			((Korean)m).eatRice();
		} else if (m instanceof American) {
			((American)m).eatBread();
		} else {
			System.out.println("Error");
		}
		
	}

	private static void momAndSon() {
		Mom mom = new Mom();
		Mom son = new Son();

		mom.eat();
		son.eat();

		mom.say();
		son.say();
		// son.ttt();

		System.out.println(mom.getName());
		System.out.println(son.getName());
	}

	private static void drinkTest() {
		Mom mom = new Mom();
		Mom son = new Son();

		drink(mom);
		drink(son);
	}

	private static void drink(Mom m) {
		if (m instanceof Son) {
			// Son s = (Son)m;
			// s.drinkMilk();
			((Son) m).drinkMilk();

		} else if (m instanceof Mom) {
			m.drinkBeer();

		}
	}

}
