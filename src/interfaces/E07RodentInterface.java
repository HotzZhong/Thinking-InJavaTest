package interfaces;
/*
 * Created in 16/3/26
 * change from Chapter 8.E09
 * change Rodent from abstract to interface  
 * 
 * */
import static operators.SimplePrint.*;

import java.util.Random;

interface Rodent {
	void eat();

	void move();
}

class Mouse implements Rodent {
	public void eat() {
		print("Mouse.eat().");
	}

	public void move() {

	}
}

class Gerbil implements Rodent {
	public void eat() {
		print("Gerbil.eat().");
	}

	public void move() {

	}
}

class Hamster implements Rodent {
	public void eat() {
		print("Hamster.eat().");
	}

	public void move() {

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

public class E07RodentInterface {
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
