package MyPractices;

import java.util.Scanner;

public class repl86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter guest name:");
        String guestName = input.nextLine();
        System.out.println("Do you want to enter new guest name:");
        String guestName1 = input.nextLine();
        System.out.println("Please enter guest name:");
        guestName1 = input.nextLine();
        System.out.println("Do u want to enter new guest name:");
        guestName1 = input.nextLine();
        while (guestName1.equals("yes")) {
            guestName1 = input.nextLine();
        }
        System.out.println("Gues't list: Nick, Linda");

    }
}
