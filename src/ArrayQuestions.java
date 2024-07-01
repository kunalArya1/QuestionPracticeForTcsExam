
/*
        4. Sum of all the elements of an array
        5. Reverse an Array in Java
        6. Sort First half in Ascending and Second half in descending order in Java
        7. Sort the array in Java
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
    public static void main(String[] args) {
        int [] arr = {10,30,40,80,20,90,-10};
        System.out.println("Largest Element in Array :- " + largestElementInArray(arr));
        System.out.println("Largest Element in Array :- " + smallestElementInArray(arr));


    }
}
