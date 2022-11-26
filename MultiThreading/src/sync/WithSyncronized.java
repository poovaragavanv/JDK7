package sync;

class Message2
{
	/*General form
	 * public synchronized void method_name(parameter_list)
	 * {
	 * 		code Here
	 * }
	 */
	public synchronized void displayMsg(String msg) // synchronized
	{
		System.out.println("Inside displayMsg method " + Thread.currentThread().getName());
        System.out.print("**" + msg);        
        try
        {
            Thread.sleep(3);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
        System.out.println("*");
    }
}
class MyClass2 implements Runnable
{
		Thread t;
		Message2 msg;
		String message;
		MyClass2(Message2 msg, String str)
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
public class WithSyncronized 
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