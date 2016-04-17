package reusing;

import static operators.SimplePrint.*;

class Insect {
	private int i = 9;
	protected int j;
	Insect() {
		print("i = " + i + ", j = " + j);
		j = 43;
	}
	
	private static int x1 = 
			printInit("static Insect.x1 initialized.");
	static int printInit(String s) {
		//print("11initialized printInit");
		print(s);
		return 20;
	}
}

class Beetles extends Beetle {

}

public class Beetle extends Insect {
	private int k = printInit("Beetle.k initialized");
	//static {print("6666");}
	public Beetle() {
		print("k = " + k);
		print("j = " + j);
	}
	private static int x2 = printInit("static Beetle.x12 initialized.");
	public static void main(String[] args) {
		print("Beetle constructor");
		Beetle b = new Beetle();
		
		//print("Beetles constructor");
		//Beetles bs = new Beetles();
		
	}
}
