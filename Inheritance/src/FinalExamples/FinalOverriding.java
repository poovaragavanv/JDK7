/*
 * to prevent a childclass to overriding a method from parentclass. 
 * To do this we use final keyword with method declaration. 
 * It means a method with final keyword is called final method. 
 * Final methods are faster than non-final methods because they are not required to be resolved during run-time and they are bonded on compile time.
 * The main reason behind making a method final would be that the content of the method should not be changed by any outsider.
 */

package FinalExamples;
class Base
{
    //final method
    public void displayMsg()
    {
        System.out.println("I'm in Base class - displayMsg()");
    }
}
 public class FinalOverriding extends Base
{
    //Overriding the method displayMsg()
    public void displayMsg()
    {
        System.out.println("I'm in FinalMethod class - displayMsg()");
    }
    public static void main(String []s)
    {
    	FinalOverriding B=new FinalOverriding();
        B.displayMsg();
    }
}

