package polymorphism;

class parent 
{
	 public void work() 
	 {
	  System.out.println("Parent is under retirement from work.");
	 }
}
class Overriding extends parent 
{
	 public void work() 
	 {
	  System.out.println("Child has a job");
	  System.out.println(" He is doing it well");
	 }
	 public static void main(String argu[]) 
	 {
		 Overriding c1 = new Overriding();
		 c1.work();
	 }
}
//One major advantage of method overriding is that a class can give its own specific execution to an inherited method
//without having modification in the parent class (base class).
