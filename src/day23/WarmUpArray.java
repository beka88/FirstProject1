package day23;

public class WarmUpArray {
    public static void main(String[] args) {
        int[] item = {5,10,15,20,25,30,40};

        for (int i = item.length-1; i>=0; i--) {
            System.out.println(item[i]);
        }
        int lastItem = item.length-1;
        int lastItemValue=item[lastItem];
        System.out.println(lastItemValue);

    }
}
