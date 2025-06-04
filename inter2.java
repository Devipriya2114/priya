package javabasic;

public class inter2 implements in1,inter3child{

	
	public void moon() {
		System.out.println("wight");
	}

	public void sun() {
		System.out.println("red");
		
	}

	
	public void earth() {
	System.out.println("blue");
		
	}
	
	public void yellow() {
		System.out.println("lemon");
	}

	
	public void black() {
		System.out.println("ball");	
	}

	public void orange() {
	System.out.println("fruits");
		
	}
	public static void main(String[] args) {
		inter2 I = new inter2();
		I.moon();
		I.sun();
		I.earth();
		I.yellow();
		I.black();
		I.orange();
	}

}
