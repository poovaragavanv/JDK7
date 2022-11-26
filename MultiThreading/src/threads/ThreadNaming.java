package threads;

class MyNameThread extends Thread
{
    @Override
    public void run()
    {
        System.out.println("Keep some task here....");
    }
}

public class ThreadNaming 
{
	public static void main(String[] args)
	    {
	        MyNameThread thread = new MyNameThread();     //Creating a thread
	 
	        thread.start();                     //Starting a thread
	 
	        thread.setName("My Thread");        //Giving a name to the thread
	 
	        String name = thread.getName();    //Retreiveing the name of the thread
	 
	        System.out.println(name);   //Output : My Thread
	    }
	}

