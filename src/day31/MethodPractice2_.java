package day31;

public class MethodPractice2_ {
    public static void countDown() {
        for (int i = 0; i <= +100; i++) {
            if (i % 2!= 0) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
    public static void countDownFrom20() {
        for (int i = 20; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        countDownFrom20();
        countDown();
    }
}

