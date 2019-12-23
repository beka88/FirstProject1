package day18;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Knock Knock");
        System.out.println("What's the password");
        String password = scan.next();
         while(!password.equals("B15") ){
             System.out.println("wrong password");
             password = scan.next();

         }
        System.out.println("open sesame");
    }
}
