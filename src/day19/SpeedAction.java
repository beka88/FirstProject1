package day19;

public class SpeedAction {
    public static void main(String[] args) {
        int speedStart=10;
        int speedEnd = 27;
        for(int i =speedStart; i<=speedEnd; i++){
            System.out.println(i+" ");
        }
        for(char iChar='A'; iChar<='Z'; iChar ++){
            System.out.print(iChar+" ");
        }
        System.out.println();
        for(char kChar ='Z'; kChar>='A'; kChar--){
            System.out.print(kChar+" ");
        }
    }

}
