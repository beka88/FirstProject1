package MyPractices;

import java.util.Scanner;

class Repl47 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();
        //DO NOT CHANGE ABOVE CODE!  Write your code below
        if (num % 2 == 0) {
            System.out.println("is even");
        }else{
            System.out.println("is odd");
        }
    }
}
