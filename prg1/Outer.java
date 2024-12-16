package prg1;
public class Outer {
	int x;
	void display() {
		System.out.println("outer class display x" + x);
		Inner inner = new Inner();
		inner.x=100;
		inner.display();
	}
	class Inner{
		int x;
		void display() {
			System.out.println("In inner display x" + x);
		}
	}
public static void main(String[] args) {
	Outer outer= new Outer();
	outer.x=200;
	outer.display();
}
}


