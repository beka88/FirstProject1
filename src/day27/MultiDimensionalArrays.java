package day27;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        int [][]ages={{10},{12,13,14,16,17},{19,20,21,22,23}};
        for (int i = 0; i <ages.length ; i++) {
            for (int j = 0; j <ages[i].length ; j++) {
                if (ages[i][j]%2!=0) {
                     continue;
                }
                System.out.println(ages[i][j]);
            }
        }

         int [][]numbers={{12,11,10,19},{19,20,15}};
        int max=numbers[0][0];
        for (int i = 0; i <numbers.length ; i++) {
            for (int j = 0; j <numbers[i].length ; j++) {
                if(max<numbers[i][j]){
                    max=numbers[i][j];
                }
            }
        }
        System.out.println("max = " + max);

        int max2=numbers[0][0];
        for (int[] each1DArray:numbers) {
            for (int eachInt:each1DArray){
                if(max2<eachInt){
                    max2=eachInt;
                }
            }

        }
    }
}
