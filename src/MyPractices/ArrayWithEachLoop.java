package MyPractices;

public class ArrayWithEachLoop {
    public static void main(String[] args) {
        double[] fruits = {5, 10, 15, 20, 25};
        for (double eachfruit : fruits) {
            System.out.println("fruits: " + eachfruit);
        }
        System.out.println("----------------------------");
        for (double eachfruit : fruits) {
            //if(anyyfruit<20){
            //  System.out.println("any fruit: "+ anyyfruit);
            if (eachfruit >= 20) {
                continue;
            }
            System.out.println("any fruit: " + eachfruit);
        }
        System.out.println("--------------------------------");
        double max = fruits[0];
        for (double eachfruit : fruits) {
            if (eachfruit > max) {
                max = eachfruit;
            }
        }
        System.out.println("Max eachfruit: " + max);
        System.out.println("---------------------");

        double min = fruits[0];
        for (double eachfruit : fruits) {
            if (eachfruit<max) ;
            {
                max = eachfruit;
            }
        }
        System.out.println("Min each fruit: "+min);
    }

}




