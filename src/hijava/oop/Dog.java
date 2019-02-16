package hijava.oop;

public class Dog extends Animal{

	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	
	@Override
	public String toString() {
		return "This is Dog";
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d);
	}

}
