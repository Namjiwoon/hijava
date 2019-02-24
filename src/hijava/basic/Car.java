package hijava.basic;

public class Car {
	private String name;

	public Car() {
	}

	public Car(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
		
//		Car sonata1 = CarFactory.getInstance().createCar("김일수");
		Car sonata1 = factory.createCar("김일수");
		Car sonata2 = factory.createCar("김일수");
		System.out.println(sonata1 == sonata2);

		Car avante1 = factory.createCar("김이수");
		Car avante2 = factory.createCar("김이수");
		System.out.println(avante1 == avante2);

		System.out.println(sonata1 == avante1);
	}

}
