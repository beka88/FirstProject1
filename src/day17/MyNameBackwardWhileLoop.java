package day17;

public class MyNameBackwardWhileLoop {
    public static void main(String[] args) {
        String name = "bermet";
        int x = name.length() - 1;

        while (x >= 0) {
            System.out.println("index" + x + ":" + name.charAt(x));
            --x ;
        }
    }
}

