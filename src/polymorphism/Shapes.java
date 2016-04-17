package polymorphism;

import static operators.SimplePrint.*;

import java.util.Random;

import javax.sql.rowset.spi.TransactionalWriter;

class Shape {
	public void draw() {
	}

	public void erase() {
	}
	
	public void msg() {
		print("Shape.msg()");
	}
}

class Circle extends Shape {
	@Override public void draw() {
		print("Circle.draw()");
	}

	@Override public void erase() {
		print("Circle.erase()");
	}
	
//	public void msg(){
//		print("Circle.msg()");
//	}
}

class Square extends Shape {
	public void draw() {
		print("Square.draw()");
	}

	public void erase() {
		print("Square.erase()");
	}
	
	public void msg() {
		print("Square.msg()");
	}
}

class Triangle extends Shape {
	public void draw() {
		print("Triangle.draw()");
	}

	public void erase() {
		print("Triangle.erase()");
	}
}

class RandomShapeGenerator {
	private Random rand = new Random(47);
	public Shape next() {
		switch (rand.nextInt(3)) {
		default:
		case 0:
			return new Circle();
		case 1:
			return new Square();
		case 2:
			return new Triangle();
		}
	}
}

public class Shapes {
	/*
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	
	public static void main(String[] args) {
		Shape[] s = new Shape[9];
		for(int i = 0; i < s.length; i++)
			s[i] = gen.next();
		for(Shape shp : s){
			shp.draw();
		}
	}
	*/
	public static void main(String[] args) {
		
//		Circle c = new Circle();
//		Square s = new Square();
//		Triangle t =  new Triangle();
		
		Shape[] shapes = {new Circle(),new Square(),new Triangle()};
		for(Shape shape : shapes) {
			shape.draw();
			shape.erase();
			shape.msg();
		}
		print("FFFFFF");
		new Circle().msg();
	}
	

}
