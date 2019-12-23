package day09;

public class MultiBranchPractice {
    public static void main(String[] args) {

        System.out.println("Welcome to McDonald, what can i get for you");
        String order = " ";
        int itemNumber =35;

        if(itemNumber ==11){
            System.out.println("You have selected 1");
            order = "Burger";
        }else if (itemNumber == 5){
            System.out.println("You have selected 1");
            order = "Franch fry";
        } else if (itemNumber == 5){
            System.out.println("You have selected 1");
            order = " Nuggets";
            } else if (itemNumber ==11) {
            System.out.println("You have selected 1");
            order = "Ice cream";
            }

        System.out.println("You have slected unknown item");
        order = "Unknown";

        System.out.println("Your order is" +order);

        }




    }
