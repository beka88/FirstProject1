package day29;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        String []name=new String[300];

        for (int i = 0; i <name.length; i++) {
            //name[0]="I love java";
            name[i]="I love java";
        }
        System.out.println(Arrays.toString(name));

        /*
        tring message="I love Pumpkin,Pumpkin is fun!!";
        message=message.replace("Pumpkin","Java");
        System.out.println(message);
         */
        System.out.println("---------------------");
        String superhero="Superman-Clark Kent";
        String[]splitSuperman=superhero.split("-");
        System.out.println(Arrays.toString(splitSuperman));

        String[]splitted=superhero.split("-");
        System.out.println(Arrays.toString(splitted));

        String sentence="Java is fun";
        String[]items=sentence.split(" ");
        for (int i= items.length-1; i>=0;i--) {
            System.out.println(items[i]);
        }

       String[] words ={"hello", "why", "by", "apple" , "note"};

        for(int x=0;x<words.length;x++)
        words[x]=(""+words[x].charAt(0)+words[x].charAt(words[x].length()-1));
        System.out.println(Arrays.toString(words));



    }
}
