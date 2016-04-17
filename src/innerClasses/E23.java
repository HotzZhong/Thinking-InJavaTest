package innerClasses;

interface U {
	void f1();

	void f2();

	void f3();
}

class A {
	private int i = 0;

	private A() {
	}

	public A(int i) {
		this.i = i;
	}

	U f() {
		return new U() {
			public void f1() {
				System.out.println(i + ": f1()");
			}

			public void f2() {
				System.out.println(i + ": f2()");
			}

			public void f3() {
				System.out.println(i + ": f3()");
			}
		};
	}
}

class B {
	private U[] u;
	private int size = 0;
	private int i = 0;

	B(int size) {
		this.size = size;
		u = new U[size];
	}

	public void add(U u) {
		if (i < size) {
			this.u[i++] = u;
			// u.f1(); //test

		}

	}

	public void setNull(int i) {
		this.u[i] = null;
	}

	public void iteratingU() {
		for (int i = 0; i < size; i++) {
			if (this.u[i] != null) {
				U u = this.u[i];
				u.f1();
				u.f2();
				u.f3();
			} else {
				System.out.println(i + ": NULL");
			}
		}

	}
}

public class E23 {
	public static void main(String[] args) {
		B b = new B(3);
		// new A(1).f().f1();
		for (int i = 0; i < 3; i++)
			b.add(new A(i).f());
		b.iteratingU();
		b.setNull(0);
		b.iteratingU();
	}
}
