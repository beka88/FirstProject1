package day09;

public class Answer {
    public static void main(String[] args) {
        String myAnswer = "";
        int myNumber = 555;
        if (myNumber % 5 ==0){
        myAnswer = "Fizz Number";
        } else {
            myAnswer = "Not Fizz Number";
        }
        System.out.println("print my number is " + myNumber+ ",It is " +myAnswer);




    }
}
