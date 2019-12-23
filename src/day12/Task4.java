package day12;

public class Task4 {
    public static void main(String[] args) {
        String userName = "jhl", password="uiho;";

        if (userName.equals("user123")&& password.equals("pass123")){
        System.out.println("Login successful");
        } else if (!userName.equals("user123") && password.equals("pass123")){
            System.out.println("username not correct");
        } else if(userName.equals("user123") && !password.equals("pass123")){
            System.out.println("password not correct");
        }else {
            System.out.println("no username and password correct");
        }




    }
}
