package innerClasses;

interface SelectorR {
	boolean end();

	Object current();

	void next();
}

class Sequence3 {
	private Object[] items;
	private int next = 0;

	// Construction
	public Sequence3(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (items.length > next)
			items[next++] = x;

	}

	private class reverseSequence implements SelectorR {
		private int i = items.length - 1;

		public void next() {
			if (i > 0)
				i--;
			// if(!this.end())
			// i++;
		}

		public Object current() {
			return items[i];
		}

		public boolean end() {
			return i == 0;
		}

	}
	
	public SelectorR backSelector() {
		return new reverseSequence();
	}
}

public class E22_reverseSequence {
	

	public static void main(String[] args) {
		
		Sequence3 e = new Sequence3(10);
		for (int i = 0; i < 10; i++)
			e.add(i);
		
		/*
		 * only the main method in the OuterClass can ues this way of 
		 * instantiate the inner Class.
		 * */
		//Sequence3.reverseSequence sr = e.new reverseSequence();
		//SelectorR sr = e.new reverseSequence();
		SelectorR sr = e.backSelector();
		while (!sr.end()) {
			System.out.println(sr.current());
			sr.next();
		}
	}
}
