package polymorphism;

import static operators.SimplePrint.*;
import polymorphism.Cycle.*;

public class E17_RTTI {
	//Create three different kind of Cycle`s child class.
	public static void main(String[] args) {
		Cycle cycle[] = {
				//turn up to Cycle[]
				new Unicycle(), new Bicycle(), new Tricycle()
		};
//		cycle[0].balance();
//		cycle[1].balance();
//		cycle[2].balance();
//		The method balance() is undefined for the type Cycle
//		The method balance() is undefined for the type Cycle
//		The method balance() is undefined for the type Cycle
		((Unicycle)cycle[0]).balance();
		((Bicycle)cycle[1]).balance();
		//The method balance() is undefined for the type Tricycle
		//((Tricycle)cycle[2]).balance();
		
	}

	
	
	
	
	
	
	
}
