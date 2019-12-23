import java.util.Scanner;

public class StringTask4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a word with at least 3 characters");
        String word = scan.next();
        System.out.println(word.charAt(0)+ word.charAt(word.lastIndexOf(" ")+1+word.length()-1));
    }
}
