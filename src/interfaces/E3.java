package interfaces;

abstract class BaseWithPrint {
	abstract void print();

	BaseWithPrint() {
		print();
	}
}

class DerivedWithPrint extends BaseWithPrint {
	int i = 666;

	@Override
	void print() {
		System.out.println(i);

	}

}

public class E3 {
	public static void main(String[] args) {
		DerivedWithPrint dw = new DerivedWithPrint();
		dw.print();
	}
}

/*
 * Output: 0 666
 * 
 * The java virtual machine zeroes the bits of the object after it allocates
 * storage, producing a default value for i before any other initialization
 * occurs. The code Thinking in Java, 4th Edition Annotated Solution Guide
 * 128calls the base-class constructor before running the derived-class
 * initialization, so we see the zeroed value of i as the initial output. The
 * danger of calling a method inside a constructor is when that method depends
 * on a derived initialization. Before the derived-class constructor is called,
 * the object may be in an unexpected state (in Java, at least that state is
 * defined; this is not true with all languages ¨C C++, for example). The safest
 * approach is to set the object into a known good state as simply as possible,
 * and then perform any other operations outside the constructor.
 */
