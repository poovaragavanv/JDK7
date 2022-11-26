// A derived class with one base class and that base class is a derived class of 
// another is called multilevel inheritance
package TypesofInheritance;
class Base1
{
    public void dispA()
    {
        System.out.println("disp() method of ClassA");
    }
}
class ClassDerived extends Base1
{
    public void dispB()
    {
        System.out.println("disp() method of ClassB");
    }
}
/*
 * In Multilevel Inheritance a derived class will be inheriting a parent class and 
 * as well as the derived class act as the parent class to other class.
 */
public class Multilevel extends ClassDerived
{
    public void dispC()
    {
        System.out.println("disp() method of ClassC");
    }
    public static void main(String args[])
    {
        //Assigning ClassC object to ClassC reference
    	Multilevel obj = new Multilevel();
        //call dispA() method of ClassA
        obj.dispA();
        //call dispB() method of ClassB
        obj.dispB();
        //call dispC() method of ClassC
        obj.dispC();
    }
}
