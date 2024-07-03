public class NumbersQuestion {

/*

            -: Number Related Questions :-

1. Java Program to find GCD or HCF of two numbers
2. LCM of two numbers using Java
3. Binary to decimal conversion using Java
4. Decimal to binary conversion using Java
5. Finding Roots of a Quadratic Equation in Java





*/

//1. Java Program to find GCD or HCF of two numbers.
    public static int findGCD(int dividend ,int divisor ){
        while (dividend % divisor != 0){
            int rem = dividend % divisor;

            dividend = divisor;

            divisor = rem;
        }
        return divisor;

    }

//2. Java Program to find LCM of numbers.
    public static int findLCM(int num1, int num2){
        int lcm = (num1 * num2) / findGCD(num1,num2);
        return lcm;
    }
    public static void main(String[] args) {
        System.out.println("HCF of number is :- " +findGCD(20,12));
        System.out.println("LCM of numbers id :- "+ findLCM(12,40));
    }
}
