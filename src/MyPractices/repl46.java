package MyPractices;

import java.util.Scanner;

class repl46 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        int num = inp.nextInt();
        if (num > 0){
            System.out.println(num + " is positive");
        } else if (num<0){
            System.out.println(num + " is negative");
        }
    }
}