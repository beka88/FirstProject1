package day21;

public class SumOfOdd {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 =0;
        for (int i = 10; i <=100 ; i++) {
            if(i%2==0) {
                sum=sum+i;
            }else{
                sum1=sum1+i;
            }

        }
        System.out.println(sum);
        System.out.println(sum1);
    }
}
