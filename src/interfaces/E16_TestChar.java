package interfaces;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

class CreateChar {
	private static Random rand = new Random(47);
	public static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] vowels = "aeiou".toCharArray();
	private int nums = 0;

	char[] getChar() {
//		char[] buffer = new char[10];
//		int idx = 0;
//		buffer[idx++] = (char) nums;
//		nums++;
//		buffer[idx++] = capitals[rand.nextInt(capitals.length)];
//		for (int i = 0; i < 4; i++) {
//			buffer[idx++] = lowers[rand.nextInt(lowers.length)];
//			buffer[idx++] = vowels[rand.nextInt(vowels.length)];
//		}

//		return buffer;
		 char[] buffer = new char[10];
		 int idx = 0;
		 buffer[idx++] = capitals[rand.nextInt(capitals.length)];
		 for (int i = 0; i < 4; i++) {
		 buffer[idx++] = vowels[rand.nextInt(vowels.length)];
		 buffer[idx++] = lowers[rand.nextInt(lowers.length)];
		 }
		 buffer[idx] = ' ';
		 return buffer;
	}

}

public class E16_TestChar extends CreateChar implements Readable {
	
	private int count;
	public E16_TestChar(int count){
		this.count = count;
	}
	
	
	public static void main(String[] args) {
		Scanner s = new  Scanner(new E16_TestChar(10));
		while(s.hasNext()) {			
			System.out.println(s.next());
		}

	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		if (count-- == 0) 
			return -1; // Indicates end of input  //Used for .hasNext() method
		char[] buffer = getChar();
		cb.put(buffer);
		return 1; 
	}

}
