package reusing;
import static operators.SimplePrint.*;

class Cleanser {
	  private String s = "Cleanser";
	  public void append(String a) { s += a; }   //Only use this fuction, The String s will be add automatic
	  public void dilute() { append(" dilute()1"); }
	  public void apply() { append(" apply()"); }
	  public void scrub() { append(" scrub()"); }
	  public String toString() { return s; }
	  public static void main(String[] args) {
	    Cleanser x = new Cleanser();
	    x.dilute(); x.apply(); x.scrub();
	    print(x);
	   
	  }
}	

public class Detergent extends Cleanser {
	// Change a method:
	  public void scrub() {
	    append(" Detergent.scrub()");
	    super.scrub(); // Call base-class version
	  }
	  // Add methods to the interface:
	  public void foam() { append(" foam()"); }
	  // Test the new class:
	  public static void main(String[] args) {
	    Detergent x = new Detergent();
	    x.dilute();
	    x.apply();
	    x.scrub();
	    x.foam();
	    print(x);
	    print("Testing base class:");
	    //Cleanser.main(args);
	  }
}
