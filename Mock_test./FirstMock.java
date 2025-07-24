AddUntilOneDigit
 "Add until one digit" refers to the process of repeatedly summing the digits of a number until a single-digit result is obtained. This single-digit result is also known as the digital root of the number.

Examples:

For 123:1+2+3=6 (Result is a single digit, so 6)
For 456:4+5+6=151+5=6 (Result is a single digit, so 6)
For 999:9+9+9=272+7=9 (Result is a single digit, so 9)

Enter a number: 123
Single digit result: 6
Sample Input
123
Sample Output
Single digit result: 6



Input:
123

Expected Output:
Single digit result: 6
Output:
Single digit result: 6

Input:
5

Expected Output:
Single digit result: 5
Output:
Single digit result: 5


Input:
56

Expected Output:
Single digit result: 2
Output:
Single digit result: 2

Input:
456

Expected Output:
Single digit result: 6
Output:
Single digit result: 6


import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
       
        while(num!=0)
        {
            int j=num;
            int sum=0;
            
            for(;j!=0;j=j/10)
            {
            int rem=j%10;
            sum=sum+rem;
            }
           if(sum>0&&sum<9)
           {
               System.out.println("Single digit result: "+sum);
               System.exit(0);
           }
           else
           {
               num=sum;
           }
        }      
      

    }

}

FibonacciNTerms
Write a java program to Print First N Fibonacci Numbers 
The Fibonacci series (or sequence) is a sequence of numbers where each number is the sum of the two preceding ones, usually starting with 0 and 1.

Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...

How to generate:
Start with the first two numbers (0 and 1).
The next number is the sum of the previous two.
Sample Input
5
Sample Output
First 5 Fibonacci numbers: 0 1 1 2 3 

Input:
5

Expected Output:
First 5 Fibonacci numbers: 0 1 1 2 3 
Output:
First 5 Fibonacci numbers: 0 1 1 2 3


Input:
10

Expected Output:
First 10 Fibonacci numbers: 0 1 1 2 3 5 8 13 21 34 
Output:
First 10 Fibonacci numbers: 0 1 1 2 3 5 8 13 21 34


Input:
2

Expected Output:
First 2 Fibonacci numbers: 0 1 
Output:
First 2 Fibonacci numbers: 0 1


import java.util.*;
class FibonacciNterm{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int n1=0;
        int n2=1;
        System.out.printf("First %d Fibonacci numbers: %d %d ",num,n1,n2);
        for(int i=2;i<num;i++)
        {
            int n3;
            n3=n1+n2;
            System.out.printf("%d ",n3);
            n1=n2;
            n2=n3;

        }

    }
}


StrongNumber
Write a java program to check the given number is Strong number or not.
A strong number is a number whose sum of the factorials of its individual digits is equal to the original number.
Examples:
1: 1!=1
2: 2!=2
145: 1!+4!+5!=1+(4×3×2×1)+(5×4×3×2×1)=1+24+120=145

Enter a number :145
145 is a Strong Number.
Sample Input
145
Sample Output
145 is a Strong Number.

Input:
145

Expected Output:
145 is a Strong Number.
Output:
145 is a Strong Number.

Input:
40585

Expected Output:
40585 is a Strong Number.
Output:
40585 is a Strong Number.

Input:
123

Expected Output:
123 is Not a Strong Number.
Output:
123 is Not a Strong Number.

Input:
2

Expected Output:
2 is a Strong Number.
Output:
2 is a Strong Number.

import java.util.*;
class StrongNumber{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=num;
        int total=0;
        
        while(num!=0)
        {
            int rev=num%10;
            int fact=1;
            for(int i=1;i<=rev;i++)
            {
               fact=fact*i;
            }
            total=total+fact;
            num=num/10;

        }
        if(result==total)
        {
            System.out.printf("%d is a Strong Number.",total);
        }
        else{
             System.out.printf("%d is Not a Strong Number.",result);

        }
        
    }
}

SumOfDivisors
Write a java program to perform the sum of divisors of a positive integer
The sum of divisors of a positive integer n is the total of all its positive integers that divide n evenly (including 1 and n itself).

Examples:
Divisors of 6: 1, 2, 3, 6. Sum = 1+2+3+6=12
Divisors of 7: 1, 7. Sum = 1+7=8
Divisors of 10: 1, 2, 5, 10. Sum = 1+2+5+10=18

Enter a positive integer: 6
Divisors of 6: 1 2 3 6 
Sum of divisors: 12
Sample Input
6
Sample Output
Divisors of 6: 1 2 3 6 
Sum of divisors: 12

Input:
6

Expected Output:
Divisors of 6: 1 2 3 6 
Sum of divisors: 12

Input:
2

Expected Output:
Divisors of 2: 1 2 
Sum of divisors: 3

Input:
10

Expected Output:
Divisors of 10: 1 2 5 10 
Sum of divisors: 18

Input:
5

Expected Output:
Divisors of 5: 1 5 
Sum of divisors: 6


import java.util.*;
class SumOfDivisors{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        System.out.printf("Divisors of %d: ",num);
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.printf("%d ",i);
                sum=sum+i;
            }
        }
        System.out.printf("\n");
        System.out.printf("Sum of divisors: %d",sum);
    }
}


PrimeCheck
Write a java program to check the given number is prime number or not.

[ A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.

Enter the Number :23
23 is a Prime Number.
Sample Input
2
Sample Output
2 is a Prime Number.

Input:
6

Expected Output:
6 is Not a Prime Number.
Output:
6 is Not a Prime Number.

Input:
2

Expected Output:
2 is a Prime Number.
Output:
2 is a Prime Number.

Input:
4

Expected Output:
4 is Not a Prime Number.
Output:
4 is Not a Prime Number.

Input:
23

Expected Output:
23 is a Prime Number.
Output:
23 is a Prime Number.

import java.util.*;
class PrimeCheck
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                count++;
            }
          
        }
        if(count==2)
        {
            System.out.printf("%d is a Prime Number.",num);
        }
        else{
            System.out.printf("%d is Not a Prime Number.",num);
        }
    }
}


===========================================================================
                                   (or)

import java.util.*;
class PrimeCheck
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                count++;
                break;
            }
          
        }
        if(count==0)
        {
            System.out.printf("%d is a Prime Number.",num);
        }
        else{
            System.out.printf("%d is Not a Prime Number.",num);
        }
    }
}




















CountDigits
Write a java program to Counting the digits of a number
Counting the digits of a number means determining how many individual numerals make up the number.

Examples:
Digits in 12345: 5
Digits in 7: 1
Digits in 900: 3

Enter the number :-1245
Number of digits: 4
Sample Input
1245
Sample Output
Number of digits: 4





Input:
1245

Expected Output:
Number of digits: 4
Output:
Number of digits: 4


Input:
56

Expected Output:
Number of digits: 2
Output:
Number of digits: 2


Input:
2

Expected Output:
Number of digits: 1
Output:
Number of digits: 1


Input:
54689

Expected Output:
Number of digits: 5
Output:
Number of digits: 5



import java.util.*;

class CountDigits{
    public static void main(String args[] )
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        while(num!=0){
            count++;
        
            num=num/10;

        }
        System.out.println("Number of digits: "+count);
    }
}


PerfectNumber
A perfect number is a positive integer that is equal to the sum of its proper positive divisors (i.e., its positive divisors excluding the number itself).

Examples:
-> 6: The proper divisors of 6 are 1, 2, and 3. 1+2+3=6. So, 6 is a perfect number.
-> 28: The proper divisors of 28 are 1, 2, 4, 7, and 14. 1+2+4+7+14=28. So, 28 is a perfect number.
-> 496: The proper divisors of 496 are 1, 2, 4, 8, 16, 31, 62, 124, 248. 1+2+4+8+16+31+62+124+248=496. So, 496 is a perfect number.
Sample Input
6
Sample Output
6 is a Perfect Number.

Input:
6

Expected Output:
6 is a Perfect Number.
Output:
6 is a Perfect Number.

Input:
5

Expected Output:
5 is Not a Perfect Number.
Output:
5 is Not a Perfect Number.

Input:
28

Expected Output:
28 is a Perfect Number.
Output:
28 is a Perfect Number.

Input:
496

Expected Output:
496 is a Perfect Number.
Output:
496 is a Perfect Number.


import java.util.*;
class PerfectNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                sum+=i;
            }
          
        }
        if(num==sum)
        {
           System.out.printf("%d is a Perfect Number.",num);
        }
        else{
            System.out.printf("%d is Not a Perfect Number.",num);
        }
    }
}



ArmstrongNumber

Write a java program to check the given number is Armstrong number or not.
[An Armstrong number (also known as a narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

Examples:

153: (Number of digits = 3) 1^3 + 5^3 +3^3 = 1+125+27=153
9474: (Number of digits = 4) 9^4 + 4^4 + 7^4 + 4^4  = 6561+256+2401+256=9474


Enter a number:153
153 is an Armstrong number.
Sample Input
153
Sample Output
153 is an Armstrong number.

Input:
9474

Expected Output:
9474 is an Armstrong number.


Input:
153

Expected Output:
153 is an Armstrong number.

Input:
154

Expected Output:
154 is Not an Armstrong number.
import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();

         int newValue=num1;

          int count=numberCount(num1);
           
           int result=seperateDigit(num1,count);

           if(newValue==result)
           {
            System.out.println(newValue+" is an Armstrong number.");
           }
           else
           {
            System.out.println(newValue+" is Not an Armstrong number.");
           }
    }

    static int numberCount(int num)
    {
        int count=0;
        while(num!=0)
        {
             num=num/10;
            count++;
           
        }
        return count;
    }

   static int seperateDigit(int num1,int count)
    {
        int result=0;
        while(num1!=0)
        {
        int rem=num1%10;
        result+=Math.pow(rem,count);
        num1=num1/10;
        }
        return result;

    }
}






PalindromeNumber
Write a java program to check the given number is Palindrome number or not.
[A palindrome number is a number that reads the same forwards and backward. In other words, its reverse is identical to the original number.

Enter a number: 121
121 is a Palindrome number.
Sample Input
121
Sample Output
121 is a Palindrome number.

Input:
121

Expected Output:
121 is a Palindrome number.


Input:
564

Expected Output:
564 is Not a Palindrome number.

Input:
444

Expected Output:
444 is a Palindrome number.

Input:
4554

Expected Output:
4554 is a Palindrome number.





ReverseNumber
Write a java program to reverse the number.
Reversing a number means creating a new number by writing its digits in reverse order.

Examples:
Reverse of 123 is 321
Reverse of 500 is 5
Reverse of 9876 is 6789
Sample Input
123
Sample Output
Reversed number: 321


Input:
123

Expected Output:
Reversed number: 321


Input:
12

Expected Output:
Reversed number: 21


Input:
5656

Expected Output:
Reversed number: 6565

Input:
55055

Expected Output:
Reversed number: 55055



Factorial
Write a java program to find the factorial of a given number.
The factorial of a non-negative integer n, denoted by n!, is the product of all positive integers less than or equal to n.
By definition, 0! = 1.

Examples:

0! = 1
1! = 1
2! = 2 * 1 = 2
3! = 3 * 2 * 1 = 6
5! = 5 * 4 * 3 * 2 * 1 = 120

Enter a number :5
5 Factorial = 120
Sample Input
5
Sample Output
5 Factorial = 120


Input:
5

Expected Output:
5 Factorial = 120

Input:
2

Expected Output:
2 Factorial = 2

Input:
6

Expected Output:
6 Factorial = 720

Input:
1

Expected Output:
1 Factorial = 1





