package TypesofInheritance;
import java.util.Scanner;
class Employee
{
    int Id;
    String Name;
    double Salary;
    void GetData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\tEnter Employee Id : ");
        Id = Integer.parseInt(scan.nextLine());
        System.out.print("\n\tEnter Employee Name : ");
        Name = scan.nextLine();
        System.out.print("\n\tEnter Employee Salary : ");
        Salary = Double.parseDouble(scan.nextLine());
    }
    void PutData()
    {
        System.out.print("\n\n\tEmployee Id : " + Id);
        System.out.print("\n\tEmployee Name : " + Name);
        System.out.print("\n\tEmployee Salary : " + Salary);
    }
}
class Company extends Employee         //Statement 1
{
    int RegNo;
    String CName;
    void ReadData()
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\tEnter Registration No. : ");
        RegNo = Integer.parseInt(scan.nextLine());
        System.out.print("\n\tEnter Company Name : ");
        CName = scan.nextLine();
    }
    void WriteData()
    {
        System.out.print("\n\tRegistration No. : " + RegNo);
        System.out.print("\n\tCompany Name : " + CName);
    }
}
class InheritanceDemo
{
    public static void main(String args[])
    {
        Company C = new Company();// Creating Object of Derived Class
        C.GetData();              // Calling Base Class Method()
        C.ReadData();             // Calling Derived Class Method()
        C.PutData();              // Calling Base Class Method()
        C.WriteData();            // Calling Derived Class Method()
    }
}