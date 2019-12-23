import java.util.Scanner;

public class StringTask3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name");
        String name = scan.nextLine();
        System.out.println("Your initials is " + name.charAt(0)+ name.charAt(name.lastIndexOf(" ")+1));

    }
}
