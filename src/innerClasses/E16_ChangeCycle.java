package innerClasses;

interface Cycle {
	void DO();
}

interface CycleFactory {
	Cycle getCycle();
}

class Unicycle implements Cycle {
	@Override
	public void DO() {
		System.out.println("Unicycle()");
	}

	public static CycleFactory factory = new CycleFactory() {
		public Cycle getCycle() {
			return new Unicycle();
		}
	};

}

class UnicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Unicycle();
	}
}

class Bicycle implements Cycle {
	@Override
	public void DO() {
		System.out.println("Bicycle()");
	}

	public static CycleFactory factory = new CycleFactory() {
		public Cycle getCycle() {
			return new Bicycle();
		}
	};
}

/*
 * class BicycleFactory implements CycleFactory { public Cycle getCycle() {
 * return new Bicycle(); } }
 */

class Tricycle implements Cycle {
	@Override
	public void DO() {
		System.out.println("Tricycle()");
	}
}

class TricycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Tricycle();
	}
}

public class E16_ChangeCycle {
	public static void doCycle(CycleFactory factory) {
		Cycle c = factory.getCycle();
		c.DO();
	}

	public static void main(String[] args) {
		doCycle(Unicycle.factory);
		doCycle(Bicycle.factory); // work way of anonymous InnerClass
		doCycle(new TricycleFactory());
	}
}
