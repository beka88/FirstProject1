package day06;

import java.util.Scanner;

public class NextLine_NexT {

    public static void main(String[] args) {

        Scanner kanuka = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = kanuka.nextLine();
        System.out.println("your name is "+ name);

        System.out.println("what is your age? ");
        int age = kanuka.nextInt();
        System.out.println("Your age is: " + age);

        System.out.println("What is ur address? ");
        String address = kanuka.nextLine();
        System.out.println("your address is "+ address);




    }
}

