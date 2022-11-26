package threads;

class MyExtendThread extends Thread
{
    @Override
    public void run()
    {
        //Task of this thread is to print multiplication of successive numbers up to 1000 numbers
        for(int i = 0; i < 10; i++)
        {
            System.out.println(i+" * "+(i+1)+" = " + i * (i+1));
        }
    }
}
public class ExtendsThread 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Creating and starting MyThread.
		MyExtendThread myThread = new MyExtendThread();
		myThread.start();

	}

}
