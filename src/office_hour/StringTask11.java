package office_hour;

import java.util.Scanner;

public class StringTask11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence with more than 1 word");
        String sentence = scan.nextLine();
        int firstIndexOfSpace= sentence.indexOf(" ");
        int lastIndexOfSpace=sentence.lastIndexOf(" ");
        System.out.println(sentence.substring(0,firstIndexOfSpace));
        System.out.println(sentence.substring(lastIndexOfSpace+1));
    }
}
