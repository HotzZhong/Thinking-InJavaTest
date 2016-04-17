package innerClasses;
import static operators.SimplePrint.*;

class Outer {
	
	Outer(){
		pString();
	}
	public Inner backInner(int i) {
		return new Inner(i);
	}
	public Inner backInner() {
		return new Inner();
	}

	class Inner {
		int i;
		Inner(int i){
			this.i = i;
			print(i+"Inner()");
		}
		Inner(){
			this.i = i;
			print(i+"Inner()");
			TestPrivateAuthority();
		}
		
		//For test E3
		public String toString() {
			return pString();
		}
	}

	//For test E3
	private String pString() {
		return "Hello,This is a pString()";
	}
	
	private void TestPrivateAuthority() {
		print("TestPrivateAuthority()");
	}
}

public class E1_testOuter {
	public static void main(String[] args) {
	
		Outer.Inner inner1 = new Outer().backInner(1);
		System.out.println(inner1.toString());  //Test E3
		Outer.Inner inner2 = new Outer().backInner();
		Outer outer = new Outer();
		Outer.Inner inner3 = outer.new Inner();
		
	}
}
