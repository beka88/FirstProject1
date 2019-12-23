package day07;

import java.util.Scanner;

public class ExerciseTwo1 {
    public static void main(String[] args) {

        Scanner bema = new Scanner(System.in);

        System.out.println("enter your first name, last name , company name and email address" );

        String firstName, lastName, company, email;

        firstName = bema.next();
        lastName= bema.next();
        company = bema.next();

        String emailAddress = (firstName+ "_" +lastName+ "@" +company + ".com");

        System.out.println("My name is " + firstName + " " +lastName + " and I work" + company + " " + "my email address is " + emailAddress);



    }
}
