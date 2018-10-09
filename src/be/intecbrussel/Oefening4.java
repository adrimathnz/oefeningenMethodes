package be.intecbrussel;
import java.util.Scanner;

public class Oefening4 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Give a string: ");
        String str = kbd.next();

        System.out.println("Number of vowels in the string " + vowels(str));
    }

    public static int vowels(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                counter++;
            }
        }
        return counter;
    }
}