package hijava.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Student implements Cloneable {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + "(" + id + ")";
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	// if (s1 != null && s1.equals(s2)) {
	@Override
	public boolean equals(Object obj) {
		// 동일한 메모리 주소면 true
		if (this == obj)
			return true;

		// this는 절대 null이 될 수 없으므로 obj가 null이면 false
		if (obj == null)
			return false;

		// 동일한 class 타입이 아니면 false
		if (getClass() != obj.getClass())
			return false;

		Student other = (Student) obj;
		if (id != other.id)
			return false;

		if (name == null) {
			if (other.name != null)
				return false;

		} else if (!name.equals(other.name))
			return false;

		return true;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		Student clobj = (Student) super.clone();
		clobj.name = clobj.name + "복제본!";
		return clobj;
	}

	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		Student s = new Student(921234, "홍길동");
		//Student s2 = (Student) s.clone();
		//System.out.println(s2);
		// System.out.println(s);
		//System.out.println(s.getClass() + ", " + s.getClass().getSimpleName());
		
		String inputStr = "hijava.basic.Student";
		Class cls = Class.forName(inputStr);
		Package pkg = cls.getPackage();
		System.out.println("pkg=" + pkg);
		
		for (Constructor c: cls.getConstructors())
			System.out.println("constructor=" + c);
		for (Field f : cls.getFields())
			System.out.println("field=" + f);
		for (Method m : cls.getMethods())
			System.out.println("method=" + m.getName());

//		sb.append("aaaaaaaa");
//		System.out.println("sb1=" + sb.toString());
//		sb.setLength(0);
//		System.out.println("sb2=" + sb.toString());
//		
//		StringBuffer sf = new StringBuffer();
//		sf.append("aaaaaaaa");
//		System.out.println("sb1=" + sf.toString());
//		sf.setLength(0);
//		System.out.println("sb2=" + sf.toString());

//		String s1 = new String("123abc");
//		String s2 = "123abc";
//		String s3 = "123abc";
//
//		System.out.println("s1==s2 :" + (s1 == s2) + ", " + s1.equals(s2));
//		System.out.println(s3 == s2);
//		System.out.println(System.identityHashCode(s1) + ", " + System.identityHashCode(s2));
//		System.out.println(s1.hashCode() + " : " + s2.hashCode() + " : " + s3.hashCode());
		
		/*
		 * String ss = new String("홍길동1"); Integer obj = new Integer(s.id); Integer obj2
		 * = new Integer(921234); System.out.println(s.name.hashCode() + "::" +
		 * ss.hashCode()); System.out.println(obj.hashCode() + "=" + obj2.hashCode());
		 * System.out.println(System.identityHashCode(obj2));
		 * 
		 * Student s1 = new Student(123, "Hong"); Student s2 = new Student(456, "Kim");
		 * Student s3 = new Student(123, "Hong"); System.out.println("s1 equals s2 =" +
		 * s2.equals(s1)); // false System.out.println("s1 equals s3 =" +
		 * s3.equals(s1)); // true
		 */
	}

}
