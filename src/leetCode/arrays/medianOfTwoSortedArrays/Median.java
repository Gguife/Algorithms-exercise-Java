package leetCode.arrays.medianOfTwoSortedArrays;

public class Median {

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double result = findMedianSortedArrays(nums1, nums2);
        System.out.println("The median of two arrays is: " + result);
    }


    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0; //nums1 value
        int j = 0; //nums2 value
        int k = 0; //merge value

        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                merged[k] = nums1[i];
                k++; i++;
            }else {
                merged[k] = nums2[j];
                k++; j++;
            }
        }

        while(i < nums1.length) {
            merged[k] = nums1[i];
            k++; i++;
        }

        while(j < nums2.length) {
            merged[k] = nums2[j];
            k++; j++;
        }

        int n = merged.length;
        if(n % 2 != 0) {
            return merged[n / 2];
        }else {
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        }
    }

}