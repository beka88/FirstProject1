package day24;

import java.util.Arrays;

public class ArrayEquality {
    public static void main(String[] args) {
        int [] games1={1,2,3,4,5,6};
        int [] games2={10,15,20,25,30};
        int[]games3={1,2,3,4,5,6};

        boolean isg1g2 = Arrays.equals(games1,games2);
        System.out.println("result "+ isg1g2);
        boolean is1g3 = Arrays.equals(games1,games3);
        System.out.println("result "+is1g3);

        System.out.println("sorting 2 abd 3");
        Arrays.sort(games2);
        Arrays.sort(games3);



    }
}
