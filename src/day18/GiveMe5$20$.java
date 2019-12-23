package day18;

import java.util.Scanner;

public class GiveMe5$20$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("pls give me 5 or 20");
        int x = scan.nextInt();
        while(x!=5 && x!=20){
            System.out.println("not the bill i am looking for");
            System.out.println("give me 5 or 20");
            x = scan.nextInt();
        }
        System.out.println("the end");
    }
}
