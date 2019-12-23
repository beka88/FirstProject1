package day26;

import java.util.Arrays;

public class ArrayReview {
    public static void main(String[] args) {
        int[] myNumbers = {10, 40, 30, 7};
        myNumbers[2] = myNumbers[0] + myNumbers[1];
        System.out.println("third item value: " + myNumbers[2]);

        System.out.println(Arrays.toString(myNumbers));
        int temp = myNumbers[0];
        myNumbers[0] = myNumbers[3];
        myNumbers[3] = temp;
        System.out.println(myNumbers[0]);
        System.out.println(myNumbers[3]);

        String survey = "Complete B15 Online";
        char[] surveyChars = survey.toCharArray();
        for (char each : surveyChars) {
            System.out.println(each);
        }
        System.out.println("--------------------");

        String[]marvelHeroes={"Iron Man","Captain America","Spiderman","Black Panther",
                               "Hulk","Black Widow","Wanda","Captain Marvel","Captain America","Spiderman",
                                "Black Widow","Wanda","Captain Marvel","Captain America" };
        System.out.println("Marvel heroes: "+ Arrays.toString(marvelHeroes));
        int sizeOfArray=marvelHeroes.length;
        System.out.println("Hero count = " + sizeOfArray);
        String itemToSearch="Black Widow";
        int countOfItem=0;

        for (String eachHeroes:marvelHeroes) {
            if(eachHeroes.toLowerCase().contains("black")){
                countOfItem++;
            }
        }
        System.out.println("countOfItem = " + countOfItem);

        String students="Ken, Bema, Ertai,Aytur, Kanuka";
        String[]namesArrays1=students.split(" ");
        System.out.println(Arrays.toString(namesArrays1));
        for (int i = 0; i <namesArrays1.length ; i++) {


        }




            
            
        }
    }


