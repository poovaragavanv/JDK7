package interthreadcommunication;

class Shared
{
    synchronized void methodOne()
    {
        Thread t = Thread.currentThread();
 
        System.out.println(t.getName()+" is relasing the lock and going to wait");
 
        try
        {
            wait();        //releases the lock of this object and waits
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
 
        System.out.println(t.getName()+" got the object lock back and can continue with it's execution");
    }
 
    synchronized void methodTwo()
    {
        Thread t = Thread.currentThread();
 
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
 
        notify();     //wakes up one thread randomly which is waiting for lock of this object
 
        System.out.println("A thread which is waiting for lock of this object is notified by "+t.getName());
    }
}
 
public class InterThreads
{
    public static void main(String[] args)
    {
        final Shared s = new Shared();
 
        Thread t1 = new Thread()
        {
            public void run()
            {
                s.methodOne();   //t1 calling methodOne() of 's' object
            }
        };
 
        Thread t2 = new Thread()
        {
            @Override
            public void run()
            {
                s.methodTwo();   //t2 calling methodTwo() of 's' object
            }
        };
 
        t1.start();
 
        t2.start();
    }
}