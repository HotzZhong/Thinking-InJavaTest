package interfaces;

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
}

class BicycleFactory implements CycleFactory {
	public Cycle getCycle() {
		return new Bicycle();
	}
}

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

public class E18_CycleFactory {
	public static void doCycle(CycleFactory factory) { 
		Cycle c = factory.getCycle();
		c.DO();
	}
	
	public static void main(String[] args) {
		doCycle(new TricycleFactory());
	}
}
