package HelloData;

public class HelloData {
	int i;
	double d;
	boolean b; 
	static int si;

	public static void main(String[] args){
		//exercise3();
		//exercise8();
		exercise10(args);
		
	}

	private static void exercise10(String[] args) {
		if(args.length < 3) { 
		System.err.println("Need 3 arguments");
		System.exit(1);    
		}
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}

	private static void exercise3() {
		HelloData h = new HelloData();
		h.i = 47;
		h.d = 1.1;
		h.b = false; 	
		System.out.println("i = " + h.i);
		System.out.println("d = " + h.d);
		System.out.println("b = " + h.b);
	}
	private static void exercise8(){
		HelloData helloData1 = new HelloData();
		helloData1.si++;
		HelloData helloData2 = new HelloData();
		helloData2.si++;
		System.out.println(si);
	}
	

	
	
	
	
	
}
