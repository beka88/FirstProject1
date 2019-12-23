package day30;

import java.util.Arrays;

public class CarPractice1 {
    public static void main(String[] args) {
        String car="Lexus-Ls";
        String[]carSplitted=car.split("-");
        System.out.println(Arrays.toString(carSplitted));
        String model=carSplitted[1];
        System.out.println("model = " + model);




    }
}
