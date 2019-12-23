package day08;

public class IfStatement {
    public static void main(String[] args) {
      int speedLimit = 60;
      int yourCurrentSpeed = 30;
      boolean amISpeeding = (yourCurrentSpeed > speedLimit);

      if (amISpeeding){
          System.out.println("get pulled over by the police");
          System.out.println("given ticket");
          System.out.println("go to court");
          System.out.println("taken away license");}
          else {
              System.out.println("go shopping");
              System.out.println("By Ice Cream");
          }

        System.out.println("The End");

    }
}

