package MyPractices;

import java.util.Arrays;

public class repl126 {
    public static void main(String[] args) {
        int growth = 0;
        int year = 1;
       while(year<=10) {
           if (year <= 3) {
               growth++;
           } else {
               growth += 2;
           }
           System.out.println(year + " " + growth);
           year++;
       }

       /* String sentence = "Java is fun";
        String[] splittedWord = sentence.split(" ");

        for (int i = splittedWord.length - 1; i>= 0; i--) {
            System.out.println(splittedWord[i] + " ");
        }*/
    }
}