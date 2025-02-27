package mülakat270225;

import java.util.Scanner;

class Main1 {

    // solution 1:
    /*public static int VowelCount(String str) {
        // code goes here

        return str.replaceAll("[^aeiouAEIOU]", "").length();
    }*/


    // solution 2:
    public static int VowelCount(String str) {
        // code goes here

        return (int) str.toLowerCase().chars().filter(ch -> isVowel(ch)).count();
    }

    public static boolean isVowel(int ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(VowelCount(s.nextLine()));
    }

}


/*Vowel Count
Have the function VowelCount(str) take the str string parameter being passed and return the number of vowels the string
contains (ie. "All cows eat grass and moo" would return 8). Do not count y as a vowel for this challenge.*/