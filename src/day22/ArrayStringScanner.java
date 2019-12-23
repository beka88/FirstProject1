package day22;

import java.util.Scanner;

public class ArrayStringScanner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String[] name = new String[4];
        System.out.println("pls enter house hold member");
        for (int x = 0; x < name.length; x++) {
            name[x]=scan.next();
        //name[1]=scan.next();
        //name[2]=scan.next();
        //name[3]=scan.next();
        System.out.print(name[x]+" ");}
        //System.out.println(name[1]);
       // System.out.println(name[2]);
        //System.out.println(name[3]);

    }
}
