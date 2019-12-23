package day12;

public class Task3 {
    public static void main(String[] args) {
        int num = 45;
        if(num%5== 0 && num%3==0){
            System.out.println("FizzBuzz number");
        }else if(num%5==0){
            System.out.println("Buzz number");
        }else if (num%3==0){
            System.out.println("Fizz number");
        }else{
            System.out.println("Not my number");
        }


        }
    }

