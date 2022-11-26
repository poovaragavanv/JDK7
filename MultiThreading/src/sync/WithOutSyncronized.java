package sync;

//This class' shared object will be accessed by threads
class Message
{
	public void displayMsg(String msg)
	{
		System.out.println("Inside displayMsg method " + Thread.currentThread().getName());
		System.out.println("**" + msg); 
		
		try 
		{
			Thread.sleep(10);
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		System.out.println("*");
	}
}

class MyClass implements Runnable
{
		Thread t;
		Message msg;
		String message;
		MyClass(Message msg, String str)
		{ 
			this.msg = msg;
			this.message = str;
			// creating threads, 4 threads will be created 
			// all sharing the same object msg
			t = new Thread(this);
			t.start();
		}
		@Override	
		public void run() 
		{
			msg.displayMsg(message);
		}
}
public class WithOutSyncronized 
{
	public static void main(String[] args) 
	{
		Message msg = new Message();
		@SuppressWarnings("unused")
		MyClass mc1 = new MyClass(msg, "I");
		@SuppressWarnings("unused")
		MyClass mc2 = new MyClass(msg, "am");
		@SuppressWarnings("unused")
		MyClass mc3 = new MyClass(msg, "not");
		@SuppressWarnings("unused")
		MyClass mc4 = new MyClass(msg, "synchronized");
}
}