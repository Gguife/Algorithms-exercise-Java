package leetCode.arrays.containerWithMostWater;

public class MostWater {

    public static void main(String[] args) {
        int[] height = {8, 7, 2, 1};
        int result = maxAre(height);
        System.out.println(result);
    }


    public static int maxAre(int[] arr) {
        int max = 0;
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int height = Math.min(arr[left], arr[right]);
            int width = right - left;
            int area = width  * height;

            max = Math.max(max, area);

            if(arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}
