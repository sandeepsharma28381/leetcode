import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        List<Integer> arr = new ArrayList<>();

        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if (nums1[i] == nums2[j]){
                    arr.add(nums1[i]);
                }
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0; i < arr.size(); i++){
            set.add(arr.get(i));
        }
        int[] result = new int[set.size()];
        int k = 0;
        for(int num:set){
            result[k] = num;
            k++;
        }
        return result;
    }
}
