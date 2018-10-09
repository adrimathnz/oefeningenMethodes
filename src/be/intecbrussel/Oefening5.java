package be.intecbrussel;
import java.util.Scanner;

public class Oefening5 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Give a string: ");
        String str = kbd.nextLine();

        System.out.println("Number of words in the string " + words(str));
    }

    public static int words(String str)
    {
        int counter = 0;
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    counter++;
                }
            }
        return counter + 1;
    }

}
