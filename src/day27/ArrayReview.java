package day27;

import java.sql.PseudoColumnUsage;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayReview {
    public static void main(String[] args) {
     //task01:
        int[] numbers= new int[5];
        System.out.println(Arrays.toString(numbers));

        Scanner scan=new Scanner(System.in);

        for (int i = 0; i <5 ; i++) {
            System.out.println("Enter a number: ");
           // int input = scan.nextInt();
            numbers[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);

        int largestNuber = numbers[numbers.length-1];
        System.out.println("Largest number is: "+ largestNuber);

        int []scores ={100,90,900,8000,10,20,1};
        int min=scores[0];
        for (int i = 0; i < scores.length; i++) {
            if(min>scores[i]){
                min=scores[i];
            }

        }

        System.out.println("Min mun is: "+min);


        int secondMin= scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if(scores[i]==min){
                continue;
            }
            if(secondMin>scores[i]){
                secondMin=scores[i];
            }
        }
        System.out.println("Second min num: "+ secondMin);


    }
}

