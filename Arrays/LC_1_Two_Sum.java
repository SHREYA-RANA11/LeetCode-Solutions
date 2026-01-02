import java.util.*;

class Solution {
    public int[] twoSum(int[] arr, int tar) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        
        for (int i = 0; i < arr.length; i++) {
            int first = arr[i];
            int sec = tar - first;
            
            if (map.containsKey(sec)) {
                ans[0] = i;
                ans[1] = map.get(sec);
                break;
            }
            map.put(first, i);
        }
        return ans;
    }
}