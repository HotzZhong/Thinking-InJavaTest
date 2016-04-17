package innerClasses.E6_secondPackage;

import innerClasses.E6_firstInterface;

public class OuterClass {
	
	public OuterClass(){
		System.out.println("OuterClass is Created.");
	}

	protected class InnerClass implements E6_firstInterface {
		InnerClass() {
			System.out.println("InnerClass is Created.");
		}
		@Override
		public void method1() {
			System.out.println("method1()");
		}
	}
	
	public InnerClass innerClass() {
		return new InnerClass();
	}
	/*  //test the constructor is work?
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		OuterClass.InnerClass inner = outer.new InnerClass();
	}
	*/
}
