package office_hour;

public class MyPractices2 {
    public static void main(String[] args) {
        String password = "Abter88net$";
        boolean minContains8Max16 =password.length()>=8&&password.length()<=16;
        boolean mustConatin_$= password.contains("_")||password.contains("$");
        boolean mustNotSpace =!password.contains(" ");
        boolean mustStartAb = password.startsWith("Ab");
        if(minContains8Max16&&mustConatin_$&&mustNotSpace&&mustStartAb){
            System.out.println("Hooray");
        }else{
            System.out.println("not valid password");
        }



    }
}








