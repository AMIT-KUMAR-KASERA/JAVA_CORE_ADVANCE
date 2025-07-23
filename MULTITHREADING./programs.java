                                                                          23-07-2025


Q1) Which method is used to start a thread?
A) run()
B) start()
C) init()
D) execute()

ans:-start();

Q2) Which interface must be implemented to create a thread by implementing an interface?
A) Thread
B) Runnable
C) Comparable
D) Comparator

Runnable

Q3) What will happen if run() is called directly instead of start() on a thread?
A) A new thread is started
B) Compiler error
C) run() method executes in the current thread
D) Runtime exception is thrown

C) run() method executes in the current thread

Q4) What happens when the Thread.sleep() method is invoked on a thread?
A) The thread releases all locks
B) The thread goes into infinite waiting state
C) The thread pauses execution for a specified time
D) The thread is destroyed
C) The thread pauses execution for a specified time

Q5) Which exception must be handled when using Thread.sleep()?
A) InterruptedException
B) IOException
C) TimeoutException
D) IllegalStateException
A) InterruptedException


Q6) What is the output of this code, A new thread will be created or not?
    public class MyThread extends Thread 
    {
    public void run() 
    {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) 
    {
        MyThread t = new MyThread();
        t.run(); 
    }
}

No, a new thread will NOT be created.

Q7) What is the output of the following code :
    class Test extends Thread 
    {
    public void run() 
    {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) 
    {
        Test t1 = new Test();
        t1.setName("MyThread");
        t1.start();
    }
}

A) main
B) MyThread
C) Test
D) Compilation error

B) MyThread
                                 
Q8) What is the output of the following code :

public class Example 
{
    public static void main(String[] args) 
    {
        Thread t = new Thread()
	{
	   @Override
	   public void run()
	   {
	      try
	      {
	        for(int i=1; i<=10; i++)
	        {
	          System.out.println("i value is :"+i);
	          Thread.sleep(1000);
	        }
	      }
	      catch(InterruptedException e)
	      {
	         e.printStackTrace();
	      }
	   }
	};

        t.start();
        t.interrupt();//main  thread is interrupted child thread isflag=true;
    }
}
ans:-

i value is :1
java.lang.InterruptedException: sleep interrupted
        at java.base/java.lang.Thread.sleepNanos0(Native Method)
        at java.base/java.lang.Thread.sleepNanos(Thread.java:496)
        at java.base/java.lang.Thread.sleep(Thread.java:527)
        at Main$1.run(Main.java:15)


Q9) What is the output of the following code :

public class Example 
{
    public static void main(String[] args) 
    {
        Thread t = new Thread()
	{
	   @Override
	   public void run()
	   {
	      
	        for(int i=1; i<=10; i++)
	        {
	          System.out.println("i value is :"+i);
	          try
		  {
		    Thread.sleep(1000); // isInterrupted =false// there may be the chance this sleeping thred interrupted may be interrupted at run time show that we have to handle  
		  }
		  catch(InterruptedException e)
		  {
		     System.out.println("Thread is interrupted");
		  }
	        }
	      
	   }
	};

        t.start();
        t.interrupt();// isInterrupt =true
    }
}


i value is :1
Thread is interrupted
i value is :2
i value is :3
i value is :4
i value is :5
i value is :6
i value is :7
i value is :8
i value is :9
i value is :10

Q10) What is the output of the following code :

public class Example 
{
    public static void main(String[] args) 
    {
        Thread t = new Thread()
	{
	   @Override
	   public void run()
	   {	      
	        for(int i=1; i<=10; i++)
	        {
	          System.out.println("i value is :"+i);
	          try
		  {
		    Thread.sleep(1000);// isinterrupted=true
		  }
		  catch(InterruptedException e)
		  {
		     System.out.println("Thread is interrupted");
		     Thread.currentThread().interrupt();//self interruption isInterrupted=true
		  }
	        }
	      
	   }
	};

        t.start();
        t.interrupt();
    }
}


Q11) In this program run method will be executed or not ?
class MyRunnable implements Runnable 
{
    public void run() 
    {
        System.out.println("Running");
    }

    public static void main(String[] args) 
    {
        Thread t = new Thread();
        t.start();
    }
}


Q12) What is the default name of the main thread in Java?
A) MainThread
B) Primary
C) Thread-0
D) main

Q13) Which method tells if a thread is alive or has finished execution?
A) isFinished()
B) isCompleted()
C) isAlive()
D) getState()


Q14) What is the output of this code 
public class Test extends Thread 
{
    public void run()
    {
        for (int i = 0; i < 3; i++) 
	{
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) 
    {
        Test t1 = new Test();
        Test t2 = new Test();
        t1.start();
        t2.start();
    }
}

A) 0 1 2 3 0 1 2 3 4 5 45
B) 0 1 2
C) 0 0 1 1 2 2 3 3 4 4 5 5
D) Output is Un-Predictable


Q15) What happens if you try to call start() on the same thread instance more than once?
Thread t = new Thread();
t.start();
t.start();
A) The thread restarts successfully
B) It runs twice in parallel
C) It throws an IllegalThreadStateException
D) It is ignored silently

Q16) Which of the following is a valid way to "restart" a thread's logic after it finishes?
A) Call start() again on the same thread
B) Call run() again
C) Create a new Thread instance and start it
D) Use Thread.reset()

Q17) What does the isAlive() method return?
A) Whether the thread object is valid
B) Whether the thread has started and not yet died
C) Whether the thread was created successfully
D) Whether the thread is paused

Q18) What is the output of the following code 
class MyThread extends Thread 
{
    public void run() 
    {
        System.out.println("Running");
    }
}
public class Test 
{
    public static void main(String[] args)
    {
        MyThread t = new MyThread();
        System.out.println(t.isAlive());
        t.start();
        System.out.println(t.isAlive());
    }
}

Q19) Which thread’s name is returned by Thread.currentThread().getName()?
A) The main thread’s name
B) The thread object on which currentThread() is called
C) The thread currently executing the code
D) None of the above


Q20) What is the purpose of the setName() method in the Thread class?
A) To start the thread with a specific name
B) To assign a name to the thread
C) To stop the thread
D) To pause the thread

========================================================================
Coding Question :
------------------
Assignment 01 :
---------------
WAP in java to print odd and even numbers from 1-100 by using extends Thread class approach :
  a) Main thread should print all the even numbers
  b) Thread-0 (Child Thread) should print all the odd numbers

  Note : First It should print all the odd numbers then only even numbers
 
Output :
---------
1 by Thread-0	3 by Thread-0	5 by Thread-0	
7 by Thread-0	9 by Thread-0	11 by Thread-0	13 by Thread-0	15 by Thread-0	
17 by Thread-0	19 by Thread-0	21 by Thread-0	23 by Thread-0	25 by Thread-0	
27 by Thread-0	29 by Thread-0	31 by Thread-0	33 by Thread-0	35 by Thread-0	
37 by Thread-0	39 by Thread-0	41 by Thread-0	43 by Thread-0	45 by Thread-0	
47 by Thread-0	49 by Thread-0	51 by Thread-0	53 by Thread-0	55 by Thread-0	
57 by Thread-0	59 by Thread-0	61 by Thread-0	63 by Thread-0	65 by Thread-0	
67 by Thread-0	69 by Thread-0	71 by Thread-0	73 by Thread-0	75 by Thread-0	
77 by Thread-0	79 by Thread-0	81 by Thread-0	83 by Thread-0	85 by Thread-0	
87 by Thread-0	89 by Thread-0	91 by Thread-0	93 by Thread-0	95 by Thread-0	
97 by Thread-0	99 by Thread-0	

=================================

2 by main	4 by main	6 by main	8 by main	10 by main	
12 by main	14 by main	16 by main	18 by main	20 by main	
22 by main	24 by main	26 by main	28 by main	30 by main	
32 by main	34 by main	36 by main	38 by main	40 by main	
42 by main	44 by main	46 by main	48 by main	50 by main	
52 by main	54 by main	56 by main	58 by main	60 by main	
62 by main	64 by main	66 by main	68 by main	70 by main	
72 by main	74 by main	76 by main	78 by main	80 by main	
82 by main	84 by main	86 by main	88 by main	90 by main	
92 by main	94 by main	96 by main	98 by main	100 by main	

Assignment 02 :
---------------
Re-Write the above program where even and odd numbers printing should be done by two different child threads (class name is EvenThread and OddThread, both are extending from Thread class). Here first of all even number should be printed then only odd numbers.



















