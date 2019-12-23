package day06;

public class compoundOperator2 {
    public static void main(String[] args) {

        int studentOnline = 263;
        studentOnline +=5;
        System.out.println("5 people joined the class " +studentOnline);

        studentOnline -=3;
        System.out.println("3 people left the class  " + studentOnline);

        studentOnline *=2;
        System.out.println("the student count doubled "+studentOnline);

        studentOnline /=3;
        System.out.println("the student dropped 1/3 "+studentOnline);


    }
}
