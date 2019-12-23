package day27;

public class ArrayMaxNum {
    public static void main(String[] args) {
        int []nums ={100,10000,9999,8888,1231,2345};
        int max=nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(max<nums[i]){
                max=nums[i];
            }
        }
        System.out.println("first max = " + max);
        int secMax=nums[0];

        for (int i = 0; i < nums.length; i++) {
            if(secMax<nums[i] && nums[i]!=max){
                secMax=nums[i];
            }
        }
        System.out.println("secMax = " + secMax);

    }
}

