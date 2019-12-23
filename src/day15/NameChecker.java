package day15;

public class NameChecker {
    public static void main(String[] args) {

        String name = "Bermet";
        if (name.length() < 4) {
            System.out.println("Short name");
        } else if (name.length() > 5 && name.length() < 10) {
            System.out.println("Medium number");
        } else if (name.length() < 11) {
            System.out.println("Longer name");

            if (name.contains("a") || name.contains("e")) {
                System.out.println("Name contains a and e");
            } else {
                System.out.println("i dont have this letter");
            }
        }
    }
}
