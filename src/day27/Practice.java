package day27;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        String[] str = {"java", "cable", "red", "vivid", "remedy", "grace"};
        String shortWord = str[0];
        for (String st : str) {
            if (shortWord.length() > st.length()) {
                shortWord = st;
            }
        }
        System.out.println("shortWord = " + shortWord);

        // System.out.println("--------------------------");

        String shortWord2 = str[0];
        for (int i = 0; i < str.length; i++) {
            if (shortWord2.length() > str[i].length()) {
                shortWord2 = str[i];
            }
        }
        System.out.println("shortWord2 = " + shortWord2);
        System.out.println("----------------------------------");
        int[] arr = {10, 9, 8, 'a'};
        System.out.println(arr.length);


        String car1 = "Camaro";
        String car2 ="BMW";
         char[] ar1=car1.toCharArray();
         char[] ar2=car2.toCharArray();
        Arrays.sort(ar1);
        Arrays.sort(ar2);
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));

        car1= Arrays.toString(ar1);
        System.out.println(car1);




    }
} 


