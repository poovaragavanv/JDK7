package InstanceOf;

class Parent{ }

public class child extends Parent
{
    public void check()
    {
        System.out.println("Sucessfull Casting");
    }

    public static void show(Parent p)
    {
       if(p instanceof child)
       {
           child b1=(child)p;
           b1.check();
       }
    }
    
    public static void main(String[] args)
    {
      
      Parent p=new child();
      
      child.show(p);
      
      }
}