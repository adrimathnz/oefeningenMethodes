package be.intecbrussel;
import java.util.*;

public class secondApp {
    public static void main(String[] args) {
        //StruggleInLifeApp daily = new StruggleInLifeApp(); (public void dayRoutine)

        Scanner keyboard = new Scanner(System.in);
        System.out.println("What's the day?: ");
        String day = keyboard.next();
        System.out.println("What's your name?: ");
        String userName = keyboard.next();
        System.out.println("What's your mothers name?: ");
        String replaceMom = keyboard.next();
        System.out.println("What hour did your start working?: ");
        int startHour = keyboard.nextInt();
        System.out.println("What hour did you finish working?: ");
        int endHour = keyboard.nextInt();
        System.out.println("What are you gonna eat?: ");
        String food = keyboard.next();
        System.out.println("Is it time to relax?: ");
        boolean timeForRelaxing = keyboard.nextBoolean();
        System.out.println("Is it time to sleep?: ");
        boolean willSleep = keyboard.nextBoolean();
        System.out.println("Where do you live?: ");
        String startPoint = keyboard.next();
        System.out.println("Where do you work?: ");
        String endPoint = keyboard.next();

        StruggleInLifeApp.dayRoutine(day,userName,replaceMom,startHour,endHour,food,timeForRelaxing,willSleep,startPoint,endPoint);
    }
}