/*A class with final keyword is known as final class in java. Final class is complete in nature and cannot be inherited. 
 *Several classes in Java are final e.g. String, Integer and other wrapper classes.
 *The main purpose or reason of using a final class is to prevent the class from being subclassed. 
 *If a class is marked as final then no class can inherit any feature from the final class.
 */

package FinalExamples;

class Base2
{
    public void displayMsg()
    {
        System.out.println("I'm displayMsg() in Base class.");
    }
}

// A final class can not be inherited/extended.

class FinalClass extends Base2
{
    public void displayMsg1()
    {
        System.out.println("I'm displayMsg1() in Final class.");
    }
     
    public static void main(String []s)
    {
        FinalClass FCE=new FinalClass();
        FCE.displayMsg();
        FCE.displayMsg1();
    }
}