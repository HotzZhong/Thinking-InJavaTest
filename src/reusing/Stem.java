package reusing;
import static operators.SimplePrint.*;

/*
 * ��ʼ��������  ������ ���ȳ�ʼ������� ���췽��
 */


class Component1{
	public Component1(){		
		print("Component1");
	}
}

class Component2{
	public Component2(){
		print("Component2");
	}	
}

class Component3{
	public Component3(){
		print("Component3");
	}
}

class Root{
	public Root(){
		print("Root");
		Component3 com3 = new Component3();
	}
	
	Component1 com1 = new Component1();
	
	
}

public class Stem extends Root{
	public Stem(){
		print("Stem");
		Component2 com2 = new Component2();
	}
	public static void main(String[] args) {
		Stem stem = new Stem();
		
	}
}
