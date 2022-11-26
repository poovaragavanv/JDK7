package transientExamples;

import java.io.Serializable;

public class Employee1 implements Serializable
{

      private int empId;
      private String empName;
      private int empSalary;
 
 public int getEmpId() {
       return empId;
 }

 public String getEmpName() {
       return empName;
 }
 
 public int getEmpSalary() {
       return empSalary;
 }

 public Employee1(int empId,String empName,int empSalary)
 {
       this.empId=empId;
       this.empName=empName;
       this.empSalary=empSalary;
 }
}
