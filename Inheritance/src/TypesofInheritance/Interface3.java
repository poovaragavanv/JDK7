package TypesofInheritance;

interface Shape
{
        public abstract void size(); 
}
public class Interface3 implements Shape
{
    @Override
    public void size() 
    {
        System.out.println("Size method implementation called");
    }
    public static void main(String args[])
    {
        Interface3 l = new Interface3();
        l.size();

        //Dynamic binding
        Shape s = new Interface3();
        s.size();
    }
}