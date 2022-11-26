package threadgroup;

public class ThreadGroupDemo extends Thread
{
	   public static void main (String [] args)
	   {
	      ThreadGroup tg = new ThreadGroup ("subgroup 1");
	      @SuppressWarnings("unused")
	      Thread t1 = new Thread (tg, "thread 1");
	      @SuppressWarnings("unused")
	      Thread t2 = new Thread (tg, "thread 2");
	      @SuppressWarnings("unused")
	      Thread t3 = new Thread (tg, "thread 3");
	      tg = new ThreadGroup ("subgroup 2");
	      @SuppressWarnings("unused")
	      Thread t4 = new Thread (tg, "my thread");
	      tg = Thread.currentThread ().getThreadGroup ();
	      int agc = tg.activeGroupCount ();
	      System.out.println ("Active thread groups in " + tg.getName () +
	                          " thread group: " + agc);
	      tg.list ();
	   }
	}