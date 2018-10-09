package be.intecbrussel;
import java.math.*;
import java.util.*;

public class Oefening1 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Give a number: ");
        double d1 = kbd.nextDouble();
        System.out.println("Give a second number: ");
        double d2 = kbd.nextDouble();
        System.out.println("Give a third number: ");
        double d3 = kbd.nextDouble();

        System.out.println("The smallest value is " + smallest(d1,d2,d3));
    }

    public static double smallest(double d1, double d2, double d3){
        return Math.min(Math.min(d1, d2),d3);
    }
}
