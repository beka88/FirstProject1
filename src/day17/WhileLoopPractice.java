package day17;

public class WhileLoopPractice {
    public static void main(String[] args) {
        int counter = 1;
        while (counter <= 5) {

            System.out.print(counter + " ");
            ++counter;
        }
        System.out.println();
        System.out.println("counter after increment=" + counter);
        while (counter > 1) {
            --counter;
            System.out.print(counter + " ");
        }
        System.out.println();
        System.out.print("counter after decrement=" + counter);

    }

}


