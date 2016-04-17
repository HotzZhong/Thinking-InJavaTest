package reusing;
import static operators.SimplePrint.*;
class ThreeOverloads{
	public void f(int i){
		print("int:" + i);
	}
	
	public void f(char f){
		print("char:" + f);
	}
	
	public void f(double d){
		print("double:" + d);
	}	
}

class MoreOverloads extends ThreeOverloads {
	public void f(String s){
		print("String:" + s );		
	}
}

public class E13 {
	public static void main(String[] args) {
		MoreOverloads mo = new MoreOverloads();
		mo.f(1);
		mo.f('a');
		mo.f(1.0);
		mo.f("Good");
		
	}
}
