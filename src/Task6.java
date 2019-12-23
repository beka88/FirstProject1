import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3= scan.nextInt();
        int multipResult = num1*num2;
        int sumResult = num1 + num2 +num3;
        if(multipResult>sumResult){
            System.out.println("Excellent number");
        }else{
            System.out.println(" not the numebrs combination I am looking for");
        }
    }
}


