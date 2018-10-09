package be.intecbrussel;
import java.util.*;

public class Oefening3 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Give a string: ");
        String str = kbd.next();

        System.out.println("The middle character of the string is " + middleChar(str));
    }

    public static String middleChar(String str){
        int position;
        int length;
        if(str.length() % 2 == 0){
            position = (str.length() / 2 )- 1;
            length = 2;
        }
        else{
            position = (str.length() / 2);
            length = 1;
        }
        return str.substring(position,position+length);
    }
}