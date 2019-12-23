package day16;

import java.util.Scanner;

public class PracticeString{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String word1="";
        String word2="";
        System.out.println("Enter four  character word please");
        word1=scan.next();
        word2 = word1.charAt(3)+""+word1.charAt(2)+""+word1.charAt(1)+""+word1.charAt(0);
        System.out.println(word2);


    }
        }
