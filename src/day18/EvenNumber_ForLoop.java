package day18;

public class EvenNumber_ForLoop {
    public static void main(String[] args) {
        for(int x = 0; x<100; x+=3){
            System.out.print(x+" ");
        }
        for (int i = 0; i <100; i++) {
            if(i%2==0){
                System.out.println(i+" ");
            }


        }
    }
}
