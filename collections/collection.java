=========================================================================================================================================================================================================================================
 08-08-2025

Q1)What will be the output of the following Java code?

import java.util.*;
class VectorDemo
{
public static void main(String args[])
{
Vector obj = new Vector(4,2);
obj.addElement(new Integer(3));
obj.addElement(new Integer(2));
obj.addElement(new Integer(5));
System.out.println(obj.elementAt(1));
}
}

Q2) What will be the output of the following Java code?
import java.util.*;
class VectorDemo 
{
 public static void main(String args[]) 
 {
 Vector obj = new Vector(4,2);
 obj.addElement(new Integer(3));
 obj.addElement(new Integer(2));
 obj.addElement(new Integer(5));
 System.out.println(obj.capacity());
 }
 }

Q3) What will be the output of the following Java code?
import java.util.*;
class VectorDemo 
{
 public static void main(String args[]) {
 Vector obj = new Vector(4,2);
 obj.addElement(new Integer(3));
 obj.addElement(new Integer(2));
 obj.addElement(new Integer(6));
 obj.insertElementAt(new Integer(8), 2);
 System.out.println(obj);
 } 
}

Q4) What will be the output of the following Java code?
import java.util.*;
class VectorDemo 
{
 public static void main(String args[]) 
 {
 Vector obj = new Vector(4,2);
 obj.addElement(new Integer(3));
 obj.addElement(new Integer(2));
 obj.addElement(new Integer(5));
 obj.removeAll(obj);
 System.out.println(obj.isEmpty());
 }
 }

Q5) What will be the output of the following Java program?
import java.util.Vector;
public class Test 
{
    public static void main(String[] args) 
    {
        Vector<String> v1 = new Vector<>();
        Vector<String> v2 = new Vector<>();

        v1.add("Java");
        v1.add("Technology");

        v2.add("Java");
        v2.add("Technology");

        System.out.println(v1.equals(v2));
        System.out.println(v1.hashCode());
        System.out.println(v2.hashCode());
    }
}

Q6) What will be the output of the following Java program?
import java.util.ArrayList;
public class Test 
{
	public static void main(String args[]) 
	{
		ArrayList<String> obj1 = new ArrayList<String>();
		ArrayList<String> obj2 = new ArrayList<String>();
		obj1.add("A");
		obj1.add("B");
		obj2.add("A");
		obj2.add(1, "B");
		System.out.println(obj1.equals(obj2));
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}

Q7) What will be the output of the following Java program?
import java.util.ArrayList;
import java.util.List;
public class ArrayListTest 
{
public static void main(String[] args)
{
 List<String> list = new ArrayList<String>();
 list.add("Patna");
 list.add(0, "New York");
 list.add("Mumbai");
 list.add(2, "Sydney");
 System.out.println(list);
 }
}

Q8) What will be the output of the following Java program?
import java.util.List;
public class ArrayListTest 
{
public static void main(String[] args)
{
 List<String> list = new ArrayList<String>();
 list.add("Orange");
 list.add(0, "Banana");
 
 ArrayList<String> arList = new ArrayList<>();
 arList.add("Apple");
 list.add("Grapes");
 list.addAll(3, arList);
 System.out.println(list);
 }
}

Q9) What will be the output of the following Java program?
import java.util.ArrayList;
public class ArrayListTest {
public static void main(String[] args)
{
 ArrayList<String> list = new ArrayList<String>();
 list.add(null);
 list.add(0, "A");
 list.add(3, "B");
 list.add(1, "C");
 System.out.println(list);
 }
}

Q10) What will be the output of the following Java program?
import java.util.ArrayList;
public class ArrayListTest {
public static void main(String[] args)
{
 ArrayList<String> list = new ArrayList<String>();
 list.add(null);
 list.add(0, "A");
 list.add(2, "B");
 list.add(1, "C");
 System.out.println(list);
 }
}

Q11) What is the output of the following code.
import java.util.ArrayList;
public class ArrayListTest {
public static void main(String[] args)
{
 ArrayList<String> list = new ArrayList<String>();
 list.add(null);
 list.add(0, "A");
 list.add(null);
 list.add(2, "B");
 list.add("20");
 list.add(1, "C");
 System.out.println(list);
 }
}


Q12) What is the output of the following code.
import java.util.ArrayList;
public class ArrayListTest {
public static void main(String[] args)
{
 ArrayList<String> list = new ArrayList<String>();
 list.add(null);
 list.add(0, "A");
 list.add(null);
 list.add(2, "B");
 list.add("20");
 list.add(1, "C");
 System.out.println(list);
 }
}

Q13) What is the output of the following code.
import java.util.ArrayList;
public class ArrayListTest {
public static void main(String[] args)
{
 ArrayList<String> list = new ArrayList<>();
 list.add(12);
 list.add(16);
 list.add(34);
 list.add(78);
 list.remove(12);
 System.out.println(list);
 }
}

Q14) What is the output of the following code.
import java.util.ArrayList;
public class ArrayListTest {
public static void main(String[] args)
{
 ArrayList<String> list = new ArrayList<>();
 list.add('a');
 list.add('b');
 list.add('c');
 list.add('d');
 list.remove('c');
 System.out.println(list);
 }
}

Q15) What is the output of the following code.
import java.util.ArrayList;
public class ArrayListTest {
public static void main(String[] args)
{
 ArrayList<String> list = new ArrayList<>();
 list.add(12);
 list.add(16);
 list.add(34);
 list.add(78);
 list.remove(Integer.valueOf(16));
 System.out.println(list);
 }
}


Q16) What is the output of the following code.

package com.ravi.list_demo;
import java.util.*;
public class Test 
{
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");

        List<String> vector = new Vector<>();
        vector.add("Java");
        vector.add("Python");

        System.out.println(list.equals(vector));
    }
}

Q17) What is the output of the following code.

package com.ravi.list_demo;

import java.util.ArrayList;
import java.util.Vector;

class Person 
{
    String name;
    int age;

    Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) 
    {
      if(obj instanceof Person p2)
      {           
        if(this.age == p2.age && this.name.equals(p2.name))
        {
    	  return true;
        }
        else
        {
    	  return false;
        }
      }
      else
      {
    	  System.err.println("Comparison is not possible");
    	  return false;
      }     
    }

    public int hashCode() 
    {
        return name.hashCode() + age;
    }
}

public class Test
{
    public static void main(String[] args) 
    {
        Vector<Person> v1 = new Vector<>();
        ArrayList<Person> a1 = new ArrayList<>();

        v1.add(new Person("Alice", 30));
        a1.add(new Person("Alice", 30));

        System.out.println(v1.equals(a1));
        System.out.println(v1.hashCode());
        System.out.println(a1.hashCode());
    }
}

Q18) What is the output of the following code :
package com.ravi.list_demo;

import java.util.ArrayList;
import java.util.Vector;

class Person 
{
    String name;
    int age;

    Person(String name, int age) 
    {
        this.name = name;
        this.age = age;
    }

 }

public class Test
{
    public static void main(String[] args) 
    {
        Vector<Person> v1 = new Vector<>();
        ArrayList<Person> a1 = new ArrayList<>();

        v1.add(new Person("Alice", 30));
        a1.add(new Person("Alice", 30));

        System.out.println(v1.equals(a1));
        System.out.println(v1.hashCode());
        System.out.println(a1.hashCode());
    }
}

Q19) Which scenario is not a good use case for Vector?
A) You need a resizable array in a multi-threaded context.
B) You need frequent random access to elements.
C) You are working in a single-threaded high-performance system.
D) You need synchronized access to list data.

Q20) Which of these supports fail-fast behavior when modified during iteration?
A) Vector
B) ArrayList
C) Both
D) Neither
====================================================================================================
09-08-2025(Test)

		Q1.   What happens if the internal buffer of a StringBuilder overflows?

 a) Throws BufferOverflowException
 b) Allocates a larger internal buffer automatically
 c) Throws OutOfMemoryError
 d) Nothing; it breaks

Q2.   Which class is faster for single-threaded environments?

 StringBuffer
 StringBuilder
 String
 StringLogical

Q3.   Which method is called by the garbage collector before an object is removed?

 a) clone()


 b) finalize()


 c) toString()


 d) equals()

Q4.   Which of the following is NOT true about StringLogical operations?

 a) They include operations like concatenation, comparison


 b) Strings in Java support logical AND and OR operators directly


 c) Strings are compared using equals() method


 d) Logical operations with strings require methods, not operators

Q5.   Which of the following classes represents an immutable sequence of characters in Java?

 a) StringBuffer


 b) StringBuilder


 c) String


 d) StringLogical


Q6.   Is the clone() method by default a shallow or deep copy?

 a) Shallow copy


 b) Deep copy


 c) Both depending on object


 d) Not applicable

Q7.   Why is String immutable in Java?

 a) For security and thread safety


 b) To save memory only


 c) Because it’s a subclass of Object


 d) To allow cloning

Q8.   Which method of StringBuffer class reverses the contents of the buffer?

 a) reverse()


 b) invert()


 c) swap()


 d) flip()

Q9.   What is the main benefit of using StringBuilder over String for string concatenation?

 a) StringBuilder is immutable


 b) StringBuilder is mutable and more efficient


 c) String does not allow concatenation


 d) StringBuilder uses less memory always

Q10.   How do you convert a StringBuilder object to a String?

 a) clone() method


 b) toString() method


 c) finalize() method


 d) equals() method


Q11.   What is the default capacity of a newly created StringBuilder object?

 8

 16

 32

 64
Q12.   How can you initialize a StringBuffer with a preset capacity of 20?

 a) new StringBuffer()


 b) new StringBuffer(20)


 c) new StringBuffer("20")


 d) new StringBuffer.length(20)



Q13.   When a String object is modified, what happens internally?

 a) The same object is modified


 b) A new String object is created


 c) StringBuffer modifies it


 d) Error is thrown

Q14.   What does the clone() method do in Java Object class?

 a) Deletes the object


 b) Creates and returns a copy of the object


 c) Causes a compile-time error


 d) Finalizes the object

Q15.   Which statement about finalize() is correct?

 a) It is used to copy objects


 b) It is called by the garbage collector before destroying an object


 c) It guarantees object destruction immediately


 d) It can be invoked explicitly by the programmer safely



Q16.   StringBuilder class is found in which package?

 a) java.util


 b) java.lang


 c) java.io


 d) java.string

Q17.   Which keyword is used to prevent a method from being overridden?

 a) static

 b) final


 c) synchronized


 d) abstract

Q18.   Which class is synchronized and thus thread-safe?

 a) StringBuilder


 b) StringBuffer


 c) String


 d) None of the above
Q19.   Can StringBuffer and StringBuilder objects be directly converted into each other?

 a) Yes, by casting


 b) No, use String as an intermediary


 c) Yes, using clone() method


 d) No, they are incompatible

Q20.   Which of these methods is NOT available in StringBuffer or StringBuilder?

 a) append()


 b) insert()


 c) pop()


 d) reverse()





============================================================

Longest_Common_Prefix
 Longest Common Prefix Finder
 Problem Description:
Given an array of strings, write a function to return the longest common prefix among them.
If there is no common prefix, return an empty string "".

 Input Format:
First line: an integer n — the number of strings in the array
(Constraints: 1 ≤ n ≤ 200)

After that take : required string for the array 

[NOTE ]:For taking the String input don't use the nextLine() method only use the next()

📤 Output Format:
Print the longest common prefix shared among all strings.

If no prefix exists, print an empty string ("").
Sample Input
flower, flow, flight
Sample Output
fl
Constraints:
Constraints:
1 ≤ n ≤ 200

1 ≤ length of each string ≤ 200

Input:
3 flower flow flight

Expected Output:
fl


Input:
3 dog racecar car


Input:
3 interspecies interstellar interstate

Expected Output:
inters

Input:
1 hello

Expected Output:
hello

Input:
2 abc abcde

Expected Output:
abc
Input:
2 abc xyz

Expected Output:



Anagram_Checker
Problem Description:
You are given two strings. Your task is to write a function that returns true if both strings are anagrams of each other. An anagram is formed by rearranging the characters of one string to get the other string.

 Input Format:
Two strings str1 and str2 (lowercase letters only)

 Output Format:
Return true if they are anagrams

Return false otherwise
Sample Input
listen, silent
Sample Output
true
Constraints:
Constraints:
1 ≤ str1.length, str2.length ≤ 10⁴


Input:
listen silent

Expected Output:
true


Input:
triangle integral

Expected Output:
true


Input:
apple pale

Expected Output:
false


Input:
abc abcd

Expected Output:
false


Given two strings s1 and s2, determine if s2 is a rotation of s1 using only one call to a substring check.
A string s2 is a rotation of s1 if it can be obtained by rotating s1 at some pivot point.
 Example:
"erbottlewat" is a rotation of "waterbottle"

 Input Format:
First line: string s1

Second line: string s2

 Output Format:
Print true if s2 is a rotation of s1

Print false otherwise
Sample Input
waterbottle
erbottlewat
Sample Output
true
Constraints:
Constraints:
1 ≤ s1.length, s2.length ≤ 1000


Input:
hello llohe

Expected Output:
true

Input:
hello helol

Expected Output:
false

Input:
abc cabd

Expected Output:
false


Input:
rotation tationro

Expected Output:
true

====================================================================================================
11-08-2025

1.What is the output of the following code
public class CollectionExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("goolge", "nareshIT","NareshIT","progress");
		Collections.reverse(list);
		for(String str: list)
			System.out.print(str+" ");
	}
}
A.	progress NareshIT goolge nareshIT
B.	goolge progress NareshIT nareshIT 
C.	progress NareshIT nareshIT goolge
D.	progress goolge NareshIT nareshIT 
ans:-
C.	progress NareshIT nareshIT goolge

2.What is the output of the following code
public class CollectionExample {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("25");
		al.add("Naresh");
		al.add("A");
		al.add("37");
		Iterator<String> it = al.iterator();
		while(it.hasNext())
			System.out.print(it.next()+" ");
	}
}
A.	25 Naresh A 37
B.	A 25 Naresh 37
C.	25 A Naresh 37
D.	37 Naresh A 25



3.What is the output of the following Snippet
public class CollectionExample {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("25");
		al.add("Naresh");
		al.add("A");
		al.add("37");
		Iterator<String> it = al.iterator();
		while(it.hasNext())
			System.out.print(it+" ");
	}
}
A.	25 Naresh A 37
B.	A 25 Naresh 37
C.	25 A Naresh 37
D.	Run time error
E.	37 Naresh A 25

4.What is the output of the following code
public class CollectionExample {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("25");
		al.add("Naresh");
		al.add("A");
		al.add("37");
		al.remove(4);
		for(String str: al)
			System.out.print(str+" ");
	}
}
A.	ArrayIndexOutofBoundException
B.	IndexOutOfBoundsException
C.	25 Naresh A
D.	NullPointerException



5. What is the output of the following code
public class CollectionExample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		for(int i=0;i<10;i++) 
		{
			al.add(i);
		}
		for(int str: al)
			System.out.print(str+" ");
	}
}
A.	0 1 2 3 4 5 6 7 8 9
B.	1 2 3 4 5 6 7 8 9
C.	1 2 3 4 5 6 7 8 10
D.	1 2 3 4 5 6 7 8


6. Choose the correct output of the following code
public class CollectionExample {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList();
		for(int i=5;i<10;i++) 
		{
			al.add(i);
		}
		al.remove(4);
		for(int str: al)
			System.out.print(str+" ");
	}
}
A.	4 5 6 7 8
B.	5 6 7 8
C.	4 5 6 7 8 9
D.	5 6 7 8 9


7. Choose the correct output of the following code
public class CollectionExample {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("google");
		al.add("Naresh");
		al.add("Information");
		al.add("Technology");
		for(int i=0;i<al.size();i++) 
		{
			System.out.print(al.get(i).substring(0,6));
		}
	}
}
A.	google Inform Techno Naresh
B.	Techno  google Naresh Inform 
C.	google Naresh Techno Inform 
D.	google Naresh Inform Techno
ans:-
D.	google Naresh Inform Techno


8.Choose the correct output for the following code
public class CollectionExample {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		System.out.println(al);
	}
}
A.	null
B.	no output
C.	[]
D.	Run time error


9.What is the output of the following code
public class CollectionExample {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(5);
		al.add("");
		al.add(10);
		System.out.println(al.contains(6));
		System.out.println(al.contains(10));
		System.out.println(al.contains(null));
	}
}
A.	false true false
B.	false false false
C.	true true true
D.	true false true



10. What is the output of the following code
public class CollectionExample {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		al.add(50);
		al.add(25);
		ListIterator li = al.listIterator();
		while(li.hasNext())
			System.out.println(li.next());
		li.add(22);
		System.out.println(li.hasNext());
	}
}
A.	50 25 true
B.	50 25 false
C.	25 50 false
D.	25 50 true

11. What is the output of the following code
public class Test
{
     public static void main(String[] argv) 
     {
           Collection c = new ArrayList();
           c.add("1");
           c.add("2");
           c.add("3");
           Collection c1 = new ArrayList();
           c1.add("1");
           c.retainAll(c1);
           System.out.println(c);
     }
}

12. What is the output of the following code
import java.util.ArrayList;
import java.util.List;

public class Test
{
      public static void main(String[] argv) 
      {
            List<String> list = new ArrayList<String>();
            list.add("a");
            list.add("b");
            list.add("c");
            System.out.println(list.indexOf("a"));
            System.out.println(list.indexOf("c"));
            System.out.println(list.indexOf("d"));
      }
}

13. What is the output of the following code
import java.util.*;
public class Test
{
     public static void main(String[] args)
     {
           Integer int1 = new Integer(10);
           Vector vec1 = new Vector();
           LinkedList list = new LinkedList();
           vec1.add(int1);
           list.add(int1);
           if(vec1.equals(list)) 
                System.out.println("equal");
           else  
                System.out.println("not equal");
     }
}


14. What is the output of the following code
import java.util.*;

public class Test
{
       public static void main(String[] args) 
       {
             List<Number> list =Arrays.asList(1,2,3,4);
             list.remove(0);
       }
}

15. What is the output of the following code
import java.util.*;

public class Test
{
       public static void main(String[] args) 
       {
            List<Number> list = new ArrayList<Number>();
            list.add(7);
            list.add(8);
            list.add(7);
            Number index = list.get(Integer.valueOf(7));
            System.out.println(index);
        }
}

16. What is the output of the following code
import java.util.*;

public class Test
{
       public static void main(String[] args) 
       {
            List<String> list1 = new ArrayList<String>();
		list1.add("Dohni");
		list1.add("Sahwag");
		list1.add("Bumrah");
		list1.set(0, "Virat");
		list1.add(0, "Rohit");
		System.out.println(list1);
       }
}

17. What is the output of the following code
import java.util.*;
public class Test
{
 public static void main(String argv[])
	 {
    	 
    	ArrayList list = new ArrayList(); 
    	ArrayList listStr = list; 
    	ArrayList listBuf = list; 
    	listStr.add(0, "Hello"); 
    	StringBuffer buff =listBuf.get(0); 
       System.out.println(buff.toString());
    }

}

18. What is the output of the following code
import java.util.LinkedList;
import java.util.Queue;
public class Test18
{
public static void main(String... args) 
{
	ArrayList obj = new ArrayList();
            obj.add("A");
            obj.set(0, "B");
            System.out.println(obj.size());
        }
}

19. What is the output of the following code
public class Test6
{
	public static void main(String[] args) 
	{
		Moof one = new Moof(8);
		Moof two = new Moof(8);
		if(one.equals(two))
		{
		System.out.println("Equal ...");
		}
		else
		{
		System.out.println("Not Equal ...");
		}
	}
}
class Moof
{
	private int moofValue;
	Moof(int val)
	{
		moofValue=val;
	}

	public int getMoofValue()
	{
		return moofValue;
	}
	public boolean equals(Object o)
	{
		if((o instanceof Moof)&&(((Moof)o).getMoofValue()==this.moofValue))
		{
			return true;
		}
		else
		{
			return false;
		}

	}
}

20. What is the output of the following code
class Emp 
{
	private int age ;
	
	public Emp( int age )
	{
		super();
		this.age = age;
	}
	
	public int hashCode()
	{
		return age;
	}
}
public class Test8
{
	public static void main(String[] args) 
	{
		Emp emp1 = new Emp(23);
		System.out.println("emp1.hashCode() is :"+emp1.hashCode());


		int originalHashCode = System.identityHashCode(emp1);
		System.out.println("Original hashCode of Emp is :"+originalHashCode);
	}
}
=============================================================================================
12-08-2025

Assignment 01:
--------------
Develop a scenario based program by using Collections Framework for processing the Library Management System
using different available options like Display books in the Library, Issue a book, search a particular book in the library.

Create a record called Book.

Components :
 id : Integer
 title : String
 author : String



Create another BLC class Library which contains following non static 
methods :

1) Method Name     : displayAvailableBooks()
Argument           : 1 argument of type Vector<Book>
Return Type        : void
Access modifier    : public
In this method display all the available books in the Library.[See the Test cases for More Details]

2) Method Name     : issueBook()
Argument           : 2 arguments [Vector<Book>, Scanner sc]
Return Type        : void
Access modifier    : public
In this method issueBook from the Library based on the id of the Book, If Book is available (based on the id) then remove() the Book from the Library otherwise give an error message  "Book with ID 103 not Found"
[See Test cases for More details]


3) Method Name     : searchBook()
Argument           : 2 arguments [Vector<Book>, Scanner sc]
Return Type        : void
Access modifier    : public
In this method search a Book from the Library by using title OR author, If Book is available either by title OR Author then give a message "Book Found", If not available then give an error message "No matching books found."


Create an ELC class called LibraryManagement which contains main method.
Inside main method Create Vector class object to add books available in the library. [See the Test cases for Library Books] 

Inside main method display the following details as a Menu.
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :
Please Enter your Choice :

Write Switch case with Scanner class to perform Various operation with
Library System.

Test Cases for Output :
------------------------
Test Case 1 :
-------------
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :
Please Enter your Choice :
1
Available Books in the Library :
  Book[id=101, title=Core Java, author=Mr James]
  Book[id=102, title=Adv Java, author=Mr Robert]
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  Book[id=104, title=Programming in C , author=Mr Denis]
Please Enter your Choice :




Test Case 2 :
-------------
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :

Please Enter your Choice :
2

Enter keyword to search by title or author: Core Java
Found: Book[id=101, title=Core Java, author=Mr James]
Please Enter your Choice :



Test Case 3 :
-------------
3

 Enter Book id which for Book issue :102
 Issued: Book[id=102, title=Adv Java, author=Mr Robert]
Please Enter your Choice :
1
Available Books in the Library :
  Book[id=101, title=Core Java, author=Mr James]
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  Book[id=104, title=Programming in C , author=Mr Denis]


Test Cases 4 :
--------------
Select from the Menu :
	 1) Display Books Available in the Library :
	 2) Search a Book in the Library :
	 3) Issue a Book from the Library :
	 4) Exit from the application :
Please Enter your Choice :
4
Thank you for Visiting..


Test Cases for Input Validation :
---------------------------------
Test Cases 1:
-------------
Please Enter your Choice :
1
Available Books in the Library :
  Book[id=101, title=Core Java, author=Mr James]
  Book[id=102, title=Adv Java, author=Mr Robert]
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  Book[id=104, title=Programming in C , author=Mr Denis]
Please Enter your Choice :
2

Enter keyword to search by title or author: Python
No matching books found.
   

Test Cases 2:
-------------
Please Enter your Choice :
1
Available Books in the Library :
  Book[id=101, title=Core Java, author=Mr James]
  Book[id=102, title=Adv Java, author=Mr Robert]
  Book[id=103, title=Head First Java, author=Miss Kathy Sierra]
  Book[id=104, title=Programming in C , author=Mr Denis]
Please Enter your Choice :
3

 Enter Book id which for Book issue :109
 Please Enter your Choice :
 Book with ID 109 not found.
---------------------------------------------------------------------------------------------
Assignment 02:
--------------
Write a Program to perform sorting operation on Product class using ArrayList by implementing Comparable interface.

Create a BLC class Product.

Instance variables:
productNumber-private-Integer
productName-private-String
productPrice-private-Double

Create a parameterized constructor to initialize the instance variable of Product class.

Implement Comparable interface to write the logic to sort the Product class based on the Product Name.

Create an ELC class which contains main method, create ArrayList object to hold Product data as well as sort the product data object based on the product name.
---------------------------------------------------------------------------------------------
Assignment 03:
--------------
Write a Program to perform sorting operation on Customer class using 
ArrayList by implementing Comparator interface 

Create a BLC class Customer
Instance variables:
customerNumber-private-Integer
customerName-private-String
customerBill-private-Double

Create a parameterized constructor to initialize the instance variable of Customer class.

Implement Comparator interface to write the logic to sort the Customer class based on the following 
a) Based on customer number
b) Based on customer name
c) Based on customer bill
Create an ELC class which contains main method, create ArrayList object to hold Customer data as well as sort the Customer data object based on the above criteria

=======================================================================================

14-08-2025
Create a Library Management project by using Collection Framework Concept to perform different types of Library Management System like add book, update quantity, delete book and search a book from library.

Coding Requirements :
---------------------

Create a BLC class called Book

Fields :[Access modifier should be private]

     title : String
     author : String
     isbn : long
     price : double
     quantity: int
     
Create a Parameterized constructor to initialize the non static fields.

Take getter and getter for all non static fields
     
Take a non static method public String displayBook() which will print the Book details in the following format.

(title=Java, author=James, isbn=45345, price=1289.0, quantity=12)
     

Create a BLC class Library

Field : [Access modifier should be private]
books ArrayList<Book>

Take a no argument constructor to initialize current class properties.

Method :

1) Method Name     : addBook()
Parameter          : Book book
Return Type        : void
Access modifier    : public

In this addBook() method, add Book object, If it has different 
ISBN number, If ISBN number is same, It should print an error message Book with the same ISBN ..... already exists.")

Use private method to perform validation.

[ISBN stands for International Standard Book Number. It is a unique identifier for books just like roll for Student]


2) Method Name     : searchBookByISBN()
Parameter          : long isbn
Return Type        : Book
Access modifier    : private

In this private Helper Method check whether the given ISBN number and Book isbn number both are same OR not, based on the condition return Book object or null.

3) Method Name     : displayAllBooks()
Parameter          : No Parameter
Return Type        : void
Access modifier    : public

In this method, Display all the Books available in the Library. 


5) Method Name     : updateBookQuantityByISBN()
Parameter          : long isbn
Return Type        : void
Access modifier    : public
In this method update the quantity the Book, In order to update the quantity, first verify ISBN number by using private Helper method and then update the quantity by using setter method.
If the updated quantity is 0 OR -ve . It should provide error message.


6) Method Name     : deleteBookByTitle()
Parameter          : String title
Return Type        : void
Access modifier    : public

In this method delete the Book object using title, If parameter 
variable is null OR blank, It should print error message "Book Title cannot be blank".


Create an ELC class BookLibrary with main method to test this application. Write Switch case with infinite while loop as well as Scanner class to Test the application as shown in the below Test Cases.

Test Cases for Output :
------------------------
Test Case 1 :
-------------
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option: 1
Enter Title: Core Java
Enter Author: James
Enter ISBN: 123456788765
Enter Price: 1289
Enter Quantity: 10
Book added successfully.
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option:    
   

Test Case 2 :
-------------
Choose an option: 2
(title=Core Java, author=James, isbn=123456788765, price=1289.0, quantity=10)
(title=Advanced Java, author=Scott, isbn=1234567812345, price=1678.0, quantity=20)
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option:


Test Case 3 :
-------------
Choose an option: 3
Enter ISBN: 123456788765
Updating quantity of book : 
Enter new Quantity: 25
Quantity updated successfully.new quantity = 25
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option: 

Test Case 4 :
-------------
Choose an option: 4
Enter Book Title :
Advanced Java
Advanced Java book has removed successfully...
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option: 

Test Case 5 :
--------------
Choose an option: 5
Exiting from the Application. Thank you!!!


Test Cases for Input Validation :
---------------------------------
Test Cases 1:
-------------
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option: 1
Enter Title: Core Java
Enter Author: James
Enter ISBN: 1234567123456
Enter Price: 1289
Enter Quantity: 10
Book added successfully.
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option: 1
Enter Title: Advanced Java
Enter Author: Scott
Enter ISBN: 1234567123456
Enter Price: 1367
Enter Quantity: 20
Book with the same ISBN 1234567123456 already exists.



Test Cases 2:
-------------
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option: 1
Enter Title: Core Java
Enter Author: James
Enter ISBN: 1234567123456
Enter Price: 1267
Enter Quantity: 10
Book added successfully.
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option: 3
Enter ISBN: 1234567
Book with ISBN 1234567 not found.



Test Cases 3:
-------------
Choose an option: 3
Enter ISBN: 1234567123456
Updating quantity of book : 
Enter new Quantity: -10
Invalid quantity.
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit.
Choose an option:   

Test Cases 4:
-------------
Choose an option: 4
Enter Book Title :
null
Book Title cannot be blank  

Test Cases 5 :
---------------
1. Add Book
2. Display Books
3. Update Quantity
4. Delete Book
5. Exit
Choose an option: 4
Enter Book Title :

Book Title cannot be blank
=========================================================================

===============================================================================================
16-08-2025

Q1.   20. How does LinkedList differ from ArrayList?

 a) LinkedList uses dynamic array, ArrayList uses nodes

 b) LinkedList uses nodes, ArrayList uses dynamic array

 c) Both use arrays

 d) No difference


Q2.   2. Which interface is implemented by ArrayList, LinkedList, Vector, and Stack?

 a) Set

 b) Collection

 c) List

 d) Map

Q3.   10. Which list implementation is best for inserting elements in the middle of the list?

 a) ArrayList

 b) Vector

 c) LinkedList

 d) Stack

Q4.   21. Which collection should you use for thread-safe operations by default?

 a) ArrayList

 b) Vector

 c) LinkedList

 d) HashMap


Q5.   29. Which collection class can also act as both a Stack and List?

 a) ArrayList

 b) Vector

 c) Queue

 d) None

Q6.   1. Which package contains all the main collection classes in Java?

 a) java.lang

 b) java.util

 c) java.net

 d) java.awt

Q7.   15. What method does ListIterator use to move backward?

 a) previous()

 b) back()

 c) last()

 d) reverse()

Q8.   28. Which method removes the element at a specific index?

 a) delete(index)

 b) remove(index)

 c) removeElement(index)

 d) del(index)

Q9.   8. Which collection class is synchronized by default?

 a) ArrayList

 b) LinkedList

 c) Vector

 d) HashSet


Q10.   17. What is the output type of the next() method in Iterator?

 a) boolean

 b) void

 c) Object

 d) int
Q11.   4. Which collection is best for frequent element access by index?

 a) LinkedList

 b) Vector

 c) ArrayList

 d) Stack

Q12.   13. Which List implementation allows constant time access by index?

 a) LinkedList

 b) ArrayList

 c) Stack

 d) Vector

Q13.   9. What does the Stack class implement?

 a) FIFO

 b) LIFO

 c) Random access

 d) None of the above

Q14.   24. To traverse from the last element to the first in a List, you use:

 a) Iterator

 b) ListIterator

 c) Enumeration

 d) For loop


Q15.   18. Which class does NOT implement the List interface?

 a) ArrayList

 b) Vector

 c) PriorityQueue

 d) Stack

Q16.   6. Which method is used to remove all elements from a collection?

 a) delete()

 b) clear()

 c) reset()

 d) removeAll()

Q17.   19. What happens when trying to access an invalid index in an ArrayList?

 a) Returns null

 b) No change

 c) Throws IndexOutOfBoundsException

 d) Fails silently
Q18.   11. Which method adds an element to the end of an ArrayList?

 a) addFirst()

 b) insert()

 c) add()

 d) append()
Q19.   14. Which collection allows bidirectional iteration?

 a) Iterator

 b) Enumeration

 c) ListIterator

 d) For loop

Q20.   5. What data structure is used internally by ArrayList?

 a) Linked Nodes

 b) Dynamic Array

 c) Stack

 d) Hash Table

Q21.   22. Which method returns the number of elements in a List?

 a) capacity()

 b) count()

 c) size()

 d) length()

Q22.   25. What will list.add(0, element) do?

 a) Adds at the end

 b) Adds at start

 c) Adds after index 1

 d) Does not work

Q23.   16. Which is NOT a method of the Iterator interface?

 a) next()

 b) hasNext()

 c) previous()

 d) remove()

Q24.   12. Which method inserts an element at a specific index in a List?

 a) put()

 b) add(index, element)

 c) insert(index, element)

 d) addElement(index, element)

Q25.   30. What is the result of invoking list.iterator() on any List?

 a) Compilation error

 b) Iterator object

 c) Array of elements

 d) List object

Q26.   26. Which List implementation can grow dynamically as elements are added?

 a) ArrayList

 b) LinkedList

 c) Vector

 d) All of the above

Q27.   23. Which collection supports stacks operations like push and pop?

 a) Stack

 b) ArrayList

 c) HashSet

 d) LinkedList


Q28.   7. Which operation is fastest in a LinkedList?

 a) Access by index

 b) Add/remove at beginning/end

 c) Sorting

 d) None of the above


Q29.   27. What is returned by list.get(index)?

 a) true/false

 b) the element at the given index

 c) null

 d) new list
Q30.   3. What is the main characteristic of a List interface in Java?

 a) Stores unique elements

 b) Elements are unordered

 c) Maintains insertion order

 d) Does not allow duplicate elements



Reverse_a_LinkedList
Reverse a LinkedList using ListIterator
Task:
Write a Java program that:
1. Takes a LinkedList of strings as input.
2. Uses a ListIterator to traverse the list in reverse order and print each element.

Additional Information:
- First, take the size of the list as input using scanner.next().
- Then, take elements one by one using scanner.next().

Sample Input:
Size: 4
Elements: Java Python C++ JavaScript
Expected Output:
JavaScript
C++
Python
Java
Sample Input
 4
Java Python C++ JavaScript


SimpleStack
Using ArrayList, implement a simple stack with the following operations:
• push(int element) – adds an element to the top of the stack
• pop() – removes the top element and returns it
• peek() – returns (but does not remove) the top element
• isEmpty() – returns true if the stack is empty

Additional Information:
- Use scanner.next() for input instead of nextLine().
- If pop() or peek() is called when the stack is empty, handle the case properly (e.g., return -1 or show message).
Example Execution:
StackDemo stack = new StackDemo();
stack.push(10);
stack.push(20);
stack.push(30);
System.out.println(stack.pop()); // Output: 30
System.out.println(stack.peek()); // Output: 20
System.out.println(stack.isEmpty()); // Output: false
Valid Test Cases:
1) push(10), push(20), push(30) → pop() → Output: 30
2) push(5), push(15) → peek() → Output: 15
3) new StackDemo() → isEmpty() → Output: true
4) push(7), pop(), pop() → pop() → Handle empty stack case








