package day09;

public class DayPrinterWithSwitchStatement {
    public static void main(String[] args) {
         int language = 5;

         switch (language) {
             case 1 :
                 System.out.println("Hello");
                 break;
             case 2 :
                 System.out.println("Privet");
                 break;
             case 3 :
                 System.out.println("Hola");
                 break;
             case 4 :
                 System.out.println("Merhaba");
                 break;
             case 5 :
                 System.out.println("Bonjour");
                 break;

             default:

                 System.out.println("There is no language");



         }
    }
}
