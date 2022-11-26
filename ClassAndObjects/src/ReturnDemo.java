class EmployeeInfo {
    private String Desgntn;
    private String name;

    EmployeeInfo(String Desgntn, String name) {
        this.Desgntn = Desgntn;
        this.name = name;
    }

    public EmployeeInfo getInfo() {
        // return Employee type
        return this;
    }

    public String toString() {
        return "Desgination: " + name.concat(" Name: " + Desgntn);
    }
}
public class ReturnDemo {

    public static void main(String[] args) {
        int z = ReturnDemo.calculate(2, 3);
        System.out.println("z = " + z);

        EmployeeInfo info = new EmployeeInfo("Ragavan", "TeachingFaculty");
        System.out.println(info.getInfo());
    }

    public static int calculate(int x, int y) {
        // return an int type value
        return x + y;
    }

    public void print() {
        System.out.println("void method");

        // it does not need to contain a return statement, but it
        // may do so
        return;
    }

    public String getString() {
        return "return String type value";

        // try to execute a statement after return a value will
        // cause a compile-time error.
        //
        // String error = "error";
    }
}

