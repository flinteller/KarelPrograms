// Flint Eller
// 10/17/19
// This program finds the character at the index of the rounded square root of the length of the user's word

import java.util.Scanner;

public class SquareWordRoot {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word: ");
        // Stores the word user enters under 'word'
        String word = scan.nextLine();

        // Gets the un-rounded square root of the length of the word
        double raw_sqrt = Math.sqrt(word.length());

        // Rounds the square root to the nearest whole number
        int rounded_sqrt = (int) (raw_sqrt + .5);

        // Fetches letter at the index of the rounded square root
        char letter = word.charAt(rounded_sqrt);

        System.out.println("The \"square root\" of " + word + " is " + letter);
    }
}
