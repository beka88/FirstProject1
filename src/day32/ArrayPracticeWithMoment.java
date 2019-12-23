package day32;

import org.w3c.dom.ls.LSOutput;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class ArrayPracticeWithMoment {
    public static void main(String[] args) {
        printArrayItems(new int[]{1,6,5,3,12,3});
        int[]scores={2,8,33,5,6};
        printArrayItems(scores);
        int []nums={5,10,15,20,25,30};
        printMaxOfIntArray(nums);
        printMinOfIntArray(nums);
        printsumOfArray(nums);
    }
    public static void printArrayItems(int[]nums){
        System.out.println("Array has items: "+ Arrays.toString(nums));
    }
    public static void printMaxOfIntArray(int[]nums){
        int max=nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(max<nums[i]){
                max=nums[i];
            }
        }
        System.out.println("Max is: "+max);
    }
    public static void printMinOfIntArray(int[]nums){
        int min=nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(min>nums[i]){
                min=nums[i];
            }
        }
        System.out.println("Min is: "+ min);
    }
    public static void printsumOfArray(int[]nums){
        int sum=0;
        for(int each:nums){
            sum=+each;
        }
        System.out.println("Sum is: "+ sum);
    }
}

