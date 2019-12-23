package day29;

import java.util.Arrays;

public class ArrayPractice {
public static void main(String[] args) {
        int []numbers=new int[100];
        System.out.println(Arrays.toString(numbers));
        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        System.out.println(Arrays.toString(numbers));
        for (int x = 0; x <numbers.length ; x++) {
                numbers[x]=x*2;

        }
        System.out.println("Filling up sentence \n"+ Arrays.toString(numbers));

        }
        }
