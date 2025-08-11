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

  
package com.stringarray.com;

import java.util.Scanner;

public class RotationCheck {
	
	public static boolean Rotation(String s1,String s2)
	{
		if(s1.length()!=s2.length())
		{
			return false;
		}
		char arr1[]=s1.toCharArray();
		char arr2[]=s2.toCharArray();
		
		for(int i=0;i<arr1.length;i++)
		{
			char first=arr1[0];
			for(int j=0;j<arr1.length-1;j++)
			{
				arr1[j]=arr1[j+1];
				
			}
			arr1[arr1.length-1]=first;
			
			boolean match=true;
			for(int k=0;k<arr1.length;k++)
			{
				if(arr1[k]!=arr2[k])
				{
					match=false;
					break;
				}
			}
			
			if(match)
			{
				return true;
			}
		}
		return false;	
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		System.out.println(Rotation(str1,str2));
	}

}
or
  package com.stringarray.com;

import java.util.Scanner;

public class RotationCheck {
	
	public static boolean Rotation(String s1,String s2)
	{
		boolean contains;
		if(s1.length()!=s2.length())
		{
			return false;
		}
		else
		{
		 String combined=s1+s1;
		 contains = combined.contains(s2);
		 return contains; 
		}		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		System.out.println(Rotation(str1,str2));
	
	}

}
or
  package com.stringarray.com;

import java.util.Scanner;

public class RotationCheck {
	
	public static boolean Rotation(String s1,String s2)
	{
		if (s1.length() != s2.length()) {
            System.out.println("Not rotation");
            return false;
        }
		
	  for(int i=0;i<s1.length();i++)
	  {
		  String rotated=s1.substring(i)+s1.substring(0, i);
		  
		  if(rotated.equals(s2)) {
			  return true;
		  }
		 
	  }
	  return false;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String str1=sc.next();
		String str2=sc.next();
		
		System.out.println(Rotation(str1,str2));
	
	}

}
1. Loop through every possible rotation starting point
i represents where we “cut” the string and move the front part to the end.

2. s1.substring(i)
Takes the part from position i to the end.

Example if s1 = "ABCD":

i = 0 → "ABCD"

i = 1 → "BCD"

i = 2 → "CD"

i = 3 → "D"

3. s1.substring(0, i)
Takes the part from start (0) to i.

Example if s1 = "ABCD":

i = 0 → "" (empty)

i = 1 → "A"

i = 2 → "AB"

i = 3 → "ABC"

4. Concatenating them

String rotated = s1.substring(i) + s1.substring(0, i);
If s1 = "ABCD":

i	s1.substring(i)	 s1.substring(0, i)	 rotated
0	ABCD	               ""	              ABCD
1	BCD                 	A             	BCDA
2	CD	                  AB            	CDAB ✅
3	D                   	ABC           	DABC
  
