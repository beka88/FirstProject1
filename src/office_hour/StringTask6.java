package office_hour;

import java.util.Scanner;

public class StringTask6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a full name");
        String fullName = scan.nextLine();
        int spaceIndex = fullName.lastIndexOf(" ");
        String email = fullName.charAt(0) + fullName.substring(spaceIndex + 1) + "@NightWatch.com";

        System.out.println(email);
    }
}

//Task 6:
 //       Ask user to enter full name
 //      assuming full name is 2 word
  //      Write a program generate email account as below:
   //     it starts with first character of first name
  //      and whole last name then @NightWatch.com
//for example :
//        Jon Snow -->> JSnow@NightWatch.com

