
/*
        8. Java program to find the frequency of elements in an array
        9. Sorting element in array by frequency in Java
        10. Count distinct element in an array in Java
        11. Repeating element of an array in Java
        12. Non Repeating elements in an Array in Java
        13. Removing Duplicates elements from an array in Java
        14. Java program to count numbers of even and odd elements in an array
        15. Rotation of element of array – left and right
        16. Block swap algorithm for array rotation
        17.  Juggling algorithm for array rotation
        18. Circular rotation of an array by K position
        19. Java program to check the balance of parenthesis
        20. Write a program to check if there exist a duplicate key in the array?

*/


import java.util.Arrays;

public class ArrayQuestions {
//1. Largest Element of the array using Java
    public static int largestElementInArray(int []arr){
        int num = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > num){
                num = arr[i];
            }
        }
        return num;
    }
//1. Largest Element of the array using Java
    public static int smallestElementInArray(int []arr){
        int num = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < num){
                num = arr[i];
            }
        }
        return num;
    }
//3. Second Smallest Element in an array in Java
    public static int secondLargestElementInArray(int [] arr){
        int first,second;
        first =  second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length ; i++) {
            if(first < arr[i]){
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }

        }
        return  second;
    }
//4. Sum of all the elements of an array
    public static int sumOfElementOfArray(int []arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return  sum;
    }
//5. Reverse an Array in Java
    public static int [] reverseAnArray( int [] arr){
        int [] brr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            brr[brr.length- 1 - i] = arr[i];
        }
        return  brr;
    }
//6.Reverse an Array in java without using another array in java
    public static void reverseAnArrayWithoutAnotherArray(int [] arr){
        int left = 0;
        int right = arr.length -1;
        while (right > left){
            int temp = arr[left];
            arr[left]= arr[right];
            arr[right]= temp;

            left++;
            right--;
        }

    }
//7. Sort First half in Ascending and Second half in descending order in Java
    public static void sortHalfInAscendingAndDescending(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length/2){
                if (arr[i] < arr[i+1]){
                    arr[i] = arr[i+1];
                }
            }

        }

    }
//8. Sort the array in Java
    public static void sortArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {-10,-30,-40,-80,-20,-90,-40};
        System.out.println("Largest Element in Array :- " + largestElementInArray(arr));
        System.out.println("Smallest Element in Array :- " + smallestElementInArray(arr));
        System.out.println("Second Largest Element in Array :- "+ secondLargestElementInArray(arr));
        System.out.println("Sum of Element of Array :- " + sumOfElementOfArray(arr));
        System.out.println("Revere an Array :- " + Arrays.toString(reverseAnArray(arr)));
//        reverseAnArrayWithoutAnotherArray(arr);
        System.out.println("Reverse an Array without using another array :- " + Arrays.toString(arr));
//        sortHalfInAscendingAndDescending(arr);
        sortArray(arr);
        System.out.println("Sort Array :- " + Arrays.toString(arr) );
    }

}
