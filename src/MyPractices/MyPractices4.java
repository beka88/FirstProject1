package MyPractices;

public class MyPractices4 {
    public static void main(String[] args) {
        String myString="files java i like";

        for (int i = 0; i <=myString.length()-1 ; i++) {

            String iword=myString.substring(i, i+1);
            if(iword.equalsIgnoreCase("i")){
                continue;
            }
            System.out.println(myString.substring(i, i+1));
        }
    }

}
