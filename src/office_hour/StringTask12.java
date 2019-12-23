package office_hour;

import java.util.Scanner;

public class StringTask12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence with more than r char");
        String sentence = scan.nextLine();
        System.out.println(sentence.charAt(sentence.length()-1)+""+sentence.substring(1,sentence.length()-1)+""+sentence.charAt(0));

        }
    }


/*Task 12:
Given a String with at least two characters
swamp first character with last character
for example
    Java --> aavJ , Kawap --> pawaK

 */