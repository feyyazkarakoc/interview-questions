package mülakat270225;

import java.util.Arrays;
import java.util.Scanner;

class Main18 {


    // solution 1 :
    /*public static String ArrayAdditionI(int[] arr) {
        // code goes here
        int target = Arrays.stream(arr).sorted().toArray()[arr.length - 1];

        int[] newArr = Arrays.stream(arr).filter(n -> n != target).toArray();

        return ArrayAdditionIHelper(newArr, 0, target) ? "true" : "false";
    }

    public static boolean ArrayAdditionIHelper(int[] arr, int index, int target) {
        if (target == 0) return true;
        if (index >= arr.length) return false;

        if (ArrayAdditionIHelper(arr, index + 1, target - arr[index])) return true;
        if (ArrayAdditionIHelper(arr, index + 1, target)) return true;

        return false;
    }*/


    public static String ArrayAdditionI(int[] arr) {

        int target = Arrays.stream(arr).sorted().toArray()[arr.length - 1];
        int[] newArr = Arrays.stream(arr).filter(n -> n != target).toArray();

        return ArrayAdditionIHelper(newArr, 0, target) ? "true" : "false";
    }

    public static boolean ArrayAdditionIHelper(int[] arr, int index, int target) {

        if (target == 0) return true;
        if (index >= arr.length) return false;

        if (ArrayAdditionIHelper(arr, index + 1, target - arr[index])) return true;
        return ArrayAdditionIHelper(arr, index + 1, target);
    }




    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(ArrayAdditionI(new int[]{3, 5, -1, 8, 12}));
    }

}



/*Array Addition I
Have the function ArrayAdditionI(arr) take the array of numbers stored in arr and return the string true if any combination of numbers in the array (excluding the largest number) can be added up to equal the largest number in the array, otherwise return the string false. For example: if arr contains [4, 6, 23, 10, 1, 3] the output should return true because 4 + 6 + 10 + 3 = 23. The array will not be empty, will not contain all the same elements, and may contain negative numbers.*/