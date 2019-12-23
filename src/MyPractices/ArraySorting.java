package MyPractices;

import day22.Array;

import javax.xml.namespace.QName;
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        System.out.println("number sorting-------------");
        int[]numbers={15,10,5,20,25};
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("after sorting: "+ Arrays.toString(numbers));

        System.out.println("new first item value: "+numbers[0]);

        System.out.println("character sorting-----------");

        char[]nameChars={'a','b','!','F','K'};
        System.out.println("before sorting: "+ Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("after sorting: "+Arrays.toString(nameChars));

        System.out.println("String sorting----------------");

        String[]names={"Ken","Bema","Ertai","Aytur"};
        System.out.println("before sorting: "+Arrays.toString(names));
        Arrays.sort(names);
        System.out.println("after sorting: "+Arrays.toString(names));

    }
}
