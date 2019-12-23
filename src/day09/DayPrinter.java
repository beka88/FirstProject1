package day09;

public class DayPrinter {
    public static void main(String[] args) {
        int dayCode = 77;

        String dayName = "";



        if(dayCode == 1){
            dayName = "Monday";

        } else if(dayCode ==2){
            dayName = "Tuesday";
        }else{
        dayName = "Uknown!";
        }
        System.out.println("day is " + dayName);
    }
}
