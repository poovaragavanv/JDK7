/* Java Serialization allows us to convert Java Object to a Stream of bytes which 
 * we can send through a network or save in a flat file or even in a DB for future usage.
 * Deserialization is the process of converting a stream of bytes back to Java Object which can be used in our program. 
 * We will be implementing java.io.Serializable interface to achieve serialization
 */

package transientExamples;

import java.io.Serializable;

public class Employee implements Serializable
{

      private int empId;
      private String empName;
      private int empSalary;
      //private transient int empSalary;
 
 public int getEmpId() {
       return empId;
 }

 public String getEmpName() {
       return empName;
 }
 
 public int getEmpSalary() {
       return empSalary;
 }

 public Employee(int empId,String empName,int empSalary)
 {
       this.empId=empId;
       this.empName=empName;
       this.empSalary=empSalary;
 }
}
