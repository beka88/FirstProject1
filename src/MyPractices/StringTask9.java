package MyPractices;

import java.util.Scanner;

public class StringTask9 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a valid URL");
        String url =scan.nextLine();
        int firstIndexOfDot=url.indexOf(".");
        System.out.println(firstIndexOfDot);
        int lastIndexOfDot=url.lastIndexOf(".");
        System.out.println(lastIndexOfDot);
        System.out.println(url.substring(firstIndexOfDot+1,lastIndexOfDot));
    }
}
