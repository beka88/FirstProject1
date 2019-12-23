package day14;

public class EmailChecker {
    public static void main(String[] args) {

        String email = "bekaka@gmail.com";

        boolean mustNotContainAt = !email.contains("@");
        boolean mustContainSpace = email.contains(" ");
        boolean endWithGmail = email.endsWith("@gmail.com");
        boolean endWithYahoo = email.endsWith("@yahoo.com");
        boolean endWithMail = email.endsWith("@mail.ru");

        if(mustContainSpace || mustNotContainAt){
            System.out.println("Invalid email");
        }else if (endWithGmail){
            System.out.println("Gmail.com");
        }else if (endWithYahoo) {
            System.out.println("yahoo.com");
        } else if (endWithMail) {
            System.out.println("Mail.com");
        }




    }
}