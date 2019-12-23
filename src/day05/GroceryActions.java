package day05;
import java.util.Scanner;

public class GroceryActions {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("What is the price for potato?");
        float potatoPrice = scan.nextFloat();
        System.out.println("How many u want to buy?");
        int potatoCount = scan.nextInt();
        float totalPotato = potatoPrice * potatoCount;
        System.out.println("Your total for potato is " + totalPotato+ "$");

        System.out.println("What is the price for tomato?");
        float tomatoPrice = scan.nextFloat();
        System.out.println("How many tomato you want to buy?");
        int tomatoCount = scan.nextInt();
        float totalTomato = tomatoPrice * tomatoCount;
        System.out.println("Your total for tomato is " + totalTomato +"$");

        System.out.println("What is the price for banana? ");
        float priceBanana = scan.nextFloat();
        System.out.println("How many banana you want to buy?");
        int bananaCount = scan.nextInt();
        float totalBanana = priceBanana * bananaCount;

        System.out.println("Your total for banana is " + totalBanana + "$");

        System.out.println("Your grand total for shipping is " +"$"+ (totalPotato + totalTomato + totalBanana));



    }
}
