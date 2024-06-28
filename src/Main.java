public class Main {

// 1. Write a program to check if a given string is a palindrome.
    public static  boolean isPalindrome(int num){
        /*
            steps:
                1. take a variable temp to store the value of num
                2. take a variable reverseNum = 0
                3. extract the last digit of number by module operation
                4. construct the number by revereNum = reverseNum * 10 + digit
                5. eliminate the last digit of number by division operation
        * */

        int temp = num ;
        int reverseNum = 0;
        while (num > 0){
            int digit = num % 10;
            reverseNum = (reverseNum* 10 ) + digit;
            num = num / 10;
        }
        System.out.println(temp + " " + reverseNum);
        if(temp == reverseNum){
            return  true;
        }
        return false;
    }
// 2. Write a program to check if two given strings are anagrams of each other.
    public  static boolean isAnagram(String str1, String str2){

        return true;
    }
// 3. Write a program to print the first n numbers in the Fibonacci sequence.
    public  static  void printFibonacci( int n ){

    }
// 4. Write a program to check if a given number is prime.
    public  static  boolean isPrime(int num){
        /*
            steps:
                1. Run a loop from int 2 to num
                2. check  whether the number is divisible by any digit
                3. if yes then return not prime else return prime
       */

        if(num <= 1){
            return false;
        }

        // We can check until square root of number using Math.sqrt(num) for best efficiency
        for (int i = 2; i < num; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
// 5. Write a program to find the sum of the digits of a given number.
    public  static  int sumOfDigit(int num ){

        /*
            Steps:
                1. take a variable sum = 0
                2. extract last digit  by module operation
                3. add the digit into sum variable
                4. remove the last digit by divide operation
        * */

        int sum = 0;
        while (num > 0){
            int  digit = num % 10 ;
            sum = sum + digit;
            num = num / 10;
        }
        return sum;
    }
// 6. Write a  program to print the digit of an number.
    public  static void printDigitOfNumber(int num){
        /*
            Steps:
                1. Module Operation to get Last Digit
                2. Divide the number to remove the last digit
                3. Do until number become the zero
        * */

        while (num > 0){
            int digit  = num % 10;
            num = num /10;
            System.out.println(digit);
        }

    }
// 7. Write a program to reverse a number
    public  static  int reverseANumber(int num){
        /*
            Steps:
                1. take a variable reverse with 0 value
                2. Module operation to extract the last digit
                3. construct reverse with reverse = reverse * 10 + digit
                4. Divide operation to remove the last digit of number

         */

        int reverseNumber = 0;
        while (num > 0){
            int digit = num % 10;
            reverseNumber = (reverseNumber * 10) + digit;
            num = num / 10;
        }


        // for handling Zero

        /*
        Steps:
            1. Convert the number to a string.
            2. Reverse the string.
            3. Convert the reversed string back to a number if needed (or leave as a string to preserve leading zeros).
     */

//        String numStr = String.valueOf(num);
        // Another Mehtod
//        String numStr1 = Integer.toString(num);
        // Then convert to string builder

//        StringBuilder reverseStr = new StringBuilder(numStr).reverse();

//        int reverseNumber1 = Integer.parseInt(reverseStr);



        return reverseNumber;
    }
// 8. Write a program to check if a given number is an Armstrong number.
    public static  boolean isArmstrong(int  num){
        return true;
    }
// 9. Program to Find the Sum of First N Natural Numbers using java
    public  static  int sumOfFirstNaturalNumber(int num){
        /*
            Steps:
                1. we can use formula (n*(n+1) / 2)
        * */
        return ((num * (num +1))/2 );
    }
// 10. Find the Sum of the Numbers in a Given Range in Java
    public  static  int sumOfNumberInGivenRange(int start ,int end ){
        /*
            Steps:
                1. we can use iterative approach
                2. we can use formula which ((end- start + 1) * ( start + end )) / 2
                Example: start 2 and end 5 -> (4 * 7 ) / 2 = 14
        * */
        return ((end -start + 1 )*( start + end )) / 2;
    }
// 11. Find the Greatest Number Among Three Numbers in Java
    public  static  int greatestNumberAmongThreeNumber(int num1 ,int num2,int num3){
        if( num1 > num2 && num1 > num3){
            return  num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        }
        return num3;
    }
// 12. Power of a number using Java
    public  static  int powerOfNumber( int num , int power ){
        // For handling the power of 0
        if(power < 0){
            return  1;
        }
        int powerNum = 1;
        for (int i = 0; i < power; i++) {
            powerNum = powerNum * num;
        }
        return  powerNum;
    }
// 13. Check Whether or Not the Number is a Strong Number in Java
    public static boolean isStrongNumber(int num){
        return  false;
    }
// 14. Check Whether or Not the Number is a Perfect Number in Java
    public static boolean isPerfectNumber(int num){
        return false;
    }
// 15. Check Whether Or Not the Number is an Automorphic Number in Java
    public static boolean isAutomorphicNumber(){
        return  false;
    }
// 16. Harshad number or not using Java
    public static boolean isHarshdNumber(int num ){
        return false;
    }
// 17. Abundant Number or not in Java
    public static boolean isAbundantNumber(int num){
        return false;
    }
// 18. Check Whether or Not the Year is a Leap Year in Java
    public static boolean isLeapYear(int num ){ return  false;}
// 19. Find the Factors of a Number in Java
    public static void printFactorOfNumber(int num){ }
// 20. Check for Perfect Square in Java
    public static boolean isPerfectSquare(int num){
        return false;
    }
// 21. Friendly pair or not (amicable or not) using Java
    public static void printFriendlyPair(int num){

    }
// 22. Factorial of a Number in Java
    public static int factorialOfNumber(int num ){return 1;}
// 23. Program for Finding out the Prime Factors of a number in Java
    public static void printPrimeFactorOfNumber(int num ){}
// 24. Find the Prime Numbers in a Given Interval in Java
    public static void printPrimeNumberInGivenRange(int start,int end){}
// 25. Armstrong Numbers between Two Intervals using Java
    public static void printArmstrongNumberInInterval(int start , int end){}
// 26. Find the Fibonacci Series up to Nth Term in Java
    public static void printFibonacciSeriesUpToNthTerm(int num){}





    public static void main(String[] args) {
        printDigitOfNumber(450);
        System.out.println("Reverse of Number is :- "+reverseANumber(451));
        System.out.println( "Sum of Digit of Number is :- " +sumOfDigit(6572829));
        System.out.println("Number is Palindrome :- " + isPalindrome(121212));
        System.out.println("Number is Prime :- " + isPrime(12));
        System.out.println("Sum of First Natural Number is :- "+ sumOfFirstNaturalNumber(101));
        System.out.println("Sum of Number in given Range is :- " + sumOfNumberInGivenRange(1,100) );
        System.out.println("Greatest Among Three Number :- " + greatestNumberAmongThreeNumber(0,-3,-1));
        System.out.println("Power of Number is :- "+powerOfNumber(2,5
        ));
    }

}