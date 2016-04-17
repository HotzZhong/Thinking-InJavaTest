package reusing;
import static operators.SimplePrint.print;

import reusing.Detergent;

public class NewDetergent extends Detergent {
	public void scrub(){
		append(" NewDetergent.scrub()");
	    super.scrub(); // Call base-class version
	}
	
	public void sterilize(){
		print("I dont know!");
	}
	public static void main(String[] args) {
		NewDetergent x = new NewDetergent();
	    x.scrub();
	    print(x);
	    x.sterilize();
	  }
}
