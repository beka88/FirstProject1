package day17;

public class EvenNumberFinder {
    public static void main(String[] args) {
        int count = 0;
        while (count <= 100) {
            System.out.print(count + " ");
            count += 2;
        }
        System.out.println("---------------");
        int count1 = 0;
        while (count1 <= 100) {
            System.out.print(count1 + " ");
            count1 += 3;
        }
        System.out.println("------------");
        int cnt3 = 0;

        while (cnt3 <= 50) {

            if (cnt3 % 2 == 0) {
                System.out.println(cnt3 + " is even number");
            } else {
                System.out.println(cnt3 + " is odd number");
            }
            ++cnt3;
        }
    }
}