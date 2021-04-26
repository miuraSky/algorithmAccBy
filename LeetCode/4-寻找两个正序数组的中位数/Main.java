
public class Main {

    public static void main(String[] args) {
        int[] nums1 = new int[] {1,1,1,1,1,1,1,1,1,1,4,4};
        int[] nums2 = new int[] {1,3,4,4,4,4,4,4,4,4,4};

        double mv = new Solution().findMedianSortedArrays(nums1, nums2);
        System.out.println(mv);
        
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int maxLen = nums1.length + nums2.length;
        int[] arr = new int[maxLen];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length) {
            int iv = nums1[i];
            int jv = nums2[j];

            if (iv == jv) {
                i++;
                j++;

                arr[k++] = iv;
                arr[k++] = jv;

                continue;
            }

            if (iv < jv) {
                i++;
                arr[k++] = iv;

                continue;
            }

            if (iv > jv ) {
                j++;
                arr[k++] = jv;

                continue;
            }

        }

        while (i < nums1.length) {
            arr[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            arr[k++] = nums2[j++];
        }

        if (k < 1) {
            return 0.0d;
        }

        return (double)(arr[k / 2] + arr[(k - 1) / 2]) / 2;
    }
}
