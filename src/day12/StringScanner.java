package day12;

import java.util.Scanner;

public class StringScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter ur season pls");
        String season =scan.next();
        if(season.equalsIgnoreCase("spring")){
            System.out.println("hiking");
        }else if(season.equalsIgnoreCase("summer")){
            System.out.println("pool");
        }else if (season.equalsIgnoreCase("fall")){
            System.out.println("just code");
        }else if(season.equalsIgnoreCase("winetr")){
            System.out.println("ski");
        }else{
            System.out.println("not valid");
        }

    }
}
