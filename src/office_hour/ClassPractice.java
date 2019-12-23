package office_hour;

public class ClassPractice {
    public static void main(String[] args) {
        String name="bermet";
        int charCount=name.length();
        int lastCharIndex=charCount-1;
        for (int x = 0; x <=lastCharIndex ; x+=2) {
            System.out.println(name.substring(x,x+2));
        }

        }





}

