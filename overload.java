
public class overload {
	void print() {
		System.out.println("hello");
	}

	void print(int n) {
		System.out.println("hello" + n);
	}

	void print(float f) {
		System.out.println("hello" + f);
	}

	public static void main(String[] args) {
		overload p1 = new overload();
		overload p2 = new overload();
		overload p3 = new overload();
		p1.print();
		p2.print(2);
		p3.print(0.5f);
	}

}
