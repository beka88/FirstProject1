package day11;

public class WakeUpTask {
    public static void main(String[] args) {
        String targetOption = "haswi";
        switch (targetOption) {

            case "bd":
                System.out.println("You have turned on bedroom light");
                break;
            case "lr":
                System.out.println("You have turned on living room");
                break;
            case "ki":
                System.out.println("You have turned on kitchen");
                break;
            case "ha":
                System.out.println("You have turned on hallway ");
                break;
            default:
                System.out.println("No such a light in your room");


        }
    }
}
