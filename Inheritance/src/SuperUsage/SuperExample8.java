package SuperUsage;

/**
 * This program is used to show that if sub class and 
 * super class instance variables are not same than there
 * is no need of super keyword.
 */
class Display8 {
	int num = 100;
}

class Show5 extends Display8 {
	
	public void show(){
		//super class instance variable will be referred.
		System.out.println("num = " + num);
	}
}

public class SuperExample8 {
	public static void main(String args[]){
		//create Show class object.
		Show5 obj = new Show5();
		//method call
		obj.show();
	}
}
