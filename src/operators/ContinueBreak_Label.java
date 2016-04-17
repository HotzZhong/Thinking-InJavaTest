package operators;

import static operators.SimplePrint.*;

public class ContinueBreak_Label {
	public static void main(String[] args) {
		int i = 0;
		print("This is Outer");
		outer: for (; true;) {

			print("This is Inter");
			inner: for (; i < 11; i++) {
				print("i = " + i);

				if (i == 2) {
					print("Continue");
					continue;
				}
				if (i == 7) {
					print("continue inner");
					i++; // Otherwise i never
							// gets incremented.
					continue inner;
				}
				if (i == 9) {
					print("Break");
					break outer;
				}
				print("-----");
				
			}
			print("End Inner");
			break;
		}

		print("End");

	}

}
