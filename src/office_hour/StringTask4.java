package office_hour;

public class StringTask4 {
    public static void main(String[] args) {
        String name = "Kenzhebek";
        int lastChar = name.length();
        int middleChar = (lastChar-1)/2;

        System.out.println(name.charAt(0) + "" + name.charAt(middleChar) + "" + name.charAt(lastChar-1));
    }
    }


/*Task 4:
Ask user to enter a word with at least 3 characters
print the first character
print the last character
print the middle character
for example : Uighur
first character : U
last character  : r
middle character: g
(if the length is even number get the one on the left)
*/