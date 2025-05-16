package hackerrank.ProblemSolved.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertSort {

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 4, 3, 5, 2));
//        insertionSort1(5, arr);
//        insertionSort2(5, arr);
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


    public static void insertionSort2(int n, List<Integer> arr) {
        for(int j = 1; j < n; j++) {
            int key = arr.get(j);
            int i = j - 1;

            while(i >=0 && arr.get(i) > key) {
                arr.set(i + 1, arr.get(i));
                i = i - 1;
            }

            arr.set(i + 1, key);

            for(int num : arr) System.out.print(num + " ");
            System.out.println();
        }
    }

}
