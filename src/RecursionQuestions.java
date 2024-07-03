public class RecursionQuestions {

/*
            -: Recursion Question :-


 1. Write a program to print the first n numbers in the Fibonacci sequence using recursion.  --> done
 2. Write a program to print fibonacci series using recursion.                               --> done
 3. Write a program to find factorial of a number using recursion.                           --> done
 4. Write a program to check palindrome using recursion.
 5. write a program to calculate the sum of natural number using recursion.                  --> done
 6. Write a program to reverse a string using recursion.


*/

// 1. Write a program to print the first n numbers in the Fibonacci sequence using recursion.
    public static int printFirstNthFibonacci(int n ){
        if(n<= 1){
            return n;
        }

        return printFirstNthFibonacci(n-1) + printFirstNthFibonacci(n-2);
    }
//2. Write a program to print fibonacci series using recursion.
    public static void printFibonacciSeries(int n){
        for (int i = 1; i <= n; i++) {
            System.out.print(printFirstNthFibonacci(i) + " ");
        }
        System.out.println();
    }
//3. Write a program to find factorial of a number.
    public static int findFactorialOfNumber(int n ){
        if(n <= 1){
            return  n;
        }

        return n * findFactorialOfNumber(n-1);
    }
//4. Write a program to find sum of natural number.
    public static int sumOfNaturalNumber(int n){
        if ( n == 0 ){
            return n;
        }
        return n + sumOfNaturalNumber(n-1);
    }
//5. Write a program to check a string is palindrome or not using recursion
    public static boolean checkPalindromeUsingRecursion(String str){
        if(str.length() <= 1){
            return true;
        }
        if(str.charAt(0) != str.charAt(str.length() -1)){
            return false;
        }
        return checkPalindromeUsingRecursion(str.substring(1,str.length()-1));
    }
//6. Write a program to find the reverse of string.
    public static String  reverseString(String str  ){
        /*
            Steps:
                // Base case: if the string is empty or has one character, return it as is
                // Recursive case: reverse the substring from the second character onwards,
                // then add the first character to the end
        * */
        if(str.isEmpty()){
            return str;
        }




        return reverseString(str.substring(1)) + str.charAt(0);
    }
    public static void main(String[] args) {
       printFibonacciSeries(20);
        System.out.println("Nth Fibonacci Number is :- " + printFirstNthFibonacci(10));
        System.out.println("Factorial of Number is :- " + findFactorialOfNumber(6));
        System.out.println("Sum of Natural Number is :- " + sumOfNaturalNumber(100));
        System.out.println("String is Palindrome or Not :- " + checkPalindromeUsingRecursion("nan"));
        System.out.println("Reverse the string :- " + reverseString("Kunal"));
    }
}
