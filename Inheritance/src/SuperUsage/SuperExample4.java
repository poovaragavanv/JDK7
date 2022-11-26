package SuperUsage;

/**
 * This program is used to show that if super class and subclass
 * have same methods and that method is called from subclass 
 * method than subclass method is called.
 */
class Display4 {
	public void display(){
		System.out.println("display method of super class.");
	}
}

class Show1 extends Display4 {
	public void display(){
		System.out.println("display method of sub class.");
	}
	
	public void show(){
		System.out.println("show method of sub class.");
		//subclass display method is called.
		display();
	}
}

public class SuperExample4 {
	public static void main(String args[]){
		//create Show class object.
		Show1 obj = new Show1();
		//method call
		obj.show();
	}
}
