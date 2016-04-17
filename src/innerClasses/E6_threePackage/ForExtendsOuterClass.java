package innerClasses.E6_threePackage;

import innerClasses.E6_firstInterface;
import innerClasses.E6_secondPackage.OuterClass;

public class ForExtendsOuterClass extends OuterClass {
	
	public ForExtendsOuterClass() {
	super();  //????? why innerClasses_E6.OuterClass`s construction must is protected???? 
		System.out.println("ForExtendsOuterClass is Created.");
		// TODO Auto-generated constructor stub
	}

	public E6_firstInterface BackInnerClass() {
		OuterClass oc = new ForExtendsOuterClass();
		return oc.innerClass();
	}
	/*
	//test
	public static void main(String[] args) {
		ForExtendsOuterClass feo = new ForExtendsOuterClass();
		feo.BackInnerClass();
	}
	 * */
}
