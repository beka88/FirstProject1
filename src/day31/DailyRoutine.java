package day31;

public class DailyRoutine {
    public static void wakeUp(){
        System.out.println("Open ur eye");
        System.out.println("Close ur eye");
        System.out.println("Hear ur alarm?");
        System.out.println("--------------");
    }
    public static void drinkCoffee(){
        System.out.println("Put coffee");
        System.out.println("Make ur coffee");
        System.out.println("bla bla");
        System.out.println("----------------");
    }
    public static void studyJava(){
        System.out.println("Think about java waking up");
        System.out.println("Think about java drinking coffee");
    }
    public static void main(String[] args) {
        wakeUp();
        drinkCoffee();
        studyJava();
    }
}
