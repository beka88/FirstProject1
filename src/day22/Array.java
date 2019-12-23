package day22;

public class Array {
    public static void main(String[] args) {

        int [] scores = new int[4];

        scores[0]=25;
        scores[1]=30;
        scores[2]=35;
        scores[3]=38;

        //System.out.println(scores[0]);
       // System.out.println(scores[1]);
       // System.out.println(scores[2]);
        //System.out.println(scores[3]);

        //scores[3]=45;
       // System.out.println(scores[3]);
        
        int itemCount = scores.length;
        int lastItemIndex=itemCount-1;

      // for (int x = 0;  x< itemCount; x++) {
       //    System.out.println(scores[x]);
      //  }

        for (int x = lastItemIndex; x>=0 ; x--) {
            System.out.println(scores[x]);

        }

    }
}
