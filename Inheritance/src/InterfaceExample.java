interface interface1
{
    void Display1();
    void Display2();
}
interface interface2
{
    void Display3();
    void Display4();
}

class DerivedClass implements interface1, interface2
{
    public void Display1()
    {
        System.out.print("\n\tThis is Display1() method of Derived class.");
    }

    public void Display2()
    {
        System.out.print("\n\tThis is Display2() method of Derived class.");
    }

    public void Display3()
    {
        System.out.print("\n\tThis is Display3() method of Derived class.");
    }

    public void Display4()
    {
        System.out.print("\n\tThis is Display4() method of Derived class.");
    }
}

public class InterfaceExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DerivedClass D = new DerivedClass();
        D.Display1();
        D.Display2();
        D.Display3();
        D.Display4();

	}

}
