package SuperUsage;

/**
 * This program is used to show the use super keyword to invoke the super class method from subclass method.
 */
class Display3 {
	public void Display3(){
		System.out.println("display method of super class.");
	}
}

class Show extends Display3 {
	public void Display(){
		System.out.println("display method of sub class.");
	}
	
	public void show(){
		System.out.println("show method of sub class.");
		//super class display method is called.
		super.Display3();
	}
}

public class SuperExample3 {
	public static void main(String args[]){
		//create Show class object.
		Show obj = new Show();
		//method call
		obj.show();
	}
}
