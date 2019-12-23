package MyPractices;

import java.util.Scanner;

public class repl39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");
        int numberOfBedrooms = scan.nextInt();
        int startingPrice=0;
        if(numberOfBedrooms ==1){
            System.out.println("One bedroom selected");
        }else if(numberOfBedrooms==2){
            System.out.println("Two bedroom selected");
        }else if(numberOfBedrooms==3){
            System.out.println("Three bedroom selected");
        }else{
            System.out.println("No such Bedrooms available");
        }

    }
}
