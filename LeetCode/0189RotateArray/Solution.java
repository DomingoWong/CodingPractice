class Solution {
    public void rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        for(int i = 0; i<nums.length; i++) {
            result[(i+k)%nums.length] = nums[i];
        }
        for(int j = 0; j<nums.length; j++) {
            nums[j] = result[j];
        }
    }
}
//Time complexity: O(n)
//Space complexity: O(n)