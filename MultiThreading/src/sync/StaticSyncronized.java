package sync;

//This class' shared object will be accessed by threads
class Message3
{
	public static synchronized void displayMsg()
	{
		System.out.println("In run method " + Thread.currentThread().getName()); 
		for(int i = 0; i < 5 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + " i - " + i);
			try 
			{
				Thread.sleep(50);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}

class MyClass3 implements Runnable
{
	  Thread t; 
	  Message3 msg; 
	  MyClass3(Message3 msg)
	  {
	    this.msg = msg; 
	    t = new Thread(this);
	    t.start();
	  }
	  @SuppressWarnings("static-access")
	  @Override
	  public void run() 
	  {
	    msg.displayMsg();
	  }
	}

	public class StaticSyncronized 
	{
	  public static void main(String[] args) 
	  { 
	    Message3 msg1 = new Message3();
	    Message3 msg2 = new Message3();
	    // Two threads on msg1 object
	    @SuppressWarnings("unused")
		MyClass3 mc1 = new MyClass3(msg1);
	    @SuppressWarnings("unused")
	    MyClass3 mc2 = new MyClass3(msg1);
	    // Two threads on msg2 object
	    @SuppressWarnings("unused")
	    MyClass3 mc3 = new MyClass3(msg2);
	    @SuppressWarnings("unused")
	    MyClass3 mc4 = new MyClass3(msg2);
	  }
	}