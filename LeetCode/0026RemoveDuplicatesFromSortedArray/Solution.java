class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length < 2) {
            return nums.length;
        }
        int lastNum = nums[0];//nums[0]
        int index = 0;
        nums[index] = lastNum;//result[0] = nums[0]
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == lastNum) {
            } else {
                count++;
                lastNum = nums[i];
                index = index + 1;
                nums[index] = nums[i];
            }
        }
        return count;
    }
}