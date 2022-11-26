/*Abstract class is used in situation where we hava partial information.
 * We can't create an object of abstract class.
 * Abstract Class may have abstract methods.
 * Abstract methods must be public.
 * Abstract methods doesn't have body.
 * We must implements all abstract method in derived class.
 */
package abstractExample;

public class Employee extends Person {
	
	private int empId;
	
	public Employee(String nm, String gen, int id) {
		super(nm, gen);
		this.empId=id;
	}

	@Override
	public void work() {
		if(empId == 0){
			System.out.println("Not working");
		}else{
			System.out.println("Working as employee!!");
		}
	}
	
	public static void main(String args[]){
		//coding in terms of abstract classes
		Person student = new Employee("XYZ","Female",0);
		Person employee = new Employee("ABC","Male",123);
		student.work();
		employee.work();
		//using method implemented in abstract class - inheritance
		employee.changeName("RAGAVAN");
		System.out.println(employee.toString());
	}

}