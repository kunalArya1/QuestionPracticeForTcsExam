
/*


            -: Matrix or 2-D Array Questions

1. Take Input in 2-D Array
2. Print the Value of 2-D Array
3. Write a program to search an element in 2-D Array
4. Write a program to find sum of the 2-D Array
5. Write a program to find sum of each row of 2-D Array
6. Write a program to calculate the sum of diagonal of a matrix.






*/


import java.util.ArrayList;
import java.util.Scanner;

public class MatrixQuestions {

// Take Input in 2-D Array
    public static void takeInputIn2DArray( int [][]arr){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("Element at " +i + "and " + j);
                arr[i][j] = sc.nextInt();
            }
        }
    }
// Print the Value of 2-D Array
    public static void print2DArray(int [][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print ( " "+arr[i][j]);
            }
            System.out.println();
        }
    }
//1. Write a program to search an element in 2-D Array
    public static boolean searchElementIn2DArray(int[][] arr ,int target ){
        for (int i  = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
//2. Write a program to find sum of the 2-D Array
    public static int sumOf2DArray(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }
//3. Write a program to find sum of each row of 2-D Array
    public static ArrayList<Integer> sumOfEachRowOfArray(int[][] arr){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++) {
                sum += arr[i][j];
            }
            list.add(sum);
        }
        return list;
    }
//4. Write a program to calculate the sum of diagonal of a matrix.
    public static int sumOfDiagonalOfMatrix(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i == j){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int [][] arr = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,20}};
//        takeInputIn2DArray(arr);
//        print2DArray(arr);
        System.out.println("Search Element in 2-D Array :- "+searchElementIn2DArray(arr,100));
        System.out.println("Sum of 2-D Array :- "+ sumOf2DArray(arr));
        System.out.println("Sum of each row of Matrix :- " + sumOfEachRowOfArray(arr));
        System.out.println("Sum of Diagonal of Matrix :- "+sumOfDiagonalOfMatrix(arr));
    }
}
