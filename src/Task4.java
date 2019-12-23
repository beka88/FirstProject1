import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3= scan.nextInt();
        if(num1>100 && num2>100 && num3>100){
            System.out.println("True");
        }else{
            System.out.println("not all numbers are more than 100 ");
        }
    }
}
