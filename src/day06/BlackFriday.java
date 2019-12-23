package day06;

import java.util.Scanner;

public class BlackFriday {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("What is the regular price?:");
        float regPrice = scan.nextFloat();
        System.out.println("What is the sale price?:");
        float salePrice = scan.nextFloat();
        System.out.println("What is the Discount Percentage?:");
        float disPers = scan.nextFloat();

        System.out.println("Regular price is "+ regPrice + "$"+" Sale price is "+ salePrice+ " Discount Percentage "+ disPers+"$");









    }
}
