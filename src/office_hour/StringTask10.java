package office_hour;

import java.util.Scanner;

public class StringTask10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence with 3 word");
        String sentence = scan.nextLine();
        int firsSpace = sentence.indexOf(" ")+1;
        int secondspace= sentence.lastIndexOf(" ");
        System.out.println(sentence.substring(firsSpace,secondspace));

    }
}
/*

 */