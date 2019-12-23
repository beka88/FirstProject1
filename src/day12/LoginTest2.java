package day12;

public class LoginTest2 {
    public static void main(String[] args) {

        String myName = "Bermet";

        boolean myNameCorrect = myName.equals("Bermet");
        System.out.println(myNameCorrect);
        boolean myNameCorrect1 = myName.equalsIgnoreCase("BErmet");
        System.out.println(myNameCorrect1);

        System.out.println(myName.equalsIgnoreCase("berMet"));

        String mySon = "Ertai";
        boolean isMySonCorrectName = mySon.equals("Ertai");
        System.out.println(isMySonCorrectName);
        System.out.println(mySon.equals("Ertai"));
        System.out.println(mySon.equalsIgnoreCase("ertai"));

        String season = "Enter ur season";
        if(season.equals("Spring")){
            System.out.println("Hiking");
        }











    }






}




