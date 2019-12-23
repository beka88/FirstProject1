package day30;
import java.util.Arrays;
public class Tasks {
    public static void main(String[] args) {
        //1st option:
        String[] names = {"Ahmed", "John", "Eric", "Ahmed", "Hassan"};
        String tempName = "";
        for (String name : names) {
            if (!name.contains("Ahmed")) {
                tempName += name + " ";
            }
        }
        String[] newArr = tempName.split(" ");
        System.out.println(Arrays.toString(newArr));
        //2nd option:
        System.out.println("---------------------");
        String[] names1 = {"Ahmed", "John", "Eric", "Ahmed", "Hassan"};
        String nameRemoved = "";
        for (String name2 : names1) {
            if (name2.equals("Ahmed")) {
                continue;
            } else {
                nameRemoved += name2 + " ";
            }
        }
        String[] newName = nameRemoved.split(" ");
        System.out.println(Arrays.toString(newName));
        // 1st 2nd and res character
        System.out.println("---------------------------");
        String word = "Announcement";
        String[] f123char = word.split("", 3);
        System.out.println(Arrays.toString(f123char));
    }
}
