package day08;

public class ClassMulti {
    public static void main(String[] args) {
        int currentSpeed = 55;
        if (currentSpeed > 90) {
            System.out.println("Jail time");
        } else if (currentSpeed > 80) {
            System.out.println("reckless driving");

        } else if (currentSpeed > 70) {
            System.out.println("point taken");
        } else if (currentSpeed > 60) {
            System.out.println("warning");
        }
    }
}