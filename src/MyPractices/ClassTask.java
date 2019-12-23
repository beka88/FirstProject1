package MyPractices;

import day22.Array;

import java.util.Arrays;

public class ClassTask {
    public static void main(String[] args) {
        String[] groceryItems = {"apple", "banana", "grape", "strawberry", "blueberry", "kiwi"};
        float[]prices= { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  };

        //System.out.println(groceryItems[0]);
        //System.out.println(groceryItems[(groceryItems.length-1)/2]);

      //  System.out.println("hello".charAt(("hello".length()-1)/2));

        //for(int i=0; i<groceryItems.length; i++)
       // {
            //System.out.println(groceryItems[i].charAt(groceryItems[i].length()/2));
      //  }

        //items ends with 'e'

        //for(int i=0; i<groceryItems.length; i++)
       // {
         //   if (groceryItems[i].endsWith("e")) {
          //      System.out.println(groceryItems[i]);
          //  }

      //  }

        //even character count items

       // for(int i=0; i<groceryItems.length; i++) {
       //     if (groceryItems[i].length() % 2 == 0) {
         //       System.out.println(groceryItems[i]);
         //   }
       // }

        //----Letter count----
        /*

         */
        // ----Contains berry-----

        int c = 0;
        for(int i=0; i<groceryItems.length; i++)
        {
            if(groceryItems[i].contains("berry")) {
                System.out.println(i);
                c = c + 1;
            }
        }
        System.out.println(c);

    }
}
