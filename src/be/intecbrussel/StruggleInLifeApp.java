package be.intecbrussel;
import java.util.*;

public class StruggleInLifeApp {
    public static void dayRoutine(String day, String userName, String replaceMom, int startHour, int endHour, String food, boolean timeForRelaxing, boolean willSleep, String startPoint, String endPoint){
        printThemLines(50,day);
        morningRoutine(userName,replaceMom);
        transport(startPoint,endPoint);
        workRoutine(startHour,endHour);
        transport(endPoint,startPoint);
        eveningRoutine(food,timeForRelaxing,willSleep);
    }

    private static void morningRoutine(String userName, String replaceMom) {
        printThemLines(50,"morning routine");
        System.out.println("Get up " + userName + " your clock keeps going off");
        System.out.println("Make up your bed or " + replaceMom + " will be mad :'(");
        System.out.println("Breakfast, most important meal of the day");
        System.out.println("Brush your teeth, nobody wants to smell!");
    }

    private static void workRoutine(int startHour, int endHour) {
        printThemLines(50,"work routine");
        System.out.println(startHour + "H, time to begin the workday!");
        System.out.println("Break");
        System.out.println(endHour + "H, time to go home. \nFree at last !!");
    }

    private static void eveningRoutine(String food, boolean timeForRelaxing, boolean willSleep){
        printThemLines(50, "evening routine");
        System.out.println("Today we eat: " + food);
        String eveningActivity = (timeForRelaxing) ? "Time to relax now" : "Work is fun, now work more...";
        System.out.println(eveningActivity);
        String sleepTonight = willSleep ? "Ok, you earned it. \nYou can go to sleep" : "Who needs sleep if you can work";
        System.out.println(sleepTonight);
    }

    private static void transport(String startPoint, String endPoint) {
        Random rand = new Random();
        printThemLines(50, "transport");
        System.out.println("You are on your way from " + startPoint + " and are taking the train to " + endPoint);
        System.out.println("Sorry but you will be " + (rand.nextInt(30) + 1) + " minutes late.");
        System.out.println("You have arrived in: " + endPoint);
    }

    private static void printThemLines(int lines, String message) {
        System.out.println("\n" + message + '\n');

        for(int i = 0; i < lines; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}