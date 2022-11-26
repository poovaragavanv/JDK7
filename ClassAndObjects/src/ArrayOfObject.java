/**
 * @author Rags
 *Creating custom array of objects in java
 *We can also store custom objects in arrays .
 *Create a employee class.
 *Create multiple objects of employee class and assign employee objects to array.
 *Arrays can store objects but we need to instantiate each and every object and array can store it
 */
class Employee
{
	String name;
	int id;
	
	Employee(String name, int id)
	{
	this.id = id;
	this.name = name;
	}
}
public class ArrayOfObject {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employee[] EmpArray = new Employee[4];
		EmpArray[0] = new Employee("XY", 1);
		EmpArray[1] = new Employee("AB", 2);
		EmpArray[2] = new Employee("CD", 3);
		EmpArray[3] = new Employee("EF", 4);
		for(Employee employee : EmpArray)
		{
			System.out.println(employee.id+" "+employee.name);		
		}
		}

	}
