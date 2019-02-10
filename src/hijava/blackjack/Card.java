package hijava.blackjack;

public class Card {
	
	int[] num = new int[] { 2, 3, 4, 5, 6, 7, 8, 9 };
	int J = 10, Q = 10, K = 10;
	int A;
	String[] shape = {"Spade", "Diamond", "Heart", "Clover"};

	public void setA(int A) {
		this.A = A;
	}
	
	public String getShape(String shape) {
		return shape;
	}

	public void setShape(String[] shape) {
		this.shape = shape;
	}
	
	public static void main(String[] args) {
		Card c = new Card();
		c.setA(1);
		System.out.println(c.A);
		System.out.println(c.Q);
		System.out.println(c.shape);
	}
}