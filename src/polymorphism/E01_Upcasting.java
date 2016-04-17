package polymorphism;

import static operators.SimplePrint.*;

class Cycle {
	public String toString() {
		return "Cycle";
	}
}

class Unicycle extends Cycle {
	public String toString() {
		return "Unicycle";
	}

	void balance() {
		print("Unicycle.balance()");
	}
}

class Bicycle extends Cycle {
	public String toString() {
		return "Bicycle";
	}

	void balance() {
		print("Bicycle.balance()");
	}
}

class Tricycle extends Cycle {
	public String toString() {
		return "Tricycle";
	}
}

public class E01_Upcasting {
	public static void ride(Cycle cycle) {
		print(cycle);
	}

	public static void main(String[] args) {
		ride(new Cycle());
		ride(new Unicycle());
		ride(new Bicycle());
		ride(new Tricycle());

	}
}
