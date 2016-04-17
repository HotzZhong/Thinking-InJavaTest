package innerClasses;

/*working to be extends/implements,it can be a 
 * abstract class/Interface/commod class
 * */
class Test_InnerClass {
	int i = 1;

	Test_InnerClass() {
		System.out.println("Construct Test_InnerClass()");
	}
	/*
	 * Test_InnerClass() { System.out.println("Test_InnerClass()"); }
	 */
	public String toString() {
		return "Test_InnerClass()" + i;
	}
}

class anonymous_OuterClass {
	public Test_InnerClass innerClass() {

		return new Test_InnerClass() {
			int i = 2;
			public String toString() {
				return "Really InnerClass()" + i;
			}
		};
	}
}

public class Test_AnonymousInnerClass {
	public static void main(String[] args) {
		anonymous_OuterClass anonc = new anonymous_OuterClass();
//System.out.println(anonc);
		Test_InnerClass tinner = anonc.innerClass();
		System.out.println(tinner);
	}
	
}
