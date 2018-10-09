package be.intecbrussel;
import java.util.*;

public class Oefening8 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Input the investment amount: ");
        double d1 = kbd.nextDouble();
        System.out.println("Input the rate of interest: ");
        double d2 = kbd.nextDouble();
        System.out.println("Input the number of years: ");
        double d3 = kbd.nextDouble();

        investment(d1,d2,d3);
    }

    public static void investment(double d1, double d2, double d3){
        System.out.println("Years" + "\t \t" + "Futurevalue");
        for(int i = 1; i < d3+1; i ++){
            System.out.println(i + "\t \t \t" + (d1 += (d1/d2)));
        }
    }
}