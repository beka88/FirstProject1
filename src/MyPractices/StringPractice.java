package MyPractices;

public class StringPractice {
    public static void main(String[] args) {


        String email = "tema@";
        if(!email.contains("@") || email.contains("t")){
            System.out.println("invalid email");
        }else if(email.startsWith("b")){
            System.out.println("valid");
        }else if(email.endsWith("@")){
            System.out.println("hooray");
        }


    }
}