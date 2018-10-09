package be.intecbrussel;
import java.util.Scanner;

public class Oefening6 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.println("Input an integer: ");
        int i1 = kbd.nextInt();

        System.out.println("The sum is " + sum(i1));
    }

    public static int sum(int n){
        int result = 0;
        while(n > 0) {
            result += n % 10;
            n /= 10;
}
        return result;
    }
}