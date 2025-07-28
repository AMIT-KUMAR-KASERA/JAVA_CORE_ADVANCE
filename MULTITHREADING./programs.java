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














