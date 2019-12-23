import java.util.Scanner;

public class StringTask1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your sentence");
        String sentence = scan.next();
        if(sentence.length()>1){
            System.out.println(sentence.substring(0,2));
        }else if(sentence.isEmpty()){
            System.out.println("Sting is empty");
        }else{
            System.out.println(sentence.charAt(0)+""+ sentence.charAt(0));
        };



    }
}
