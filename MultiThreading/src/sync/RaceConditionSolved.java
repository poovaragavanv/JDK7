/*To fix the race condition we need to have a way to restrict resource access to only one thread at a time. 
 * We have to use synchronized keyword to synchronize the access to the shared resource. 
 * Let’s see the same example again with proper synchronization to avoid race condition.
 */
package sync;

//This class' shared object will be accessed by threads
class CounterEx implements Runnable{
  private int c = 0;

  public  void increment() {
      try {
          Thread.sleep(10);
      } catch (InterruptedException e) {
          // TODO Auto-generated catch block
          e.printStackTrace();
      }
      c++;
  }

  public  void decrement() {    
      c--;        
  }

  public  int getValue() {
      //System.out.println("in getValue method ");
      
      return c;
  }
  
  @Override
  public void run() {
      synchronized(this){
          // incrementing
          this.increment();
          System.out.println("Value for Thread After increment " 
           + Thread.currentThread().getName() + " " + this.getValue());
          //decrementing
          this.decrement();
          System.out.println("Value for Thread at last " + Thread.currentThread().getName() 
              + " " + this.getValue());
      }
      
  }
}


public class RaceConditionSolved
{
  public static void main(String[] args) {
      CounterEx counter = new CounterEx();
      Thread t1 = new Thread(counter, "Thread-1");
      Thread t2 = new Thread(counter, "Thread-2");
      Thread t3 = new Thread(counter, "Thread-3");
      t1.start();
      t2.start();
      t3.start();
  }    
}

/*It can be seen from the output how threads are accessing the shared resource one at a time now. 
 * Synchronizing the access with in the run() method made it happen.
 * 
 * Points to note -
 * A code block that has a shared resource and may lead to race conditions is called a critical section.
 * Race conditions can be avoided by proper thread synchronization in critical sections.
 */
