package algorithmsBook;

import java.util.Arrays;

public class MergerSort {

    public static void main(String[] args) {
        int[] arr = {31, 241, 9, 26, 421, 18};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    // The recursive merge sort method
    public static void mergeSort(int[] arr, int p, int r) {
        if(p < r) {
            int q = (p + r) / 2; // Calc the medium point
            mergeSort(arr, p, q); // Sorted the first one
            mergeSort(arr, q + 1, r); // Sorted the second one
            merge(arr, p, q, r); // Merge the two subArrays for principal array
        }
    }

    // For merge the two subArrays
    public static void merge(int[] arr, int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;

        int[] L = new int[n1 + 1];
        int[] R = new int[n2 + 1];

        // Copy elements for L
        for(int i = 0; i < n1; i++) {
            L[i] = arr[p + i];
        }
        // Copy elements for R
        for(int j = 0; j < n2; j++) {
            R[j] = arr[q + 1 + j];
        }

        // Final sentinels
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;

        int i = 0, j = 0;

        // merge loop
        for(int k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
        }
    }

}


/* View Division
*
* mergeSort(arr, 0, 5)
 ├─ mergeSort(arr, 0, 2)
 │   ├─ mergeSort(arr, 0, 1)
 │   │   ├─ mergeSort(arr, 0, 0) → [31]
 │   │   ├─ mergeSort(arr, 1, 1) → [241]
 │   │   └─ merge(...) → [31, 241]
 │   ├─ mergeSort(arr, 2, 2) → [9]
 │   └─ merge(...) → [9, 31, 241]
 ├─ mergeSort(arr, 3, 5)
 │   ├─ mergeSort(arr, 3, 4)
 │   │   ├─ mergeSort(arr, 3, 3) → [26]
 │   │   ├─ mergeSort(arr, 4, 4) → [421]
 │   │   └─ merge(...) → [26, 421]
 │   ├─ mergeSort(arr, 5, 5) → [18]
 │   └─ merge(...) → [18, 26, 421]
 └─ merge(...) final → [9, 18, 26, 31, 241, 421]
*
* */