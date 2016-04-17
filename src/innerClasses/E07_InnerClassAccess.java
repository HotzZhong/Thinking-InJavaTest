package innerClasses;



public class E07_InnerClassAccess {
	private int i = 10;

	private void f() {
		System.out.println("E07_InnerClassAccess.f");
	}

	class Inner {
		private int j = 20;
		void g() {
			i++;
			f();
		}
	}

	public void h() {
		Inner in = new Inner();
		in.g();
		System.out.println("i = " + i);
		
//explan the OuterClass can Call InnerClass`s private thing.
		System.out.println("j = " + in.j);
	}

	public static void main(String args[]) {
		E07_InnerClassAccess ica = new E07_InnerClassAccess();
		ica.h();
	}
}
