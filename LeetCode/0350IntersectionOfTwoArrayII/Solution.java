import java.util.Hashtable;
import java.util.ArrayList;
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int intersectionMaxLength = nums1.length > nums2.length? nums2.length : nums1.length;
        ArrayList<Integer> intersectionArrayList = new ArrayList<Integer>();
        
        int[] longArray = longerArray(nums1, nums2);
        int[] shortArray = shorterArray(nums1, nums2);
        Hashtable<Integer, Integer> h = toHashtable(shortArray);
        
        for (int i = 0; i<longArray.length; i++) {
            if (h.containsKey(longArray[i])) {
                intersectionArrayList.add(longArray[i]);
                if (h.get(longArray[i]) == 1) {
                    h.remove(longArray[i]);
                } else {
                    h.replace(longArray[i], h.get(longArray[i]) - 1);
                }
            }
        }
        int[] intersection = new int[intersectionArrayList.size()];
        for (int j = 0; j < intersectionArrayList.size(); j++) {
            intersection[j] = intersectionArrayList.get(j);
        }
        return intersection;
        
    }
    
    public Hashtable<Integer, Integer> toHashtable(int[] array) {
        Hashtable<Integer, Integer> result = new Hashtable<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (result.containsKey(array[i])) {
                result.replace(array[i], result.get(array[i]) + 1);
            } else {
                result.put(array[i], 1);    
            }
        }
        return result;
    }
    
    public int[] longerArray(int[] nums1, int[] nums2) {
        return nums1.length > nums2.length? nums1 : nums2;

    }
    
    public int[] shorterArray(int[] nums1, int[] nums2) {
        return nums1.length > nums2.length? nums2 : nums1;
    }
    
    
}