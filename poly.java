package javabasic;

public class poly {
	public void hello(int a) {
		System.out.println(a);
	}
  public void hello(int b) {
	  System.out.println(b);
	  }
public void hello() {
	System.out.println();
}
public void hello(float c) {
	System.out.println(c);
}
public static void main(String[] args) {
	poly P = new poly();
	P.hello(12.12f);
	P.hello(127);
	P.hello(null);
}

}
