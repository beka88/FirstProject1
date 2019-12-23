package day12;

public class CarShopping {
    public static void main(String[] args) {
        String carType = "Camaro";
        System.out.println(carType.equalsIgnoreCase("CAMARO"));
        System.out.println(carType.toUpperCase());
        System.out.println(carType.toLowerCase());

        String name = "Bermet";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());

        int lengthOfStr = name.length();

        if(lengthOfStr> 4){
            System.out.println("More than 4 character");
        }







    }
}
