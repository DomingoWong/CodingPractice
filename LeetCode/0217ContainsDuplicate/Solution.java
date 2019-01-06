class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
}
/**
 * HashSet
 * Set<Integer> set = new HashSet<>(nums.length);
 * set.contains(x) / set.add(x)
 * add only one element, no key-value
 */