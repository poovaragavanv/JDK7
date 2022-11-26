package SuperUsage;

/**
 * This program is used to show the use of super
 * keyword to invoke super class constructor using 
 * super explicitly.
 */
class Display {
	Display(){
		System.out.println("Super class constructor called.");
	}
}
public class SuperExample1 extends Display {
	SuperExample1(){
		//super keyword will call super class constructor.
		super();
		System.out.println("Current class constructor called."); 
	}
	public static void main(String args[]){
		SuperExample1 obj = new SuperExample1();
	}
}
