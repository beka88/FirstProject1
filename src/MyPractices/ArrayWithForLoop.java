package MyPractices;

public class ArrayWithForLoop{
    public static void main(String[] args) {

        int[]count = {5,10,15,20,25,30};
        for (int x = 0; x <=count.length-1; x++) {
            System.out.println("Index is "+ x+" Value is "+count[x]);
        }
        System.out.println("----------------");
        for (int x=count.length-1; x>0; x--){
            System.out.println("Index reversed "+x+" Value reversed "+ count[x]);
        }
        System.out.println("-----------------------");
        int lastCount=count[count.length-1];
        System.out.println("Last count of value " +lastCount);
        System.out.println("-----------------------");
        int middleCount= count[count.length/2];
        System.out.println("Middle count of value "+middleCount);
        System.out.println("------------------------");
        int sum=0;
        for (int x = 0; x <=count.length-1; x++) {
            sum+=count[x];
            System.out.println("sum= "+sum );
        }
        System.out.println("--------------------");
        System.out.println("Avarage of sum "+ sum/count.length);




        }


    }

