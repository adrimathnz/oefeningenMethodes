package be.intecbrussel;
import java.util.*;

public class Oefening9 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Give a character: ");
        char c1 = kbd.next().charAt(0);
        System.out.println("Give a second character: ");
        char c2 = kbd.next().charAt(0);

        betweenChar(c1,c2,20);
    }

    public static void betweenChar(char c1, char c2, int i){
        for(int a = 1; c1 <= c2; a++, c1++){
            System.out.print(c1 + " ");
            if (a % i == 0) {
                System.out.println(" ");
            }
        }
    }
}