package getSetMethods;
import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        student.setName(name);
        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();
        student.setRollMumber(rollNumber);
        System.out.print("Enter marks1: ");
        int marks1 = scanner.nextInt();
        student.setMarks1(marks1);
        System.out.print("Enter marks2: ");
        int marks2 = scanner.nextInt();
        student.setMarks1(marks2);
        System.out.print("Enter marks3: ");
        int marks3 = scanner.nextInt();
        student.setMarks1(marks3);
        System.out.println();
        System.out.println("Printing details using printDetails() method: =");
        student.printDetails();
        System.out.println();
        System.out.println("Printing details without using printDetails() method:");
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        System.out.println("Marks1: " + student.getMarks1());
        System.out.println("Marks2: " + student.getMarks2());
        System.out.println("Marks3: " + student.getMarks3());
        System.out.println("Average: " + student.getAverage());

	}

}
