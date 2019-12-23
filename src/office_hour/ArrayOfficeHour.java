package office_hour;

import java.util.Arrays;

public class ArrayOfficeHour {
    public static void main(String[] args) {
        String[]names=new String[9];
        System.out.println(Arrays.toString(names));
        names[5]="Bema";
        System.out.println(Arrays.toString(names));

        for (int x = 0; x <names.length; x++) {
            System.out.println(names[x]);}

            System.out.println("-----------------------");

            int[]arr ={1,1,2,2,3,4,4,5,5};
            int count=0;
            for (int i = 0; i <names.length ; i++) {
                System.out.println(arr[i]);
            }

            String[]givenames={"Ken","Bermet","Ertai"};
        for (int i = 0; i < givenames.length; i++) {
            if(givenames.equals("Ken"))
            System.out.println(givenames[i]);

        }




        }
    }

