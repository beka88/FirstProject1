package day17;

public class NamePrinterWhileLoop {
    public static void main(String[] args) {
        String name = "Kenzhebek";
        int x = 0;
        while(x<name.length()){
            System.out.print("index"+ x +":");
            System.out.println(name.charAt(x) );
        ++x;}


    }
}
