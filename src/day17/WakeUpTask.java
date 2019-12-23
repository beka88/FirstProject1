package day17;

import java.util.Scanner;

public class WakeUpTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= scan.nextLine();
        String name2= (name.substring(0,1)).toUpperCase()+ name.substring(1).toLowerCase();
        System.out.println(name2);

        String name3 ="aytUr";
        String nameFixed = (name3.charAt(0)+"").toUpperCase();
        nameFixed=nameFixed+name3.substring(1).toLowerCase();
        System.out.println("nameFixed "+ nameFixed);




    }


}

