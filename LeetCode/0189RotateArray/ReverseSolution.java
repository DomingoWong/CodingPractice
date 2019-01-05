class ReverseSolution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        //insure k is less equal than length, or line 13 will cause runtime error;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }
    
    public void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];//runtime error because end = k-1 where k is larger than array length;
            array[end] = temp;
            start++; end--;
        }
    }
}