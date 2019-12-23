package MyPractices;

import java.util.Scanner;

public class repl107 {
    public static void main(String[] args) {
        int num, digit1, digit2, digit3, digit4, digit5;
        Scanner scan=new Scanner(System.in);
       System.out.println("Enter your number:");
        num=scan.nextInt();
       // int n= 96587;
        digit1=num/10000;
        System.out.println(digit1);
        digit2= (num%10000)/1000;
        System.out.println(digit2);
        //         5987       987      6
         digit3= ((num%10000)  % 1000) /100;
        System.out.println(digit3);
                              // 5987      987    87     8
        digit4=          ((  (  num%10000 ) %1000 ) %100) /10;
        System.out.println(digit4);
        //                5987       987     87
        digit5=    ((  (  num%10000 ) %1000 ) %100) % 10;
        System.out.println(digit5);

    }
}
