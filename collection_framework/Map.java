===================================================================================================
  20-08-2025

Q1) Which of the following is true about HashMap in Java?
a) It allows one null key and multiple null values
b) It maintains insertion order
c) It is synchronized by default
d) Keys must be stored in sorted order
a) It allows one null key and multiple null values


Q2) What is the default initial capacity of a HashMap in Java?
a) 8
b) 16
c) 32
d) 64
16

Q3) What is the default load factor of a HashMap?
a) 0.25
b) 0.5
c) 0.75
d) 1.0
0.75

Q4) If two keys in a HashMap produce the same hash code, what happens?
a) JVM throws DuplicateKeyException
b) The new key replaces the old key always
c) Both keys are stored in the same bucket using linked structure (or tree in Java 8+)
d) The map becomes corrupted
c) Both keys are stored in the same bucket using linked structure (or tree in Java 8+)


Q5) Which of the following is false about HashMap?
a) It implements Map interface
b) It allows duplicate keys
c) It provides constant-time performance for basic operations (on average)
d) It is not synchronized

b) It allows duplicate keys

Q6) When does a HashMap rehash (resize) internally?
a) When number of elements > capacity   load factor
b) When number of elements < capacity   load factor
c) When load factor is set to 0
d) When collisions occur

a) When number of elements > capacity   load factor


Q7) In Java 8 and later, when a bucket in a HashMap becomes too large due to collisions, it is converted into a:
a) LinkedList
b) Binary Search Tree 
c) Stack
d) PriorityQueue
b) Binary Search Tree 


Q8) What will happen if we try to insert a duplicate key in a HashMap?
a) It throws IllegalArgumentException
b) It ignores the new entry
c) It replaces the old value with the new value
d) It stores both values
c) It replaces the old value with the new value


Q9) What will be the output of the following code?
import java.util.*;
class Test 
{
    public static void main(String[] args) 
    {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(null, "A");
        map.put(null, "B");
        System.out.println(map);
    }
}
a) {null=A}
b) {null=B}
c) {null=A, null=B}
d) Compilation error


Q10) What will be the output of the following code?
import java.util.*;
public class Test 
{
    public static void main(String[] args) 
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("X", null);
        map.put("Y", null);
        System.out.println(map.size());
    }
}
a) 0
b) 1
c) 2
d) Compilation error


Q11) What will be the output of the following code?
import java.util.*;
public class Test 
{
    public static void main(String[] args) 
    {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        for (Integer key : map.keySet()) 
	{
            System.out.print(key + " ");
        }
    }
}
a) 1 2 3
b) 3 2 1
c) Order is not guaranteed
d) Compilation error


Q12) What will be the output of the following code?
import java.util.*;
public class Test 
{
    public static void main(String[] args) 
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        map.remove("B");
        System.out.println(map.containsKey("B"));
    }
}


Q13) What will be the output of the following code?
import java.util.*;
public class Test 
{
    public static void main(String[] args) 
    {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        System.out.println(map.get(3));
    }
}

a) "null"
b) null
c) Throws NoSuchElementException
d) Compilation error



Q14) What will be the output of the following code?
import java.util.*;

public class Test
{
    public static void main(String[] args) 
    {
        HashMap<String, String> map = new HashMap<>();
        map.put("Java", "James Gosling");
        map.put("HTML", "Tim Berners Lee");

        for (Map.Entry<String, String> entry : map.entrySet()) 
	{
       System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
        }
    }
}

a) Java:James Gosling HTML:Tim Berners Lee
b) HTML:Tim Berners Lee Java:James Gosling
c) Output order not guaranteed
d) Compilation error


Q15) What will be the output of the following code?
import java.util.*;
public class Test 
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        System.out.println(map.put("X", 10));
        System.out.println(map.put("X", 20));
    }
}
a) 10 then 20
b) null then null
c) null then 10
d) Compilation error



Q16) When does rehashing happen in a HashMap?
a) When the number of keys exceeds the initial capacity
b) When the number of entries exceeds (capacity * loadFactor)
c) When a null key is inserted
d) When duplicate keys are inserted
b) When the number of entries exceeds (capacity * loadFactor)


Q17) Suppose a HashMap has a capacity of 16 and load factor 0.75. After inserting 13 entries, what will be the new capacity?
a) 16
b) 24
c) 32
d) 64
32


Q18) If two unequal objects have the same hashCode, what happens in a HashMap?
a) One object replaces the other
b) Both objects are stored in the same bucket (collision)
c) Compilation error
d) Runtime exception



Q19) What happens if hashCode() is overridden but equals() is not?
a) HashMap will behave normally
b) Keys with same hashCode but duplicate Object will be inserted
   into the same bucket.
c) Causes RuntimeException  
d) Causes NullPointerException  


Q20) What will be the output of the following code?
import java.util.*;
public class Test 
{
    public static void main(String[] args) 
    {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");

        map.computeIfAbsent(1, k -> "Python");
        map.computeIfAbsent(2, k -> "C++");

        System.out.println(map);
    }
}

A) {1=Python, 2=C++}
B) {1=Java, 2=C++}
C) {1=Java}
D) {1=Python}


Q21) What will be the output of the following code?
import java.util.*;
public class Test
{
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "Python");

        map.computeIfPresent(1, (k, v) -> v + "Script");
        map.computeIfPresent(3, (k, v) -> "C++");

        System.out.println(map);
    }
}

A) {1=JavaScript, 2=Python, 3=C++}
B) {1=JavaScript, 2=Python}
C) {1=Java, 2=Python}
D) {1=Java, 2=Python, 3=C++}



Q22) What will be the output of the following code?
import java.util.*;
public class Test
{
    public static void main(String[] args)
    {
      Map<String, Integer> map = new HashMap<>();
      map.put("A", 5);
      map.put("B", 10);

      map.computeIfPresent("A", (k, v) -> v * 2);
      map.computeIfPresent("B", (k, v) -> null);

      System.out.println(map);

     }
}

A) {A=10, B=null}
B) {A=10}
C) {A=5}
D) {}


Q23) What will be the output of the following code?
import java.util.*;
public class Test
{
    public static void main(String[] args)
    {
      Map<Integer, String> map = new HashMap<>();

      map.computeIfAbsent(10, k -> null);
      map.put(20, null);
      map.computeIfAbsent(20, k -> null);

      System.out.println(map);    
     }
}
A) {}
B) {20=null}
C) {10=null, 20=null}
D) {10=null}


Q24) What will be the output of the following code?
import java.util.*;
public class Test
{
    public static void main(String[] args)
    {
      Map<Integer, String> map = new HashMap<>();
      map.put(1, "One");
      map.put(2, "Two");

      System.out.println(map.getOrDefault(1, "Default"));
      System.out.println(map.getOrDefault(3, "Default"));   
     }
}

A) One and null
B) One and Default
C) Default and Default
D) null and Default


Q25) What will be the output of the following code?
import java.util.*;
public class Test
{
    public static void main(String[] args)
    {
       Map<String, Integer> map = new HashMap<>();
       map.put("A", null);

       System.out.println(map.getOrDefault("A", 10));
       System.out.println(map.getOrDefault("B", 20));   
     }
}
A) 10 and 20
B) null and 20
C) null and null
D) 10 and null

======================================================================================================
21-08-2025
=========
  HashMap<K,V> Scenario
=====================
Create a Scenario based program on Student Management System using HashMap where we need to Add Student, Update Marks, Delete Student, Search Student, Display All Students, Show Lowest Scorer, Show Total and Average Marks.

Coding Requirements :
---------------------
Take an ELC class StudentDataManagement with main method.

In this main method create one HashMap object which takes Student name as a key and Student marks as a value.

Create Scanner class object perform various operation on Student object by using switch case.

------ Student Management Menu ------
1. Add Student
2. Update Marks
3. Delete Student
4. Search Student
5. Display All Students
6. Show Topper
7. Show Lowest Scorer
8. Show Total and Average Marks
9. Exit
Enter your choice: 


Test Cases for Output :
-----------------------
Test Case 1 :
-------------
Enter your choice: 1
Enter student name: Ankit
Enter marks: 89
Student added successfully!



Test Case 2 :
-------------
Enter your choice: 2
Enter student name to update the marks : Ankit
Enter new marks: 93
Marks updated.


Test Case 3:
-------------
Enter your choice: 3
Enter student name to delete: Ankit
Student deleted.


Test Case 4:
------------
Enter your choice: 4
Enter student name to search: Elina
Elina scored 99


Test Case 5:
------------
Enter your choice: 5
---- Student Records ----
Ravishankar => 99
Puja  => 89
Elina => 99
Aryan => 98


Test Case 6:
------------
Enter your choice: 6
Topper: Ravishankar => 99


Test Case 7:
------------
Enter your choice: 7
Lowest Scorer: Puja  => 89

Test Case 8:
------------
Enter your choice: 8
Total Marks: 385
Average Marks: 96.25

Test Case 9:
-------------
Enter your choice: 9
Exiting... Thank you!


Test Cases for Input Validation :
----------------------------------
Enter your choice: 2
Enter student name to update the marks : Ankit
Student not found.




