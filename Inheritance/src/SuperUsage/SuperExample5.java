package SuperUsage;

/**
 * This program is used to show that if super class and subclass
 * not have same methods and method of super class is called from  
 * subclass method than super class method is called.There is 
 * no need of super keyword.
 * 
 */
class Display5 {
	public void display(){
		System.out.println("display method of super class.");
	}
}

class Show2 extends Display5 {
		
	public void show2(){
		System.out.println("show method of sub class.");
		//no need of super keyword here.
		display();
	}
}

public class SuperExample5 {
	public static void main(String args[]){
		//create Show class object.
		Show2 obj = new Show2();
		//method call
		obj.show2();
	}
}
