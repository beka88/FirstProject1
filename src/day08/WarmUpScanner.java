package day08;

import java.util.Scanner;

public class WarmUpScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Guess my fav number");
        int myFavNum = scan.nextInt();
        if (myFavNum == 300) {
            System.out.println("Bingo");
        } else {
            System.out.println("Try again"); }


    }
}
