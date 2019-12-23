package office_hour;

import java.util.Scanner;

public class StringTask7 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter valid email address");
        String email = scan.nextLine();
        int indexOfAtSign =email.indexOf("@");
        int indexOfDot =email.indexOf(".");
        String part1=email.substring(0,indexOfAtSign);
        System.out.println(part1);
        String part2=email.substring(indexOfAtSign+1,indexOfDot);
        System.out.println(part2);
        String part3=email.substring(indexOfDot+1);
        System.out.println(part3);

    }
}
/*Task 7:
Ask user to enter valid email address
for example :
 JSnow@NightWatch.com or
 Arya@KingsLanding.edu
 print 3 part of the email separately
 for example :
 Part1 -> JSnow  Part2 -> NightWatch Part3 ->com
 Part1 -> Arya   Part2 -> KingsLanding Part3 ->edu*/
