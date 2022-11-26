package FinalExamples;

class Base1
{
    //final method
    final public void displayMsg()
    {
        System.out.println("I'm in Base class - displayMsg()");
    }
}
 
public class FinalOverriding2 extends Base
{
    //Overriding the method displayMsg()
    public void displayMsg()
    {
        System.out.println("I'm in FinalMethod class - displayMsg()");
    }
    public static void main(String []s)
    {
    	FinalOverriding2 B=new FinalOverriding2();
        B.displayMsg();
    }
}