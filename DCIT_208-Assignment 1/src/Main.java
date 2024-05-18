import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<dayEventVerse> days = new ArrayList<>(
                List.of(
                        new dayEventVerse("Genesis 1, verses: 1-5","God created light and separated it from darkness", 1),
                        new dayEventVerse("Genesis 1, verses: 6-8","God separated the waters above from the waters below, creating the sky", 2),
                        new dayEventVerse("Genesis 1, verses: 9-13","God gathered the waters to form seas and allowed dry land to appear. He also created vegetation", 3),
                        new dayEventVerse("Genesis 1, verses: 14-19","God made the sun, moon, and stars to govern day and night", 4),
                        new dayEventVerse("Genesis 1, verses: 20-23","God created sea creatures and birds", 5),
                        new dayEventVerse("Genesis 1, verses: 24-31","God made land animals, including livestock and wild animals. He also created humans in His image", 6),
                        new dayEventVerse("Genesis 2, verses: 1-3","God rested, blessing and sanctifying the seventh day", 7)
                )
        );

        int day = getDay();
        getEvent(day, days);
        decision( day, days);
    }

    public static void decision( int day, List<dayEventVerse> days){
        System.out.println("Would you like to know about another day? (Type 1)");
        System.out.println("Would you like to know the verse from which this is from? (Type 2)");
        System.out.println("Would you like to exit? (Type 3)");

        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        try{
            choice = scanner.nextInt();
            if (choice < 1 || choice > 3){
                System.out.println("Please enter a valid number in the range of 1-3!");
                decision(day, days);
            }
        }
        catch (Exception e){
            System.out.println("Please enter a valid number!");
            decision(day, days);
        }
        if (choice == 1) {
            int newDay = getDay();
            getEvent(newDay, days);
            decision(newDay, days);
        } else if (choice == 2) {
            getVerse(day, days);
            decision(day, days);
        } else{
            System.out.println("Goodbye!");
            System.exit(0);
        }
    }
    public static  int getDay(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day you want to know of.");
        System.out.print("Day: ");
        int day = 0;
        try{
         day = scanner.nextInt();
        if(day < 1 || day > 7 ){
            System.out.println("Please enter a valid number in the range of 1-7!");
            day = getDay();
        }}
        catch (Exception e){
            System.out.println("Please enter a valid number!");
            day = getDay();
        }
        return day;

    }

    public static void getVerse(int day, List<dayEventVerse> days){
        switch (day){
            case 1:
                System.out.println("The verse is: " + days.get(day-1).getVerse());
                System.out.println();
                break;
            case 2:
                System.out.println("The verse is: " + days.get(day-1).getVerse());
                System.out.println();
                break;
            case 3:
                System.out.println("The verse is: " +days.get(day-1).getVerse());
                System.out.println();
                break;
            case 4:
                System.out.println("The verse is: " + days.get(day-1).getVerse());
                System.out.println();
                break;
            case 5:
                System.out.println("The verse is: " + days.get(day-1).getVerse());
                System.out.println();
                break;
            case 6:
                System.out.println("The verse is: " + days.get(day-1).getVerse());
                System.out.println();
                break;
            case 7:
                System.out.println("The verse is: " + days.get(day-1).getVerse());
                System.out.println();
                break;
        }
    }

    public static void getEvent(int day, List<dayEventVerse> days){

        switch (day){
            case 1:
                System.out.println("On day " + day + ";");
                System.out.println(days.get(day-1).getEvent());
                System.out.println();
                break;
            case 2:
                System.out.println("On day " + day + ";");
                System.out.println(days.get(day-1).getEvent());
                System.out.println();
                break;
            case 3:
                System.out.println("On day " + day + ";");
                System.out.println(days.get(day-1).getEvent());
                System.out.println();
                break;
            case 4:
                System.out.println("On day " + day + ";");
                System.out.println(days.get(day-1).getEvent());
                System.out.println();
                break;
            case 5:
                System.out.println("On day " + day + ";");
                System.out.println(days.get(day-1).getEvent());
                System.out.println();
                break;
            case 6:
                System.out.println("On day " + day + ";");
                System.out.println(days.get(day-1).getEvent());
                System.out.println();
                break;
            case 7:
                System.out.println("On day " + day + ";");
                System.out.println(days.get(day-1).getEvent());
                System.out.println();
                break;
        }
    }
    public static class dayEventVerse{
        private String verse;
        private String event;
        private int day;

        public dayEventVerse(String verse, String event, int day) {
            this.setVerse(verse);
            this.setEvent(event);
            this.setDay(day);
        }

        public String getVerse() {
            return verse;
        }
        public void setVerse(String verse) {
            this.verse = verse;
        }

        public String getEvent() {
            return event;
        }
        public void setEvent(String event) {
            this.event = event;
        }

        public int getDay() {
            return day;
        }
        public void setDay(int day) {
            this.day = day;
        }
    }
}