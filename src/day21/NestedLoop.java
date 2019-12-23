package day21;

public class NestedLoop {
    public static void main(String[] args) {
        for (char x = 1; x <= 10; x++) {

            for (int y = 1; y <= x; y++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int x = 1; x < 10; x++) {
            for (int i = 0; i < 10; i++) {
                System.out.println(x + "x" + i + "=" + x * i);
            }
        }
        String word ="ken";
        int lastletter=word.length()-1;
        System.out.println(lastletter);

    }
}
