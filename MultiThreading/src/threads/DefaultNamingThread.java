package threads;

class DefaultName extends Thread
{
	DefaultName()
   {
      // The compiler creates the byte code equivalent of super ();
   }
	DefaultName(String name)
   {
      super (name); // Pass name to Thread superclass
   }
   public void run ()
   {
      System.out.println ("My name is: " + getName ());
   }
}
public class DefaultNamingThread {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		DefaultName mt;
	      if (args.length == 0)
	          mt = new DefaultName();
	      else
	          mt = new DefaultName(args [0]);
	      mt.start ();
	      System.out.println("Thread ID Find here " + mt.getId());     //Using the thread ID before starting the thread
	      //System.out.println();    Using the thread ID before starting the thread

	}

}
