import java.util.Hashtable;

class Solution {
    public int singleNumber(int[] nums) {
        Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (h.containsKey(nums[i])) {
                h.replace(nums[i], h.get(nums[i]) + 1);
            } else {
                h.put(nums[i], 1);
            }
        }

        for (int key : h.keySet()) {
            if(h.get(key).equals(1)) {
                return key;
            }
        }
        return -1;
    }
}