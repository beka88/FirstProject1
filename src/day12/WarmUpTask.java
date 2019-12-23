package day12;

public class WarmUpTask {
    public static void main(String[] args) {
        int month = 2;
        if(month<1 || month>12){
            System.out.println("Invalid month");
        }else if(month>=3 && month<=5){
            System.out.println("Spring");
        }else if(month>=6 && month<=8){
            System.out.println("Summer");
        }else if(month>8 && month<12){
            System.out.println("Fall");
        }else if(month == 12 || month ==1 ||month ==2 ){
            System.out.println("Winter");
        }






    }
}
