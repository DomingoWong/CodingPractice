package Chap1;

public class Solution {

        public static int removeDuplicates(int[] nums) {
            if(nums.length < 2) {
                return nums.length;
            }
            int[] result = new int[nums.length];
            int lastNum = nums[0];//nums[0]
            int index = 0;
            result[index] = lastNum;//result[0] = nums[0]
            int count = 1;
            for(int i = 1; i < nums.length; i++) {
                if(nums[i] == lastNum) {
                } else {
                    count++;
                    lastNum = nums[i];
                    index = index + 1;
                    result[index] = nums[i];
                }
            }
            nums = result;//array could not use '='
            for(int i = 0; i<result.length; i++) {

                System.out.println(result[i]);
            }
            return count;
        }
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

}
