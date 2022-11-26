package getSetMethods;

public class Student 
{
	private int rollNumber;
    private String name;
    private int marks1;
    private int marks2;
    private int marks3;

    public void setName(String s) {
        name = s;
    }

    public String getName() {
        return name;
    }

    public void setRollMumber(int r) {
        if (r > 0) {
            rollNumber = r;
        } else {
            rollNumber = 1;
        }
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setMarks1(int m) {
        if (m >= 0 && m <= 100) {
            marks1 = m;
        } else {
            marks1 = 0;
        }
    }

    public int getMarks1() {
        return marks1;
    }

    public void setMarks2(int m) {
        if ((m >= 0) && (m <= 100)) {
            marks2 = m;
        } else {
            marks2 = 0;
        }
    }

    public int getMarks2() {
        return marks2;
    }

    public void setMarks3(int m) {
        if ((m >= 0) && m <= 100) {
            marks3 = m;
        } else {
            marks3 = 0;
        }
    }

    public int getMarks3() {
        return marks3;
    }

    public double getAverage() {
        return (marks1+ marks2 + marks3) / 3.0;
    }

    public void printDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Marks in first subject: " + marks1);
        System.out.println("Marks in second subject: " + marks2);
        System.out.println("Marks in second subject: " + marks3);
        System.out.println("Average: " + getAverage());
    }
}

