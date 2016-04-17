package polymorphism;

//: polymorphism/FieldAccess.java
// Direct field access is determined at compile time.

class Super {
  public int field = 0;
  public int getField() { return field; }
  public String toString() {
	 return "This is Super";
  }
}

class Sub extends Super {
  public int field = 1;
  public int getField() { return field; }
  public int getSuperField() { return super.field; }
  public String toString() {
	 return "This is Sub";
  }
}

public class FieldAccess {
  public static void main(String[] args) {
    Super sup = new Sub(); // Upcast
System.out.println(sup);    
    System.out.println("sup.field = " + sup.field +
      ", sup.getField() = " + sup.getField());
// can`t do behind because sup is a ChildrenClass object but be quoted by Fatherclass
//System.out.println("sup.getSuperField() = " + sup.getSuperField());    
    Sub sub = new Sub();
    System.out.println("sub.field = " +
      sub.field + ", sub.getField() = " +
      sub.getField() +
      ", sub.getSuperField() = " +
      sub.getSuperField());
  }
} /* Output:
sup.field = 0, sup.getField() = 1
sub.field = 1, sub.getField() = 1, sub.getSuperField() = 0
*///:~
