package SuperUsage;

/**
 * This program is used to show that if super class and subclass
 * have same variable name and that variable is used in subclass 
 * method than subclass variable will be called.
 */
class Display6 {
	int num = 100;
}

class Show3 extends Display6 {
	int num = 200;
	
	public void show(){
		//sub class instance variable will be referred.
		System.out.println("num = " + num);
	}
}

public class SuperExample6 {
	public static void main(String args[]){
		//create Show class object.
		Show3 obj = new Show3();
		//method call
		obj.show();
	}
}
