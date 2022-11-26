/* The serializable interface in java is a marker interface(method with no body). 
 * It adds serialization capabilities to the class Employee. 
 * Even though it is a marker interface it must be implemented in the class whose object you want to persist.
 */
package transientExamples;
public class SerilizationTest 
{
      public static void main(String args[])
     {
          //Path to store the Serialized object
          String filePath="D://Persist.txt";
          Employee1 emp = new Employee1(1,"RAGAVAN",1000);
 
         System.out.println();
 
         SerializationUtility su = new SerializationUtility();
 
         //Serialize emp object
         su.serialize(emp, filePath);
 
         //De-Serialize Employee object
         
         Employee1 ee = (Employee1)su.deSerialize(filePath);
         System.out.println("Employee id : "+ee.getEmpId());
         System.out.println("Employee Name : "+ee.getEmpName());
        System.out.println("Employee Salary : "+ee.getEmpSalary());
    }
}
