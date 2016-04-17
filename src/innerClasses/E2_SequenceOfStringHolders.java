package innerClasses;

import javax.sql.rowset.serial.SerialException;

class HoldString {
	String str = new String();

	HoldString(int i) {
		str = String.valueOf(i);
	}

	public String toString() {
		return str;
	}
}

public class E2_SequenceOfStringHolders {
	public static void main(String[] args) {
		Sequence seq = new Sequence(5);

		for (int i = 0; i < 5; i++) {
			seq.add(new HoldString(i));
		} // having been successfully assigned the value to items[].

		Selector sele = seq.selector();
		while (!sele.end()) {
			System.out.println(sele.current());
			sele.next();
		}
		System.out.println(seq.check());

	}
}

// From the Sequence.java

interface Selector {
	boolean end();

	Object current();

	void next();
}

class Sequence { // OuterClass
	private Object[] items;
	private int next = 0;

	public Sequence(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}

	private class SequenceSelector implements Selector {// InnerClass
		private int i = 0;

		public boolean end() {
			return i == items.length;
		}

		public Object current() {
			return items[i];
		}

		public void next() {
			if (i < items.length) {
				System.out.println("Next" + i);
				i++;
			}

		}

		public String toString() {
			return "SequenceSelector().666";
		}

		// Test For E4
		// create a new method of producing the quote
		// of Outer Class Sequence.
		/*
		 * Note:beacase this class is private, the test of this method whether
		 * working or not need to create the other method for test.
		 */

		public Sequence backSequence() {
			return Sequence.this;
			// produce this class`s quote.
		}

	}
	public boolean check() {
		return this ==  ((SequenceSelector)selector()).backSequence();
	}

	public Selector selector() {
		return new SequenceSelector();
	}

}