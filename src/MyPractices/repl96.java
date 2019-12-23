package MyPractices;

import java.util.Scanner;

public class repl96 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
       // String word="Hello";
       String separator = scan.next();
       // String separator="Java";
        int count = scan.nextInt();
       // int count=4;

        String finalString=word;
        for (int i = 1; i < count ; i++) {
            finalString=finalString+separator+word;
            //System.out.print(word+separator);
        }
        // Hello + java+hello   java+hello           +   java +hello
        System.out.println(finalString);
    }
}
