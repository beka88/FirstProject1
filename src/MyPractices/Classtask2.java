package MyPractices;

public class Classtask2 {
    public static void main(String[] args) {

        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};
        //2.1
        for (int i = 0; i < prices.length; i++) {
            if (i % 2 == 0) {
                System.out.println(prices[i]);
            }
        }
        System.out.println("---------------------");
        //2.2
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < 3) {
                System.out.println(prices[i]);
            }
        }
        System.out.println("----------------------");
        //2.3
        float sum = 0;
        for (int i = 0; i < prices.length; i++) {
            sum = sum + prices[i];
        }
        System.out.println(sum);
        System.out.println("----------------------");
        //2.4
        for (int i = prices.length - 3; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
        System.out.println("-----------------------");
        //2.5
        System.out.println(prices[prices.length / 2] + prices[prices.length / 2 - 1]);
        //2.6
        System.out.println("------------------------");
        float sum1 = 0;
        for (int i = 0; i < prices.length; i++) {
            sum1 = sum1 + prices[i];
        }
        float avarege = sum1 / prices.length;
        System.out.println(avarege);
        for (int i = 0; i < prices.length; i++) {
            if (avarege < prices[i]) {
                System.out.println(prices[i]);
            }
        }
        System.out.println("------------------");
      /*  //2.7
        float max = prices[0];
        int indexOfMax=0;
        for (int i = 0; i < prices.length; i++) {
            if (max < prices[i]) {
                max = prices[i];
                indexOfMax=i;
            }


        System.out.println(max);
        System.out.println(indexOfMax);
        System.out.println("-----------------");*/
        //2.8

        float max = prices[0];
        int indexOfMax = 0;
        float max1 = 0;
        for (int i = 0; i < prices.length; i++) {
            if (max < prices[i]) {
                max = prices[i];
                indexOfMax = i;
            }
        }
        System.out.println(max1);
    }
}
