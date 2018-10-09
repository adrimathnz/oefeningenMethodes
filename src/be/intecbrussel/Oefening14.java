package be.intecbrussel;
import java.util.*;
import java.math.*;

public class Oefening14 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Input the number of sides: ");
        int n = kbd.nextInt();
        System.out.println("Input the side: ");
        double s = kbd.nextDouble();

        System.out.println("The are of the pentagon is " + pentagon(n,s));
    }

    public static double pentagon(int n, double s){
        return  (n * s * s) / (4 * Math.tan(Math.PI/n));
    }
}