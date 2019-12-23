package day14;

public class IndexOfPractice {
    public static void main(String[] args) {

        String name = "Game of Java";
        System.out.println(name.lastIndexOf("G"));
        String name1 ="   Ertai";
        System.out.println(name1.lastIndexOf("i"));
        System.out.println(name1.charAt(3));
        System.out.println(name1.length());
        System.out.println(name1.equalsIgnoreCase("ERTAI"));
        System.out.println(name1.startsWith("E"));
        System.out.println(name1.endsWith("p"));
        System.out.println(name1.trim());
    }
}
