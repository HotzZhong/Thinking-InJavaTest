package polymorphism;

import static operators.SimplePrint.*;

import java.util.Random;

abstract class Rodent {
	abstract void eat();

	void move() {
		print("Rodent.move().");
	}
}

class Mouse extends Rodent {
	void eat() {
		print("Mouse.eat().");
	}
}

class Gerbil extends Rodent {
	void eat() {
		print("Gerbil.eat().");
	}
}

class Hamster extends Rodent {
	void eat() {
		print("Hamster.eat().");
	}
}

class RandomRodent {
	private Random rand = new Random(47);

	public Rodent next() {
		switch (rand.nextInt(3)) {
		default:
		case 0:
			return new Mouse();
		case 1:
			return new Gerbil();
		case 2:
			return new Hamster();
		}
	}
}

public class Rodent_E9 {
	static RandomRodent r = new RandomRodent();
	

	public static void main(String[] args) {
		Rodent[] rodent = new Rodent[3];
		for (int i = 0; i < rodent.length; i++) {
			rodent[i] = r.next();
		}
		for (Rodent rod : rodent) {
			rod.eat();
			rod.move();
		}

	}

}
