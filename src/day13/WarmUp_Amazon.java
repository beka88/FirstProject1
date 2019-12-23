package day13;

public class WarmUp_Amazon {
    public static void main(String[] args) {

        String memberType ="not prime member";
        double amount = 45.99d;
        int shippingFee = 0;

        if(memberType.equalsIgnoreCase("priMe MEmber")){
            System.out.println("you get 1 day free shipping");
            System.out.println("your final price is " + amount);
        }else if(amount > 25){
            System.out.println("Not prime member but your order is more than 25");
            System.out.println("You got free shipping " + amount);
        }else {
            System.out.println("do u want to sign up for prime member?");
            shippingFee = 5;
            amount = amount +shippingFee;
            System.out.println("Yor final amount is "+ amount);
        }




    }
}
