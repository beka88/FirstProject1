package day06;

import java.util.Scanner;

public class ScannerCapturingOneWord {
    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = blabla.nextLine();
        System.out.println("You have entered your name is: "+ name);

        System.out.println("Which city do u live?");
        String city = blabla.nextLine();
        System.out.println("Your city is: "+ city);

        System.out.println("What is your street address?");
        String address = blabla.nextLine();
        System.out.println("Your address is "+ address);


    }
}
