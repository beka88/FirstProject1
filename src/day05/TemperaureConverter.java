package day05;
import java.util.Scanner;

public class TemperaureConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" What is temperature in F?");

        double fahrenheit = scan.nextDouble();

        double celsius = (5.0/9)*(fahrenheit-32);

        System.out.println(" fahreihet"  + fahrenheit+ " is"  +celsius +" in celsius");










    }
}
