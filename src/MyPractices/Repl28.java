package MyPractices;

import java.util.Scanner;

public class Repl28 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int day = scan.nextInt();

        if(day == 1){System.out.println("It's a Monday" );}

        else if(day == 5){System.out.println("It's a Friday");}

        else{System.out.println("There is no such a day!");}


    }
}
