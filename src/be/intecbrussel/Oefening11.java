package be.intecbrussel;
import java.util.*;

public class Oefening11 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("1. A password must have at least eight characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits.");
        System.out.println("Input a password: ");
        String s1 = kbd.next();


        if(password(s1)){
            System.out.println("Password is valid: " + s1);
        }
        else{
            System.out.println("Password is invalid!");
        }
    }

    public static boolean password(String s1){
        if(s1.length() < 8) return false;

        int charCount = 0;
        int numCount = 0;

        for (int i =0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;

        }
        return (numCount >= 2);
    }

    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean is_Numeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }
}