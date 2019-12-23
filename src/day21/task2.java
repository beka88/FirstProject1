package day21;

public class task2 {
    public static void main(String[] args) {
        String message ="I struggle with Java I like Java I love Java Everything is Awesome!";
        for (int i = 0; i<message.length() ; i++) {
            if (i % 2 != 0){
                continue;
            }if(message.charAt(i)=='J'){
                break;
            }
                System.out.println(message.charAt(i));
            }
        }
    }

