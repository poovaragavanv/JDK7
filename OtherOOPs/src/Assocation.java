class City {
	private String name;

	// bank name
	City(String name) {
		this.name = name;
	}

	public String getCityName() {
		return this.name;
	}
}

class Employee {
	private String name;

	// employee name
	Employee(String name) {
		this.name = name;
	}

	public String getEmployeeName() {
		return this.name;
	}
}

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		City city = new City("Coimbatore");
		Employee emp = new Employee("Java");

		System.out.println(emp.getEmployeeName() + " is living in " + city.getCityName());

	}

}