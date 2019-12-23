package day06;

public class UsingTheValue {
    public static void main(String[] args) {

        int myFavNumber = 300;
        int yourFavNumber = myFavNumber;

        System.out.println("My Favorite Number " + myFavNumber);
        System.out.println("Your Favorite Number " +yourFavNumber);

        yourFavNumber = 100;
        System.out.println("My Favorite Number " + myFavNumber);
        System.out.println("Your Favorite Number " +yourFavNumber);


    }
}
