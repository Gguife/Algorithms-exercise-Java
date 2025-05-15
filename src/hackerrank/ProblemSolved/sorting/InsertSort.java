package hackerrank.ProblemSolved.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InsertSort {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 4, 5, 3));
        insertionSort1(5, arr);
    }

    public static void insertionSort1(int n, List<Integer> arr) {
        int value = arr.get(n - 1);
        int left = n - 2;

        while(left >= 0 && arr.get(left) > value) {
            arr.set(left + 1, arr.get(left));

            for(int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();

            left--;
        }

        arr.set(left + 1, value);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
