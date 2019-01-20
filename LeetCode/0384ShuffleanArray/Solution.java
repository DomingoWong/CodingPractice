class Solution {

    int[] origin;
    public Solution(int[] nums) {
        this.origin = nums;
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return this.origin;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        //TODO
        int[] rand = new int[origin.length];
        for (int i = 0; i < origin.length; i++){
            int r = (int) (Math.random() * (i+1));
            rand[i] = rand[r];
            rand[r] = origin[i];
        }
        return rand;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */