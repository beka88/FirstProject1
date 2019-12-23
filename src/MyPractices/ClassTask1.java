package MyPractices;

public class ClassTask1 {
    public static void main(String[] args) {
        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float[] prices = {1.99f, 0.99f, 4.65f, 3.89f, 3.88f, 2.88f};

        //1.
        // 1.1
        for (int i = 0; i < groceryItems.length; i++) {

            if (i % 2 != 0) {
                System.out.println(groceryItems[i]);
            }
        }
        System.out.println("---------------------------");
        //  1.2
        for (int i = groceryItems.length - 1; i >= 0; i--) {
            System.out.println(groceryItems[i]);
        }
        System.out.println("-------------------------");
        //  1.3
        for (int i = 0; i < groceryItems.length; i++) {
            if (groceryItems[i].equals("strawberry")) {
                System.out.println(i);
            }
        }

        System.out.println("------------------------");
        //  1.4
        int count = 0;
        for (int i = 0; i < groceryItems.length; i++) {
            if (groceryItems[i].contains("berry")) {
                // System.out.println(i);
                count = count + 1;

            }
        }

        System.out.println(count);

        System.out.println("----------------------");
        //  1.5
        int letterCount = 0;
        for (int i = 0; i < groceryItems.length; i++) {
            letterCount = letterCount + groceryItems[i].length();
        }

        System.out.println(letterCount);
        System.out.println("---------------------------");
        //  1.6
        for (int i = 0; i < groceryItems.length; i++) {
            if (groceryItems[i].length() % 2 == 0) {
                System.out.println(groceryItems[i]);
            }
        }
        System.out.println("-----------------------");
        //  1.7
        for (int i = 0; i <groceryItems.length ; i++) {
            if(groceryItems[i].endsWith("e")){
                System.out.println(groceryItems[i]);
            }
        }
        System.out.println("---------------------------");
        //  1.8
        for (int i = 0; i <groceryItems.length ; i++) {
            System.out.println(groceryItems[i].substring(groceryItems[i].length()-3));
        }
        System.out.println("----------------------------");
        //  1.9
        String allItems = "";
        for (int i = 0; i <groceryItems.length ; i++) {
            if(i==0){
                allItems=allItems+groceryItems[i];
            }
            else{
                allItems=allItems+","+groceryItems[i];
            }

        }
        System.out.println(allItems);
        System.out.println("-------------------------------------------------------");

    }
}

