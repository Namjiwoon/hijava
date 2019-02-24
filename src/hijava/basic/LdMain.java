package hijava.basic;

public class LdMain {

	public static void main(String[] args) {
//		ld1();
//		ld2();
		ld3();
	}

	private static void ld3() {
		LdCalc add = (x, y) -> x + y;
		LdCalc sub = (x, y) -> x - y;
		LdCalc mul = (x, y) -> x * y;
		LdCalc div = (x, y) -> x / y;

		System.out.println("add=" + add.Calculation(10, 20));
		System.out.println("sub=" + sub.Calculation(10, 20));
		System.out.println("mul=" + mul.Calculation(10, 20));
		System.out.println("div=" + div.Calculation(10, 20));
	}

	private static void ld2() {
		LdStudent ls1 = (i, s) -> new Student(i, s);

		LdStudent ls2 = (i, s) -> new Student(i * 1000, s + "님");

		stufn(ls1, 100, "Hong");
		stufn(ls2, 200, "kim");
	}

	private static void stufn(LdStudent ls, int id, String name) {
		Student stu = ls.makeStudent(id, name);
		System.out.println(stu);
	}

	private static void ld1() {
		Ld ld = (x, y) -> x * y;
		System.out.println("result=" + ld.mul(10, 20));
	}

}
