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

i value is :1
Thread is interrupted
i value is :2
Thread is interrupted
i value is :3
Thread is interrupted
i value is :4
Thread is interrupted
i value is :5
Thread is interrupted
i value is :6
Thread is interrupted
i value is :7
Thread is interrupted
i value is :8
Thread is interrupted
i value is :9
Thread is interrupted
i value is :10
Thread is interrupted



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

ans:-not executed


Q12) What is the default name of the main thread in Java?
A) MainThread
B) Primary
C) Thread-0
D) main
main

Q13) Which method tells if a thread is alive or has finished execution?
A) isFinished()
B) isCompleted()
C) isAlive()
D) getState()
C) isAlive()

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

D) Output is Un-Predictable
	
Q15) What happens if you try to call start() on the same thread instance more than once?
Thread t = new Thread();
t.start();
t.start();
A) The thread restarts successfully
B) It runs twice in parallel
C) It throws an IllegalThreadStateException
D) It is ignored silently
 It throws an IllegalThreadStateException

Q16) Which of the following is a valid way to "restart" a thread's logic after it finishes?
A) Call start() again on the same thread
B) Call run() again
C) Create a new Thread instance and start it
D) Use Thread.reset()
C) Create a new Thread instance and start it
	
Q17) What does the isAlive() method return?
A) Whether the thread object is valid
B) Whether the thread has started and not yet died
C) Whether the thread was created successfully
D) Whether the thread is paused
B) Whether the thread has started and not yet died

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

false
true
Running


Q19) Which thread’s name is returned by Thread.currentThread().getName()?
A) The main thread’s name
B) The thread object on which currentThread() is called
C) The thread currently executing the code
D) None of the above

C) The thread currently executing the code
	
Q20) What is the purpose of the setName() method in the Thread class?
A) To start the thread with a specific name
B) To assign a name to the thread
C) To stop the thread
D) To pause the thread

B) To assign a name to the thread
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



class OddEvenThread extends Thread 
{
    public void run() 
    {
       for(int i=1;i<=100;i=i+2)
       {
           System.out.println(i +" by "+Thread.currentThread().getName());
       }
    }
}
public class Main
{
    public static void main(String[] args)
    {
        OddEvenThread t = new OddEvenThread();
        t.start();
        
        try{
            t.join();
        }
        catch(InterruptedException e)
        {
             e.printStackTrace();
        }
        
        for(int i=2;i<=100;i+=2)
        {
            System.out.println(i +" by "+Thread.currentThread().getName());
            
        }
    }
}

Assignment 02 :
---------------
Re-Write the above program where even and odd numbers printing should be done by two different child threads (class name is EvenThread and OddThread, both are extending from Thread class). Here first of all even number should be printed then only odd numbers.



class Odd extends Thread 
{
    public void run() 
    {
       for(int i=1;i<=100;i=i+2)
       {
           System.out.println(i +" by "+Thread.currentThread().getName());
       }
    }
}
class Even extends Thread{
    public void run()
    {
         for(int i=2;i<=100;i+=2)
        {
            System.out.println(i +" by "+Thread.currentThread().getName());
            
        }
        
    }
}
public class Main
{
    public static void main(String[] args)
    {
         Even t2=new Even();
         Odd t1= new Odd();
         
        t2.start();
        try{
            t2.join();
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
        
        
        t1.start();
       
        
        
       
    }
}


=========================================================================================================================================================================================
	                                                                                                                                                   24-07-2025

	
Multithreading (sleep() and join())


Develop a scenario based program by using Multithreading for OLA cab booking
process

Create 6 BLC classes which extending from Thread OR Anonymous inner class
approach which are as follows :

1) RideRequest
2) DriverAssignment
3) FareCalculation
4) LiveTracking
5) PaymentProcessing   
6) RatingSystem

Instruction :
-------------
Override run() method in all the above classes

a) run() method implementation for RideRequest class :
   It should print a message "User requested a ride...". User should wait
   for 2 seconds, after that, It should print a message "Searching for nearby drivers..."
   
b) run() method implementation for DriverAssignment class
   It should wait for 3 seconds and then print a message "Driver found and assigned!"
   
c) run() method implementation for FareCalculation class
   It should print a message "Calculating estimated fare...", Here Thread
   should wait for 1.5 second and then it should print "Estimated fare: 135.75 RS."

d) run() method implementation for LiveTracking class
   Here you should write the logic to update the ride location in % [See the
   output Test cases for more details]
   After that it should print a message "Ride Completed".
    
e) run() method implementation for PaymentProcessing class :
   It should print a message "Processing payment..." Here Thread should 
   wait for 2 seconds then It should print "Payment successful!"

f) run() method implementation for RatingSystem class :  
   It should print a message "Requesting user rating...". Here Thread should
   wait for 1 second and It should print "User rated the ride: 5 star"

 
 Create an ELC class called OlaRidingApp.
 
 Inside main method Create the object for all 6 six classes using Ordinary
 Or Anonymous inner class approach :
     
  Instruction :
  
  a) start RideRequest and FareCalculation thread together
  b) call join() method on RideRequest thread
  
  Note : In the same use start() and join() to get the following output : 
       
  
  Test Cases for Output :
  ------------------------
  User requested a ride...
	Calculating estimated fare...
	Estimated fare: 135.75 RS.
	Searching for nearby drivers...
	Driver found and assigned!
	Updating ride location... 20% completed
	Updating ride location... 40% completed
	Updating ride location... 60% completed
	Updating ride location... 80% completed
	Updating ride location... 100% completed
	Ride completed!
	Processing payment...
	Payment successful!
	Requesting user rating...
	User rated the ride: 5 star

ans:-

	package com.threading.com;

     public class RideRequest extends Thread {
	
	@Override
	public void run(){
		
		System.out.println("User requested a ride...");
		try {
			Thread.sleep(2000);
			System.out.println("Searching for nearby drivers...");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}

package com.threading.com;

public class DriverAssignment extends Thread {
	@Override
	public void run(){
		try {
			Thread.sleep(3000);
			System.out.println("Driver found and assigned!");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}


	package com.threading.com;

public class FareCalculation extends Thread {
	@Override
	public void run(){
		System.out.println("Calculating estimated fare...");
        try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Estimated fare: 135.75 RS.");
		
	}

}


}

package com.threading.com;

public class LiveTracking extends Thread{
	@Override
	public void run(){
		
		for(int i=20;i<=100;i=i+20)
		{
			System.out.println("Updating ride location... "+i+"% completed");
		}
		System.out.println("Ride Completed");
	}

}

package com.threading.com;

public class PaymentProcessing extends Thread {
	@Override
	public void run(){
		
		System.out.println("Processing payment...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Payment successful!");
	}

}

package com.threading.com;

public class RatingSystem extends Thread{
	@Override
	public void run(){
		
		System.out.println("Requesting user rating...");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("User rated the ride: 5 star");
	}

}

package com.threading.com;

public class OlaRidingApp {

	public static void main(String[] args) throws InterruptedException {
		
		RideRequest rideRequest=new RideRequest();
		DriverAssignment driverAssignment=new DriverAssignment();
		FareCalculation fareCalculation=new FareCalculation();
		LiveTracking liveTracking=new LiveTracking();
		PaymentProcessing paymentProcessing=new PaymentProcessing();
		RatingSystem ratingSystem=new RatingSystem();
		
		rideRequest.start();
		fareCalculation.start();
		rideRequest.join();
		
		
		driverAssignment.start();
		driverAssignment.join();
	
		liveTracking.start();
		liveTracking.join();
		
		
		paymentProcessing.start();
		paymentProcessing.join();
		
		ratingSystem.start();
		

	}

}





======================================================================================================================================================================================
	                                                                                                                                                 28-07-2025

	Find the output of the following code

Q1)
class Test extends Thread
{
	public void run()
	{
		for(int i=0; i<=10; i++)
		{
			System.out.println("Hello Welcome here.."+i);
		}
	}
}
class Test1 
{
	public static void main(String[] args) 
	{
		Test t = new Test();
		t.start();
		t.start();
	}
}

ans:-
	Exception in thread "main" java.lang.IllegalThreadStateException
        at java.base/java.lang.Thread.start(Thread.java:1517)
        at Main.main(Main.java:17)
Hello Welcome here..0
Hello Welcome here..1
Hello Welcome here..2
Hello Welcome here..3
Hello Welcome here..4
Hello Welcome here..5
Hello Welcome here..6
Hello Welcome here..7
Hello Welcome here..8
Hello Welcome here..9
Hello Welcome here..10



Q2)
class Test
{
    public static void main(String []args)
    {
        Thread t = Thread.currentThread();
		System.out.println(t);
        System.out.println("Name of thread  : "+t.getName());
		System.out.println("Id of thread  : "+t.getId());

    } 
}

Thread[#1,main,5,main]
Name of thread  : main
Id of thread  : 1

Q3) 
class Test
	{
 public static void main(String args[])
	{
    new Thread()
	{
    public void run()
	{
      System.out.println("task one");
    }
    }.start();

  new Thread()
  {
    public void run()
	{
      System.out.println("task two");
    }
  }.start();
  
 }
}
ans:-
	task one
        task two

	
Q4)
class Test
	{
 public static void main(String args[])
	{
  Runnable r1=new Runnable()
  {
    public void run()
	{
      System.out.println("task one");
    }
  };

  Runnable r2=new Runnable()
  {
    public void run()
	{
      System.out.println("task two");
    }
  };
    
  Thread t1=new Thread(r1);
  Thread t2=new Thread(r2);

  t1.start();
  t2.start();
 }
}

Q5)
class SimpleThread extends Thread 
{
   public SimpleThread(String str) 
	{
	super(str);
    }
    public void run() 
	{
	for (int i = 0; i < 10; i++) 
	{
	System.out.println(i + " " + getName());
    try 
	{
	sleep((int)(Math.random() * 1000));
	}
	catch (InterruptedException e) {}
	}
	System.out.println("DONE! " + getName());
    }
}
class Test
{
public static void main (String args[]) 
    {
        new SimpleThread("J2EE").start();
        new SimpleThread("J2ME").start();
    }
}
output:-

	0 J2ME
0 J2EE
1 J2ME
2 J2ME
1 J2EE
2 J2EE
3 J2ME
3 J2EE
4 J2ME
4 J2EE
5 J2ME
5 J2EE
6 J2ME
7 J2ME
6 J2EE
7 J2EE
8 J2EE
8 J2ME
9 J2EE
DONE! J2EE
9 J2ME
DONE! J2ME

Q6)

import java.io.*;
import java.util.*;
class Prime extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				if(i==2||i==3||i==5||i==7)
				{
					System.out.println ("Prime No.= "+i);
				}
				Thread.sleep(500);
			}
		}
		catch (Exception e){}
	}
}
class NotPrime extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<=10;i++)
			{
				if(i==4||i==6||i==8||i==9||i==10)
				{
					System.out.println ("Non-Prime No.= "+i);
				}
				Thread.sleep(500);
			}
		}
		catch (Exception e){}
	}
}
class Test
{
	public static void main(String args[])
	{
		new Prime().start();
		new NotPrime().start();
	}
}	


Prime No.= 2
Prime No.= 3
Non-Prime No.= 4
Prime No.= 5
Non-Prime No.= 6
Prime No.= 7
Non-Prime No.= 8
Non-Prime No.= 9
Non-Prime No.= 10

Q7)
public class Test21 extends Thread
{
	static Thread t;
	public static void main(String [] args)
	{
		try
		{
			t=new Thread(new Test21(),"Ravi");
			t.start();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	public void run()
	{
		for(int i=1; i<5; i++)
		{
			try
			{
				System.out.print(Thread.currentThread().getName()+"");
				t.start();
			}
			catch (Exception e)
			{
				System.out.println(" will not botther about but "+e+" happened "+i+" times");
			}
		}
	}
}
ans:-
Ravi will not botther about but java.lang.IllegalThreadStateException happened 1 times
Ravi will not botther about but java.lang.IllegalThreadStateException happened 2 times
Ravi will not botther about but java.lang.IllegalThreadStateException happened 3 times
Ravi will not botther about but java.lang.IllegalThreadStateException happened 4 times


Q8)

class Test22 
{
	public static void main(String[] args) 
	{		
		try
		{
			Horse h = new Horse();
			Thread t1= new Thread(h,"MyHorse");
			Thread t2= new Thread(h,"YourHorse");
			new Test22().go(t2);
			t1.start(); t2.start();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}

		void go(Thread t)
		{
			t.start();
		}		
	}
	
}
class Horse implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" ");
	}
}

Q9)

class Test23 
{
	public static void main(String[] args) 
	{
		try
		{
			Horse h = new Horse();
			Thread t1= new Thread(h,"MyHorse");
			Thread t2= new Thread(h,"YourHorse");
			new Test23().go(t2);
			t1.start(); t2.start();
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
	
		void go(Thread t)
		{
			t.start();
		}
	
	
}
class Horse implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" ");
	}
}
ans:-
java.lang.IllegalThreadStateException
MyHorse 
YourHorse 

Q10)

class Parrot implements Runnable
{
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" ");
	}
}
class Test26
{
	static Parrot p;

	static { p=new Parrot();}

	{Thread t1= new Thread(p,"Peacock"); t1.start();}

	public static void main(String [] args)
	{
		new Test26();

		new Thread( new Runnable()
		{
			public void run()
			{
				;
			}
		},"Koyal").start();

		new Thread(new Parrot(),"Parrot").start();
	}
	

	{
	  Thread t2 = new Thread(p,"Sparrow");t2.start();
	}

	}
Sparrow 
Peacock 
Parrot 

Q11)
class MyThreadA extends Thread
{
	String s;
	public void run(String s) 
	{ 
		this.s=s;
		for (;;) 
		{
			System.out.println("s will be printed :"+s);
		}
	}
}
class MyThreadB extends Thread 
{
	String t;
	public void run(String t) 
	{ 
		this.t=t;
		for (;;) 
		{
			System.out.println("t will be printed :"+t);
		}
	}
}
public class Test31
{
public static void main(String [] args) 
{
  MyThreadA t1 = new MyThreadA();
  MyThreadB t2 = new MyThreadB();
		t1.start();
		t2.start();
		
	}
}
no output:-

Q12)
public class Test44 extends Thread
{
public static void main(String argv[])
{
Test44 b = new Test44();
b.run();
b.start();
} 
public void start()
{
for (int i = 0; i < 10; i++)
{
System.out.println("Value of i = " + i); 
}  
}
}
ans:-
Value of i = 0
Value of i = 1
Value of i = 2
Value of i = 3
Value of i = 4
Value of i = 5
Value of i = 6
Value of i = 7
Value of i = 8
Value of i = 9
Q13)
class Test58 
{
	public static void main(String[] args) 
	{
		
	}
	System.out.println("Hello World!");
}
ans:-
error
Q14)
class Test61
{
public static void main(String[] args) 
{
Runnable r1 = new Runnable() 
{
public void run() 
{
try 
{
while (true) 
{
System.out.println("Hello, world!");
Thread.sleep(1000);
}
} 
catch (InterruptedException iex) {}
}
};

Runnable r2 = new Runnable() 
{
public void run() 
{
try
{
while (true) 
{
System.out.println("Goodbye, " +" Beautiful world!");
Thread.sleep(2000);
}
} 
catch (InterruptedException iex) {}
}
};

Thread thr1 = new Thread(r1);
Thread thr2 = new Thread(r2);
thr1.start();
thr2.start();
}
}

Q15)
class Test4
{
   public static void main(String []argv)
   {
      Thread t = Thread.currentThread();
      System.out.println("Name of current thead : "+t.getName());
      t.setName("First Thread");
      System.out.println("Name of thread after change : "+t.getName());
   } 
}

Q16)
class Test15 extends Thread
{
public void run()
{
System.out.println("PRINT ME");
}
public static void main(String []str)
{
try
{
for(int i=0;i<9;i++)
{
System.out.println(i);
Thread.sleep(500);
}
}
catch(InterruptedException e)
{
System.out.println("thread exception");
}
Thread t=new Thread();
t.start();
}
}

Q17)
class Foo implements Runnable
{
public void run() 
{
for(int i=0;i<3;i++)
System.out.println("Run by..."+Thread.currentThread().getName()+",i Is "+ i);
}
public void run(String name)
{
System.out.println("This is Second"+name);
}
}
public class Test18
{
public static void main(String args [])
{
Foo f = new Foo();
Thread t = new Thread(f);
try 
{
System.out.println("Number Will be printt After 500 MiliSecond..");
for(int j=0;j<5;j++)
{
System.out.println("This is j..."+j);
t.sleep(500);
}
}
catch(InterruptedException e) 
{
System.out.println("InterruptedException.."+ e);
e.printStackTrace();
}
}
}

Q18)
public class Test28 extends Thread
{
	public static void main(String [] args)
	{
		System.out.println(Thread.currentThread().getId()+" ");
		Thread t1 = new Thread(new Test28(),"Rahul");
		Thread t2 = new Thread(new Test28(),"Ravi");
		Thread t3 = new Thread(new Test28(),"Puja");
		t3.start();
		t1.start();
		t2.run();
		t2.start();
	}
	public  void run()
	{
		    for(int i=0; i<2; i++)
			System.out.println(Thread.currentThread().getName()+" I'm :"+i);
			System.out.println("It is end of loop");
	}
}

Q19)

class MyThread extends Thread 
{
public void run() 
{
		for (int i=0; i < 10; i++) 
		{
			System.out.println("hello world1");
		}
	}
}
public class Test36
{
public static void main(String [] args) 
{
MyThread t1 = new MyThread();
t1.start();
try 
{
t1.join(); 
} 
catch (InterruptedException e) 
{
System.out.println("ERROR: Thread was interrupted");
}       
System.out.println("Thread is done!");
	}
}

Q20)
public class JoinDemo1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Main thread started");
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		
		for(int i=1; i<=5; i++)
		{			
			System.out.println(i + " by "+name+ " thread ");
			Thread.sleep(1000);
			thread.join(); 
		}		
		System.out.println("Main thread ended");
	}

}



====================================================================================================================================================================================
	
  																					29-07-1015
Q1)
---
Your task is to create a Java program that simulates a scenario where multiple cars arrive at a petrol pump for refilling. 
The program should utilize multithreading concepts with synchronization to manage concurrent refilling operations at the petrol pump.
The main goal is to observe and record which car completes the refilling process first.

Instructions:

PetrolPump Class:

Create a PetrolPump class with the following attribute and method:
refillCar(String carName): A synchronized method simulating the refilling process. Ensure that only one car can execute this method at a time.
Simulation Details:
In the refillCar method, print messages to indicate when a car starts and completes refilling. Use the format: <CarName> started refilling... and <CarName> completed refilling!.
Implement a sleep period in the refillCar method (e.g., Thread.sleep(3000)) to simulate the time it takes for a car to refill.

Car Class:

Create a Car class that implements the Runnable interface. Include the following members:
name (String): The name of the car.
petrolPump (PetrolPump): A reference to the petrol pump.
run(): Implement the run method from the Runnable interface. Inside this method, call the refillCar method of the petrol pump to simulate the refilling process.

PetrolPumpSimulation Class (Main):

In the main method, create an instance of PetrolPump.
Create an array of Car objects, each initialized with a unique name and the reference to the petrol pump.
Create an array of Thread objects to represent each car's thread.
Start each car thread and wait for all car threads to complete using the join method.


Note:

Use the synchronized keyword to achieve synchronization without using Semaphore.
Ensure proper exception handling for InterruptedException.
Your implementation should be well-documented with comments explaining the logic of each class and method.
Adjust the sleep time and other parameters based on your desired simulation.

Output :
---------
<Ford> started filling
<Ford> completed filling
<Naxon> started filling
<Naxon> completed filling
<Maruti> started filling
<Maruti> completed filling

	
=====================================================================================================================
	            											30-07-2025

	Find out the output of the following Program :

Q1)
public class Test45 extends Thread
{
static String sName = "good";
public static void main(String argv[]) 
{
Test45 t = new Test45();
t.nameTest(sName);

System.out.println(sName);    
}

public void nameTest(String sName)
{
sName = sName + " idea ";
start();
}

public void run()
{
for(int i=0; i<4; i++)
{
 sName = sName + " " + i;
}
}

}
ans:-
	good
---------------------------------------------------------------------
Q2)
public class Test46
{
public static void main(String argv[])
{
	Test1 pm1 = new Test1("One");
	pm1.run();
	Test1 pm2 = new Test1("Two");
	pm2.run();

}
}
class Test1 extends Thread
{
private String sTname="";
Test1(String s)
{
	sTname = s;

}
public void run()
{
for(int i =0; i < 5 ; i++)
{
try
{
sleep(1000);
}
catch(InterruptedException e)
{}
Thread.yield();
System.out.println(sTname);
}

}
}
ans:-
One
One
One
One
One
Two
Two
Two
Two
Two
----------------------------------------------------------------------
Q3)

class Test55 extends Thread 
{
	static Thread tf, ts;

	public synchronized void run()
	{
		System.out.println(Thread.currentThread().getName()+"");
		ts.start();
	}

	public static void main(String[] args) 
	{
		tf = new Thread(new Test55(),"SCJP");
		ts = new Thread(new Test55(),"SCJWD");
		tf.start();
	}

}
-----------------------------------------------------------------------
Q4)
public class Test56 implements Runnable
{
 public void run() 
 {
	 try
	 {
		 System.out.println("run.");
         throw new RuntimeException("Problem");
		
	 }
	 catch (Exception e)
	 {
		 System.out.println("Handled");
	 }
 
 }
 public static void main(String[] args) 
 {
 Thread t = new Thread(new Test56());
 t.start();
 System.out.println("End of method.");
 }
}
----------------------------------------------------------------------
Q5)
public class Test59
{
public static void main(String [] args) 
{
      myRunnable r = new myRunnable();

      Thread t1 = new Thread();
      Thread t2 = new Thread();

      t1.setName("Thread One");
      t2.setName("Thread Two");

      t1.start();
      t2.start();

      System.out.println("Mains Thread: " + Thread.currentThread().getName());
   }
}

class myRunnable implements Runnable 
{
public void run() 
{
      for ( int i = 1; i < 4; i++) 
      System.out.println("Thread: " + Thread.currentThread().getName());
}
}
----------------------------------------------------------------------
Q6)


class Test {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        });
        t.run();
        System.out.println("Main thread finished");
    }
}
----------------------------------------------------------------------
Q7)

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getCount());
    }
}
--------------------------------------------------------------------
Q8)

class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            System.out.println("Thread-1 running");
        });

        t1.start();
        t1.join();
        t1.start();
    }
}
---------------------------------------------------------------------
Q9)

class Test {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " is running");
        });

        t.start();
        t.run();
    }
}
----------------------------------------------------------------------
Q10)

class Test {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        };

        Thread t1 = new Thread(task, "Thread-1");
        Thread t2 = new Thread(task, "Thread-2");

        t1.start();
        t2.run();
    }
}

----------------------------------------------------------------------
Q11)
class A implements Runnable 
{  
  public void run() 
  {
     System.out.print(Thread.currentThread().getName());
  }  
}  
class B implements Runnable
{  
  public void run() 
  {  
    new A().run();  
    new Thread(new A(),"T2").run();  
    new Thread(new A(),"T3").start();  
   }
}  
public class Test
{  
  public static void main (String[] args) 
  {  
    new Thread(new B(),"T1").start();  
  }
}

Q12)
public class Test extends Thread 
{
static String name = "ravi";

public static void main(String args[]) 
{
Test t = new Test();
t.Test(name);
System.out.print(" " + name);
}

public void Test(String name) {
start();
System.out.print(" method");
}

public void run() {
System.out.print(" run");
}
}

Q13)

class Job extends Thread 
{
    private Integer number = 0;
    public void run() 
    {
        for (int i = 1; i < 1000000; i++) 
	{
            number++;
        }
    }
    public Integer getNumber() 
    {
        return number;
    }
}
public class Test {
    public static void main(String[] args) {
        Job thread = new Job();
        thread.start();
		try
		{
			thread.join();
		}
		catch (Exception e)
		{
		}
        System.out.println(thread.getNumber());
    }
}


Q14)
class MyData extends Thread
{
private boolean request;
private String  data;
public void run()
	{
		storeMessage("Hello");
		String str=retrieveMessage();
		System.out.println(str);
	}
public synchronized void storeMessage(String data) 
  {
      request = true;
      this.data = data;
  }

  public synchronized String retrieveMessage() 
  {
    request = false;
    return data+" : "+request;
  }
 }
public class Test
{
	public static void main(String[] args) 
	{
		MyData md = new MyData();
		md.start();
        	
		
	}
}

Q15)
public class Test extends Thread {

    public static void main(String[] args) throws Exception {
    Test t = new Test();
    t.start();
    t.method();
    }

    public void run() {
    System.out.println("run");
    }

    public void method() {
	hello();
    System.out.println("method");
}

public void hello()
	{
	hello1();
	System.out.println("PR");
	}

	public void hello1()
	{
	
	System.out.println("RR");
	}
}


Q16)
class Test 
{
	public static void main(String[] args) 
	{
		Runnable r = new Runnable() {
 public void run() {
 System.out.print("Cat");
 }
 };
 Thread t = new Thread(r) {
 public void run() {
 System.out.print("Dog");
 }
 };
 t.start();
		
	}
}


Q17)

class MyThread extends Thread
{
	public void run()
	{
		System.out.println("MyThread: run()");
	}

	public void start()
	{
		System.out.println("MyThread: start()");
	}
}

class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("MyRunnable: run()");
	}

	public void start()
	{
		System.out.println("MyRunnable: start()");
	}
}

public class Test 
{
	public static void main(String args[])
	{
		MyThread myThread  =  new MyThread();
		MyRunnable myRunnable = new MyRunnable();
		Thread thread  =  new Thread(myRunnable);
		myThread.start();
		thread.start();
	}
}


Q18)

class MyThread extends Thread
{
	String myName;

	MyThread(String name)
	{
		myName = name;
	}

	public void run()
	{
		for(int i=0; i<10;i++)
		{
			System.out.println(myName);
		}
	}
}
public class Test
{
	public static void main(String args[])
	{
		try
		{
			MyThread mt1 = new MyThread("mt1");
			MyThread mt2 = new MyThread("mt2");
			mt1.start();
			mt1.join();
			mt2.start();
		}
		catch(InterruptedException ex)
		{
		}
	}
}


Q19)
class MyThread implements Runnable
{
	String str;
	MyThread(String str)
	{
		this.str=str;
	}
	public void run()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(str+ " : "+i);
			try
			{
				Thread.sleep(100);
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
public class Test
{
	public static void main(String [] args)
	{
	MyThread obj1 = new MyThread("Cut the Ticket");
	MyThread obj2 = new MyThread(" Show the Seat");

		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);

		t1.start();
		t2.start();

	}
}

Q20)
public class Test76 
{
public static void main(String[] args) 
{
 new Test76().go();
 }
 public void go() 
 {
 Runnable r = new Runnable()
 {
 public void run() 
 {
 System.out.println("foo");
 }};
  Thread t = new Thread(r);
  t.start();
  t.run();
 }
 }
-----------------------------------------------------------------------

========================================================================================================================================================================================
	                                                                                                                                                       31-07-2025

	Develop a scenario based program by using ITC to complete offline 
Order Delivery System in a Restaurant.

The scenario is :
A Restaurant waiter will place the food to order to chef and waiting for 
food preparation.
A Restaurant chef will prepare the food and notify the waiter after 
preparation.

Coding Requirements:
--------------------
Create a BLC class called Restaurant.

Fields/Attributes/Properties [private access modifier]
------------------------------------------------------
name:String
order:String 
boolean isOrderReady = false; //[Initial Order Status]
    
Take a paraneterized constructor to initialize the Restaurant name.

Methods :
---------    
    1) Method Name 		: placeOrder()
       Parameter   		: order of type STring
       Return Type 		: void
       Access modifier		: public
       Modifier			: synchronized
       In this method initialize the order through parameter variable. After
       placing the order, Waiter will Wait until chef notifies that food is ready. Once waiter will get notification from chef, Waiter can serve 
       the food.

   2) Method Name 		: prepareOrder()
       Parameter   		: No Parameter
       Return Type 		: void
       Access modifier		: public
       Modifier			: synchronized
       In this method chef will prepare the food.It will take some time 
       based on food. After food preparation, It will notify to the waiter
       so waiter can server the food.

    3) Create a getter method getRestaurantName() to get the name of the 
       Restaurant.

Take another BLC class called Waiter which extends from Thread

Fields/Attributes/Properties [private access modifier]
------------------------------------------------------
  restaurant Restaurant
  orderName  String

Take a parameterized constructor to initialize the restaurant property.

Methods :
---------    
    1) Method Name 		: acceptOrder()
       Parameter   		: orderName of type STring
       Return Type 		: void
       Access modifier		: public
       In this method take the order from the customer and initialize non static variable.

   2) Override the run method, inside this run method place the customer oder
      in the Restaurant for preparation.

Take another BLC class called Chef which extends from Thread

Fields/Attributes/Properties [private access modifier]
------------------------------------------------------
  restaurant Restaurant

  Take a parameterized constructor to initialize the restaurant property.

Methods :
---------    
   1) Override the run method, inside this run method prepare the customer oder
      in the Restaurant for serving.


Create one ELC class RestaurantSystem to get the following order of Output :

Output Format :
----------------
Welcome to KFC Restaurant!!!
Waiter: Placed order for fried chicken
Chef: Preparing fried chicken
Chef: fried chicken is ready!
Waiter: Serving the fried chicken


package com.threading.com;

public class Restaurant {
	private String name;
	private String order;
	private boolean isOrderReady=false;
	public Restaurant(String name) {
		super();
		this.name = name;
		
	}
	
	public synchronized void placeOrder(String order)
	{
		this.order=order;
		System.out.println("Waiter: Placed order for "+order);
		
		try {
			while(!isOrderReady)
			wait(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Waiter: Serving the "+order);
		
	}
	
	public synchronized void prepareOrder()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Chef: Preparing "+ order);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		isOrderReady=true;
		System.out.println("Chef: "+order+" is ready");
		
		notify();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	public String getRestaurantName()
	{
		return name;
	}

}

package com.threading.com;

public class Waiter extends Thread {
	private Restaurant restaurant;
	private String orderName;
	public Waiter(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}
	
	public void acceptOrder(String orderName) {
		
		this.orderName=orderName;
	}
	@Override
	public void run() {
		restaurant.placeOrder(orderName);
		
	}
	

}

package com.threading.com;

public class Chef extends Thread {
	private Restaurant restaurant;

	public Chef(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}
	
	@Override
	public void run() {
		restaurant.prepareOrder();
		
	}

}



package com.threading.com;

public class RestaurantSystem {

	public static void main(String[] args) throws InterruptedException {
		Restaurant r=new Restaurant("KFC");
		System.out.println("Welcome to "+r.getRestaurantName()+" Restaurant!!!");
		
		Thread.sleep(2000);
		Waiter w=new Waiter(r);
		
		Chef c=new Chef(r);
		
		w.acceptOrder("fried chicken");
		
		w.start();
		c.start();
		

	}

}


======================================================================================================================================================================================
																				01-08-2025

	


Develop a program by using ITC, where two customers called Depositor and Drawer
will deposit and withdraw the money respectively from the ATM machine.

Create a BLC class called Account
    Instance Variable :
    private int balance = 0; (Initial Balance is 0)
    
    Methods :
    ---------
    1)
    Create a synchronized method withdraw :
    Name of the method : withdraw
    modifier : public 
    Parameter : int amount
    
    Inside this method write the logic to verify that current balance should not
    be less than withdraw amount by using while loop, if the current balance is 
    less than withdraw amount then put the current thread into wait method.
    
    Inside the method write the logic to withdraw the amount if balance is 
    not less than withdraw amount and print the updated balance.
    
    notify any other thread which are waiting on the same object for the lock.
    
    2) Create a synchronized method deposit
    Name of the method : deposit
    modifier : public 
    Parameter : int amount
    
    In this method write the logic to deposit the amount, print the updated
    balance, notify the waiting thread which is waiting for withdraw the 
    amount.
    
 Create another BLC class Drawer which extends from Thread class
    Instance Variable :
    private Account account;  //HAS-A Relation
    
    Initialize the Object properties by using parameterized constructor.
    
    Override run() method :
    inside run method create an array variable of type int withdrawals which 
    will accept multiple amount in int value.
    
    create a for each loop to accept these integer value one by one and pass these 
    value to withdraw the amount. In each withdraw process you should have 1 sec
    waiting period.
    
 Create another BLC class Depositor which extends from Thread class
    Instance Variable :
    private Account account;  //HAS-A Relation
    
    Initialize the Object properties by using parameterized constructor.
    
    Override run() method :
    inside run method create an array variable of type int deposits which 
    will accept multiple amount in int value.
    
    create a for each loop to accept these integer value one by one and pass these 
    value to deposit the amount. In each deposit process you should have 1 sec
    waiting period.
    
 Create an ELC class ATMMachine, inside main method create object as per 
 requirement, start both the threads to see inter thread communication result

ans:-   
package com.threading.com;

public class Account {
	private int balance=0;
	
	public synchronized void withdraw(int amount) 
	{
		while(amount>this.balance)
		{
			System.out.println("insufficeint balance");
			try {
			wait();
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("withdraw the amount is : "+amount);
		this.balance=balance-amount;
		System.out.println("successfully withdraw !!!");
		
		
	}
	
	public synchronized void deposit(int amount)
	{
		System.out.println("deposite the amount is : "+amount);
		this.balance+=amount;
		System.out.println("deposite succefully!!!");
		notify();
	}
	public int getBalance()
	{
		return this.balance;
	}

}


package com.threading.com;

public class Depositor extends Thread {
	private Account account;

	public Depositor(Account account) {
		super();
		this.account = account;
	}
	
	@Override
	public void run() {
		int deposits[]=new int[5];
		deposits[0]=100;
	   deposits[1]=50;
 	deposits[3]=150;
 	deposits[4]=300;
		
		for(int i:deposits)
		{
			account.deposit(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}


package com.threading.com;

public class Drawer extends Thread {
	private Account account;

	public Drawer(Account account) {
		super();
		this.account = account;
	}
	
	
	@Override
	public void run() {
		int withdrawals[]=new int[5];
		withdrawals[0]=50;
        withdrawals[1]=100;
		withdrawals[3]=150;
		withdrawals[4]=300;
		
		for(int i:withdrawals)
		{
			account.withdraw(i);
			try {
			Thread.sleep(1000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
				
	}
	

}

output:-
	
insufficeint balance
deposite the amount is : 100
deposite succefully!!!
withdraw the amount is : 50
successfully withdraw !!!
deposite the amount is : 50
deposite succefully!!!
withdraw the amount is : 100
successfully withdraw !!!
deposite the amount is : 0
deposite succefully!!!
withdraw the amount is : 0
successfully withdraw !!!
deposite the amount is : 150
deposite succefully!!!
withdraw the amount is : 150
successfully withdraw !!!
deposite the amount is : 300
deposite succefully!!!
withdraw the amount is : 300
successfully withdraw !!!
total balance is 0



	
	
 --------------------------------------------------------------------------------------------
 1.	What is the output of the following code
public class MultiThread implements Runnable
{
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new MultiThread());
		thread.start();
		System.out.print("nit ");
		thread.join();
		System.out.println("google ");
	}
	@Override
	public void run() {
		System.out.println("NareshIT");
	}
}


2.	What is the output of the following code
class Test extends Thread
{
	@Override
	public void run() {
		System.out.println("Run");
		super.run();
	}
	
	@Override
	public synchronized void start() {
		System.out.println("Start");
		super.start();
	}	
}
public class MultiThread
{
	public static void main(String[] args) {
		nit();
	}
	
	static public void nit() {
		Test test = new Test();
		test.start();
	}
}


3.	What is the output of the following code
class Test extends Thread
{
	int a;
	public void run() {
		a++;
	}
}
public class MultiThread
{
	public static void main(String[] args) {
		Test test = new Test();
		test.run();
		System.out.println(test.a);
		test.start();
		System.out.println(test.a);
		System.out.println(test.isAlive());
		System.out.println(test.getName());		
	}
}


4.	What is the output of the following code
public class MultiThread extends Thread
{
	public void run() {
		System.out.println(Thread.currentThread().getId());
	}
	public static void main(String[] args) {
		MultiThread nit = new MultiThread();
		for(int i=0;i<10;i++)
		{
			nit.start();
		}
	}
}


5.	What is the output of the following code
public class MultiThread extends Thread
{
	public void run() {
		System.out.print(Thread.currentThread().getId()+" ");
	}
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			MultiThread nit = new MultiThread();
			nit.start();
		}
	}
}


6.	What is the output of the following code
public class MultiThread extends Thread
{
	public void run() {
		System.out.print(Thread.currentThread().getId()+" ");
	}
	
	@Override
	public void start() {
		System.out.print(Thread.currentThread().getName()+" ");
	}
	
	public static void main(String[] args) {
		MultiThread nit = new MultiThread();
		for(int i=0;i<10;i++)
		{
			nit.start();
		}
	}
}

7.	What is the output of the following code
public class MultiThread extends Thread
{
	public void run() {
		System.out.print(Thread.currentThread().getId()+" ");
	}
	
	@Override
	public void start() {
		System.out.print(Thread.currentThread().getName()+" ");
	}
	
	public static void main(String[] args) {
		MultiThread nit = new MultiThread();
		for(int i=0;i<10;i++)
		{
			nit.run();
		}
	}
}

8.	What is the output of the following program
public class MultiThread implements Runnable
{
	Thread thread;
	public MultiThread() {
		thread = new Thread(this);
		thread.start();
	}
	public void run() {
		System.out.println(thread);
		
	}	
	public static void main(String[] args) {
		new MultiThread();
	}
}


9.	What is the output of the following program
public class MultiThread implements Runnable
{
	Thread thread;
	public MultiThread() {
		thread = new Thread(this,"NareshIT");
		thread.setPriority(6);
		thread.start();
	}
	public void run() {
		System.out.println(thread);
		
	}
	public static void main(String[] args) {
		new MultiThread();
	}
}


10.	What is the output of the following program
public class MultiThread extends Thread
{	
	public static void main(String[] args) {
		MultiThread m1 = new MultiThread();
		MultiThread m2 = new MultiThread();
		MultiThread m3 = new MultiThread();
		m1.start();
		m2.start();
		m3.start();
	}
	
public void run() {
		System.out.println(Thread.currentThread().getName());
	}
}


===========================================================================================================================================================================================

	              																		02-08-2025

	
ProducerConsumerTracker
Thread Communication using wait() and notify()
Problem Statement:

You are developing a data processing system where one thread (Producer) is responsible for generating integer data (from 1 to 5), and another thread (Consumer) consumes and prints each number. The Producer and Consumer must strictly alternate using wait() and notify() for communication.

You must ensure:

The Producer produces one number at a time.

The Consumer prints the same number before the next number is produced.

The output follows a strict alternating sequence with no skipping, no duplication, and no overlapping.


Class & Method Requirements:

Class: SharedData

Instance Variables:

int number – stores the produced number.

boolean produced – flag to control alternation.

Methods:

public synchronized void produce(int value)

public synchronized void consume()

Class: Producer implements Runnable

Instance Variables:

SharedData data

int limit

Method:

public void run()

Class: Consumer implements Runnable

Instance Variables:

SharedData data

int limit

Method:

public void run()

Main Class:  ProducerConsumerTracker 

Prompt the user for input using Scanner.

Create instances of SharedData, Producer, and Consumer.

Start both threads.

Validate user input for correctness.
Sample Input
3
Sample Output
Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
Produced: 3
Consumed: 3
Constraints:
Input must be a positive integer.

Only core Java concurrency features (wait(), notify(), synchronized) should be used.
Input:
3

Expected Output:
Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
Produced: 3
Consumed: 3

Input:
5

Expected Output:
Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
Produced: 3
Consumed: 3
Produced: 4
Consumed: 4
Produced: 5
Consumed: 5
Input:
1

Expected Output:
Produced: 1
Consumed: 1

Input:
-2

Expected Output:
Invalid input! Limit must be a positive integer.


Input:
abc

Expected Output:
Invalid input! Please enter a numeric value.



package com.threading.com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProducerConsumerTracker {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int number=0;
		try {
          number=sc.nextInt(); 
          if(number<1)
          {
        	  System.out.println("Invalid input! Limit must be a positive integer.");
        	  System.exit(0);
          }
        
     
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid input! Please enter a numeric value.");
		}
        
        
   

        SharedData sharedData=new SharedData();

        Producer  producer=new Producer(sharedData,number);
        Consumer consumer=new Consumer(sharedData,number);

        producer.start();
        consumer.start();

	}

}

class SharedData
{
    int number;
    boolean product;
   

      public synchronized void produce(int value)
      {
        System.out.println("Produced: "+value);
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        this.number=value;
        try{
        wait();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

      }
      public synchronized void consume()
      {
    	  try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Consumed: "+number);
        notify();

      }
    
}
class Producer extends Thread
{
    public SharedData data;
    int limit;
   
    public Producer(SharedData data,int limit)
    {
        this.data=data;
        this.limit=limit;

    }
    public void run()
    {
      for(int i=1;i<=limit;i++)
      {
        data.produce(i);
        
      }
    }
}
class Consumer extends Thread
{
 public SharedData data;
 int limit;

 public Consumer(SharedData data,int limit)
 {
    this.data=data;
    this.limit=limit;
 }

 public void run()
 {
   for(int i=1;i<=limit;i++)
      {
	   try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        data.consume();
        
			
		
      }

 }
}


i




