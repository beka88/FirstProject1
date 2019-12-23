package day16;

import java.util.Scanner;

public class JustPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int x = 0;
        while (x != 5) {
            System.out.println("Give me a five");
            x = scan.nextInt();
        }
        int monkeys=5;
        while(monkeys>=1) {
            System.out.println(monkeys + " little monkeys jumping on the bed,\n" +
                    "  1 fell down and bumped his head,\n" +
                    "  Mama called the doctor and the doctor said,\n" +
                    "  No more monkeys jumping on the bed!");
            --monkeys;
        }
        System.out.println("Put those monkeys right to bed!");




    }
}
