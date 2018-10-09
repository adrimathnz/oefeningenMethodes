package be.intecbrussel;
import java.util.*;

public class Oefening10 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Give a year: ");
        int i = kbd.nextInt();

        System.out.println(leapYear(i));
    }

    public static boolean leapYear(int i){
        if(i % 4 == 0){
            if (i % 100 == 0){
                if(i % 400 == 0){
                    return true;
                }
                else{
                    return false;
                }
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }
}