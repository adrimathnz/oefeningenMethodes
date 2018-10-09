package be.intecbrussel;
import java.util.*;

public class ExampleMinNumber {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Please fill in a number: ");
        int n1 = kbd.nextInt();
        System.out.println("Please fill in a second number: ");
        int n2 = kbd.nextInt();
        int min = minFunction(n1,n2);
        System.out.println("Lowest value is: " + min);

        System.out.println("Please fill in a double: ");
        double d1 = kbd.nextDouble();
        System.out.println("Please fill in a second number: ");
        double d2 = kbd.nextDouble();
        double minD = minFunction(d1,d2);
        System.out.println("Lowest value is: " + minD);
    }

    public static int minFunction(int n1, int n2) {
        int min;
        if(n1 > n2) {
           min = n2;
        }
        else {
            min = n1;
        }
        return min;

        //return (n1 < n2) ? n1:n2;
    }

    public static double minFunction(double d1, double d2) {
        double min;
        if(d1 > d2) {
            min = d2;
        }
        else {
            min = d1;
        }
        return min;
    }
}
