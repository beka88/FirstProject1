package MyPractices;

import java.util.Scanner;

class repl48 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String name = inp.nextLine();
        if(name.equals("Chen")){
            System.out.println("Teacher");
        }else{
            System.out.println("Student");
        }


    }
}