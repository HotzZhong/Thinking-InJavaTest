package initializationAndClean;
import static operators.SimplePrint.*;

public class BananaPeel {
	int a;
	void Try1(int i){
		a = i;
		print("a = " + a);
	}	
	
	public static void main(String[] args) {
		BananaPeel bp1 = new BananaPeel();
		BananaPeel bp2 = new BananaPeel();
		bp1.Try1(1);
		bp2.Try1(2);
		print(bp1);
	}
}



