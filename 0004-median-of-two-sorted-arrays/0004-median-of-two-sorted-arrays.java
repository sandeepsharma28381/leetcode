import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] arr = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, arr, 0, nums1.length);
        System.arraycopy(nums2, 0, arr, nums1.length, nums2.length);

        Arrays.sort(arr);
        int n = arr.length;

        if(n % 2 == 1){
            return arr[n / 2];
        }
        else{
            float mid1 = arr[n / 2 - 1];
            float mid2 = arr[n / 2];
            return (mid1+mid2)/2.0f;
        }
    }
}