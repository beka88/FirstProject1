package day11;

import javax.swing.*;

public class Practice2 {

    public static void main(String[] args) {
        //int num = 52;

       // System.out.println(num < 10 || num > 100);
        //System.out.println(num > 10 && num < 60);

        //int x =55;
       // System.out.println( x>50 && x !=52 || x==57);
        //System.out.println(5>9 && 9/0 ==3);

        int score = 68;
        if (score<0 || score>100){
        System.out.println("Invalid score");
        }else if(score ==100) {
        System.out.println("Perfect score");
        }else if(score>70 && score <100) {
        System.out.println("You have passed");
        }else { System.out.println("You have failed");
        }









    }
}
