import java.util.ArrayList;
import java.util.List;
class Organization {
	  
    private String organizationName;
     
    List<Employee> employees;
  
    public String getOrganizationName() {
        return organizationName;
    }
  
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
 
    public List<Employee> getEmployees() {
        return employees;
    }
 
    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
  
}
  
class Employee {
  
    private String employeeName;
  
    public String getEmployeeName() {
        return employeeName;
    }
  
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
 
    @Override
    public String toString() {
        return employeeName;
    }
  
} 
 // Association establish a relationship between any two objects. 
// It can be defined as the multiplicity between the objects.
public class AssociationDemo {
  
    public static void main(String[] args) {
        Organization organization = new Organization();
        organization.setOrganizationName("KARPAGAM ENGG COLLEGE");
         
         
        Employee employee = new Employee();
        employee.setEmployeeName("ABC");
        Employee employee2 = new Employee();
        employee2.setEmployeeName("XYZ");
         
        List<Employee> empList = new ArrayList();
        empList.add(employee);
        empList.add(employee2);
        organization.setEmployees(empList);      
        System.out.println(organization.getEmployees()+" are Employees of "+
                organization.getOrganizationName());
    }
  
}
  
