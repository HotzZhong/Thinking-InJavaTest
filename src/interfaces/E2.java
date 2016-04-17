package interfaces;

import static operators.SimplePrint.print;

abstract class TestAbstractWithNoMethod{
	void f() {
		print("f()");
	}
}

public class E2 {
	public static void main(String[] args) {
		//it can no be run
		//new TestAbstractWithNoMethod();
	}
}
