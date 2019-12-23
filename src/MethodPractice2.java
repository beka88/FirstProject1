public class MethodPractice2 {
    public static void main(String[] args) {
        compareNum(10, 20);
        strToRepeater("Cybertek", 15);
        skipCountBy3From0to50();
        countDownByEvenNumberFrom50to0();
        print1toX(5);

    }

    public static void compareNum(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(" num1 is more than num2");
        } else if (num2 > num1) {
            System.out.println("num2 is more than num1");
        } else {
            System.out.println("they are equal");
        }
    }

    public static void strToRepeater(String name, int num) {
        for (int i = 1; i <= num; i++) {
            System.out.println(name);
        }
    }
    public static void  skipCountBy3From0to50(){
        for (int i = 3; i <50; i+=3) {
            System.out.println(i+" ");
        }
        System.out.println();
    }
    public static void  countDownByEvenNumberFrom50to0(){
        for (int i = 50; i >=0 ; i--) {
            if(i%2==0){
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }
    public static void print1toX(int x){
        for (int i = 1; i <=x; i++) {
            System.out.println(i);
        }
        System.out.println();
    }
}

