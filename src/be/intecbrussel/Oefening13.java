package be.intecbrussel;
import java.util.*;
import java.math.*;

public class Oefening13 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Input side1: ");
        double d1 = kbd.nextDouble();
        System.out.println("Input side2: ");
        double d2 = kbd.nextDouble();
        System.out.println("Input side3: ");
        double d3 = kbd.nextDouble();

        if(isTriangle(d1,d2,d3)) {
            System.out.println("The area of the triangle is " + areaTriangle(d1, d2, d3));
        }
        else{
            System.out.println("Not a valid triangle");
        }
    }

    public static double areaTriangle(double d1, double d2, double d3){
        double s1 = ((d1+d2+d3)/2);
        return Math.sqrt(s1*(s1-d1)*(s1-d2)*(s1-d3));
    }

    public static boolean isTriangle(double d1, double d2, double d3){
        return(d1+d2 > d3 && d2 + d3 > d1 && d3 + d2 > d1);
    }
}