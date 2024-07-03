
/*
        9. Sorting element in array by frequency in Java
        14. Java program to count numbers of even and odd elements in an array
        15. Rotation of element of array – left and right
        16. Block swap algorithm for array rotation
        17.  Juggling algorithm for array rotation
        18. Circular rotation of an array by K position
        19. Java program to check the balance of parenthesis
        20. Write a program to check if there exist a duplicate key in the array?

        Study about searching algorithms and sorting algorithms
        and study time complexity of different data structure

*/


import java.util.*;

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
//9. Java program to find the frequency of elements in an array
    public static HashMap<Integer,Integer> findFrequency(int[] arr){

        /*
                A HashMap named frequencyMap is initialized to store the frequency of elements.
                    Iterate over the array using a for-each loop.
                    For each element, check if it is already in the frequencyMap.
                            If it is, increment its count by 1.
                            If it is not, add it to the map with a count of 1.
                Return the frequencyMap.
        * */

        HashMap <Integer,Integer> freq = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(freq.containsKey(arr[i])){
                freq.put(arr[i],freq.get(arr[i])+1);
            }else{
                freq.put(arr[i],1);
            }
        }
        for (Integer key : freq.keySet()){
            System.out.println("Element of Array "+ key + "and Frequency is " + freq.get(key) );
        }
        return freq;
    }
//10. Count distinct element in an array in Java
    public static int countDistinctElement(int []arr){
        HashSet<Integer> count  = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            count.add(arr[i]);
        }
        return  count.size();
    }
//11. Repeating element of an array in Java
    public static ArrayList<Integer> repeatingElementOfArray(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for (Integer key : map.keySet()){
            if(map.get(key)> 1){
                list.add(key);
            }
        }
        return list;
    }
//12. Non Repeating elements in an Array in Java
    public static ArrayList<Integer> nonRepeatingElementOfArray(int [] arr){
        HashMap<Integer,Integer> nonRepeatingElem = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(nonRepeatingElem.containsKey(arr[i])){
                nonRepeatingElem.put(arr[i] ,nonRepeatingElem.get(arr[i])+1);
            }else {
                nonRepeatingElem.put(arr[i],1);
            }
        }
        for(Integer key : nonRepeatingElem.keySet()){
            if (nonRepeatingElem.get(key) == 1){
                list.add(key);
            }
        }
        return list;
    }
//13. Removing Duplicates elements from an array in Java
    public static HashSet<Integer> removeDuplicateElementOfArray(int []arr){
        HashSet<Integer> list = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        return list;
    }




    public static void main(String[] args) {
        int [] arr = {10,30,40,80,20,20,40};
        System.out.println("Largest Element in Array :- " + largestElementInArray(arr));
        System.out.println("Smallest Element in Array :- " + smallestElementInArray(arr));
        System.out.println("Second Largest Element in Array :- "+ secondLargestElementInArray(arr));
        System.out.println("Sum of Element of Array :- " + sumOfElementOfArray(arr));
        System.out.println("Revere an Array :- " + Arrays.toString(reverseAnArray(arr)));
//        reverseAnArrayWithoutAnotherArray(arr);
        System.out.println("Reverse an Array without using another array :- " + Arrays.toString(arr));
//        sortHalfInAscendingAndDescending(arr);
//        sortArray(arr);

        System.out.println("Sort Array :- " + Arrays.toString(arr) );
        // Looping on hashMap
        System.out.println("Freq of Element in Aray is :- " + findFrequency(arr).toString());
        System.out.println("Count of Distinct Element in Array :- " + countDistinctElement(arr));
        System.out.println("Repeating Element of Array :- " + repeatingElementOfArray(arr));
        System.out.println("Non-Repeating Element of Array is :- " + nonRepeatingElementOfArray(arr).toString());
        System.out.println("Remove Duplicate Element of Array :- " + removeDuplicateElementOfArray(arr));
    }

}
