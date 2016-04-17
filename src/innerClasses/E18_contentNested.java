package innerClasses;

import java.sql.NClob;

public class E18_contentNested {

	/*
	 * static class NestedClass { void testNest() {
	 * System.out.println("NestedClass.testNest()"); } }
	 * 
	 * class InnerClass {
	 * 
	 * void newNestedClass() { NestedClass nc = new NestedClass();
	 * nc.testNest(); } void f() {
	 * 
	 * } }
	 * 
	 * public InnerClass BackInnerClass() { return new InnerClass(); } public
	 * static void main(String[] args) {
	 * 
	 * E18_contentNested.InnerClass ic = (new
	 * E18_contentNested()).BackInnerClass(); ic.newNestedClass();
	 * 
	 * 
	 * }
	 */

	static class Nested {
		void f() {
			System.out.println("Nested.f");
		}
	}

	class Other {
		// Specifying the nested type outside the scope of the class:
		void f() {
			E18_contentNested.Nested ne = new E18_contentNested.Nested();
			ne.f();
		}
	}

	public static void main(String args[]) {
		Nested ne = new Nested();
		ne.f();
		E18_contentNested mainClass = new E18_contentNested();
		E18_contentNested.Other other = mainClass.new Other();
		other.f();
	}
}
