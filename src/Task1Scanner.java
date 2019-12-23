import java.util.Scanner;

public class Task1Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int sum = num1+num2+num3;
        if(sum>100){
            System.out.println("You won");
        }else{
            System.out.println("sum of numbers not more than 100");
        }



    }
}
