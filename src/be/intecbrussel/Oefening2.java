package be.intecbrussel;
import java.math.*;
import java.util.*;

public class Oefening2 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Give a number: ");
        double d1 = kbd.nextDouble();
        System.out.println("Give a second number: ");
        double d2 = kbd.nextDouble();
        System.out.println("Give a third number: ");
        double d3 = kbd.nextDouble();

        System.out.println("The average value is " + average(d1,d2,d3));
    }

    public static double average(double d1, double d2, double d3){
        return (d1 + d2 + d3) / 3;
    }
}