package MyPractices;

import java.util.Scanner;

public class repl98 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
                //   012345
        //String h="Hhilo";

        int count=0;
        String h="";
        for (int i = 0; i <=str.length()-2 ; i++) {
            String current2Char=str.substring(i, i+2);
            if(current2Char.equals("hi")){
                h=h+"hi";
                count++;
            }
        }
        System.out.println(h);
        System.out.println(count);

        String myString="files java i like";
        String s="";

        for (int i = 0; i <=myString.length()-1 ; i++) {
            String iString=myString.substring(i, i+1);
            if(iString.equalsIgnoreCase("i")){
                continue;

            }
            s+=myString.substring(i, i+1);

        }
    }
}


