package day05;

import java.util.Scanner;

public class WageConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What your hourly wage?");

        int wage = scan.nextInt();
        int salary = wage*2080;

        System.out.println("Your yearly salary is " + salary);

    }
}
