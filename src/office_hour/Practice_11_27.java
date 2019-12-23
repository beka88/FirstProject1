package office_hour;

public class Practice_11_27 {
    public static void main(String[] args) {

        String message = "I Love Java";
        System.out.println(message.lastIndexOf("Java"));
        System.out.println(message.contains("L"));
        boolean messageContainsLove = message.contains("Love");
        System.out.println(messageContainsLove);
        boolean messageContainsR = message.contains("R");
        System.out.println(messageContainsR);
        System.out.println(message.contains("R"));

    }
}
