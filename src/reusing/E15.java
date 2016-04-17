package reusing;

//class OverE15 extends E15{
//	public OverE15(String s) {
//		super(s);
//		// TODO Auto-generated constructor stub
//	}
//	public void fun(){
//		this.wheel();
//	}
//	public static void main(String[] args) {
////		OverE15 ore = new OverE15("This is OverE15");
////		ore.fun();
//	}
//}

public class E15 {
	public E15(String s){
		System.out.println("this is E15 initialization   "+s);
	}
	protected void wheel(){
		System.out.println("Wheel()");
	}
	
}
