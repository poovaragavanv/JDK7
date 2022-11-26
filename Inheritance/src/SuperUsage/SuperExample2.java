package SuperUsage;

/**
 * use of super keyword to invoke super class constructor using super implicitly.
 */
class Display2 {
	Display2(){
		System.out.println("Super class constructor called.");
	}
}
public class SuperExample2 extends Display2 {
	SuperExample2(){
		//compiler automatically add super here.
		System.out.println("Current class constructor called."); 
	}
	public static void main(String args[]){
		SuperExample2 obj = new SuperExample2();
	}
}
