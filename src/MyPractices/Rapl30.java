package MyPractices;

import java.util.Scanner;

class repl30 {
    public static void main(String[] args) {
        String item1, item2, item3, report;
        double price1,price2,price3,totalPrice;
        int count1,count2,count3;

        Scanner scan =new Scanner(System.in);

        System.out.println("Enter Item1, count and it's price:");
        item1 = scan.next();
        count1 = scan.nextInt();
        price1 = scan.nextDouble();
        System.out.println("Enter Item2, count and it's price:");
        item2 = scan.next();
        count2 = scan.nextInt();
        price2 = scan.nextDouble();
        System.out.println("Enter Item3, count and it's price:");
        item3 = scan.next();
        count3 = scan.nextInt();
        price3 = scan.nextDouble();



        totalPrice = price1*2 + price3*5;
        report = "Item1: " + item1 + " Price: "+ price1*2 + ", Item3: " +item3 + " Price: " + price3*6;
        System.out.println(report);
        System.out.println("Total price: "+totalPrice);










    }
}



