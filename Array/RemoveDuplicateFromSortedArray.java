package com.Array;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] nums={0,0,1,1,1,2,2,3,3,4};
        int[] ans= new int[nums.length];
        if(nums.length==0){
            System.out.println(nums.length);
        }else {
            int j = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] != nums[i + 1]) {
                    ans[j++] = nums[i];
                }
            }
            ans[j++] = nums[nums.length - 1];
            for (int i = 0; i < j; i++) {
                nums[i] = ans[i];
                System.out.print(nums[i]+" ");
            }

        }
    }
}
