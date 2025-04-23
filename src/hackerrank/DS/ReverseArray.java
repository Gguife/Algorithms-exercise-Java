package hackerrank.DS;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Integer[] arr2 = {1, 2, 3, 4, 5};

        manualReverse(arr);
        tempReverse(arr, arr.length);
        collectionsReverse(arr2);
    }

    //Manual
    public static void manualReverse(int[] arr) {

        for(int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }

        System.out.println("Manual reverse:");
        System.out.println(Arrays.toString(arr));
    }

    //Temp array
    public static void tempReverse(int[] a, int n){
        int[] b = new int[n];
        int j = n - 1;

        for(int i = 0; i < n; i++) {
            b[j] = a[i];
            j--;
        }

        System.out.println("Temp array reverse");
        for(int k = 0; k < n; k++) {
            System.out.println(b[k]);
        }
    }


    //collections.reverse
    public static void collectionsReverse(Integer[] arr) {
        Collections.reverse(Arrays.asList(arr));
        System.out.println("Using collections reverse:");
        System.out.println(Arrays.asList(arr));
    }
}
