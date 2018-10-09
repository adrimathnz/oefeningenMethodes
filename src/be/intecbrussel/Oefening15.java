package be.intecbrussel;
import java.util.*;
import java.text.*;

public class Oefening15 {

    public static void main(String[] args) {
        System.out.print("Current date and time: ");
        displayTime();
    }


    private static void displayTime(){
        Calendar now = Calendar.getInstance();
        DateFormat df = new SimpleDateFormat("EEEE MMMM dd, yyyy H:mm:ss");
        System.out.println(df.format(now.getTime()));
    }

}