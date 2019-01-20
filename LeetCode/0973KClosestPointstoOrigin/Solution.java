import java.util.HashMap;
import java.util.*;
class Solution {
    public int[][] kClosest(int[][] points, int K) {
        //key: index, value: pow
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < points.length; i++) {
            int pow = 0;
            for (int j = 0; j < 2; j++) {
                pow += points[i][j] * points[i][j];
            }
            map.put((Integer)i, (Integer)pow);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>();
        list.addAll(map.entrySet());
        Solution.ValueComparator vc = new ValueComparator();
        Collections.sort(list, vc);
        
        int[][] result = new int[K][2];
        
        int k = 0;
        for (Map.Entry<Integer, Integer> entry : list) {
            System.out.println(entry.getKey());
            if (k < K) {
                for (int q = 0; q < 2; q++) {
                    result[k][q] = points[entry.getKey()][q];
                }
                k++;
            }
        }
        return result;
    }
    
    private static class ValueComparator implements Comparator<Map.Entry<Integer,Integer>> {
        public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
			return (o1.getValue() - o2.getValue());
		}
    }

}