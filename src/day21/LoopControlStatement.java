package day21;

public class LoopControlStatement {
    public static void main(String[] args) {
        int sum =0;
        for (int x = 1; x <= 10; x++) {
            System.out.println("current sum is "+sum);
            System.out.println("if i add "+x+" dollar ,it would be "+(sum+x));
            if(sum+x>12){
                break;
            }
            sum=sum+x;


        }
    }
}
