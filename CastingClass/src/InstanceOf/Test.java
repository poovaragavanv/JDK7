/* instanceof operator is used to check the type of an object at runtime. 
 * It is the means by which your program can obtain run-time type information about an object. 
 * instanceof operator is also important in case of casting object at runtime. 
 * operator return boolean value,if an object reference is of specified type then it return true otherwise false. 
 */

package InstanceOf;

public class Test
{
    public static void main(String[] args)
    {
      Test t= new Test();
      System.out.println(t instanceof Test);
      }
}