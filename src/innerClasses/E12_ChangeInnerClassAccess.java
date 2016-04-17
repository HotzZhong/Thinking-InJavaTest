package innerClasses;

class Inner {
	Inner(){
		System.out.println("Inner()");
	}
	void g() {
		
	}
}

public class E12_ChangeInnerClassAccess {
	private int i = 10;

	private void f() {
		System.out.println("E12_ChangeInnerClassAccess.f");
	}
	
	Inner inner() {
		return new Inner(){
			{System.out.println("Inner()2");}
			void g(){
				i++;
				f();
			}
		};
	}


	public void h() {
		Inner in = inner(); //Inner in = new Inner();
		in.g();
		System.out.println("i = " + i);
	}

	public static void main(String args[]) {
		E12_ChangeInnerClassAccess cic = new E12_ChangeInnerClassAccess();
		cic.h();

	}
}