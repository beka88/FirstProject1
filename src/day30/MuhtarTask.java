package day30;

import java.util.Arrays;

public class MuhtarTask {
    public static void main(String[] args) {
        /* String word ="Bermet";
         String word1="Bertem";

         char[] words1=word.toCharArray();
        System.out.println(Arrays.toString(words1));
        Arrays.sort(words1);
        System.out.println(Arrays.toString(words1));

         String[]words=word.split("");
        System.out.println(Arrays.toString(words));
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        word=Arrays.toString(words1);
        System.out.println(word);*/

        String[] names = {"Ahmed", "John", "Eric", "Ahmed", "Hassan"};
        String tempName = "";
        for (String name : names) {
            if (!name.contains("Ahmed")) {
                tempName += name + " ";
            }
        }
        System.out.println(tempName);
        String[] newArr = tempName.split(" ");
        System.out.println(Arrays.toString(newArr));

        System.out.println("---------------------");
        String[] names1 = {"bema", "kanuka", "ertai", "Aytur"};
        String nameRemoved = "";
        for (String name2 : names1) {
            if (name2.equals("kanuka")) {
                continue;
            } else {
                nameRemoved += name2 + " ";
            }
        }
        System.out.println(nameRemoved);
        String[] newName = nameRemoved.split(" ");
        System.out.println(Arrays.toString(newName));
        System.out.println("------------------------");
        String word = "Computer";
        String[] f123char = word.split("", 3);
        System.out.println(Arrays.toString(f123char));
        System.out.println("----------------------");

    }
}
