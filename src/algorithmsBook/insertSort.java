package algorithmsBook;

import java.util.ArrayList;
import java.util.List;

public class insertSort {


    public static void main(String[] args) {
        int[] arr = {31, 41, 59, 26, 41, 58};
        List<Integer> creSort = new ArrayList<>();
        List<Integer> decSort = new ArrayList<>();

        for(int item: sort(arr)) {
            creSort.add(item);
        }

        for(int item: sortDec(arr)) {
            decSort.add(item);
        }

        System.out.println("Crescent insert sort: " + creSort);
        System.out.println("Decrescent insert sort: " + decSort);
    }


    public static int[] sort(int[] arr) {
        for(int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;

            while(i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }

            arr[i + 1] = key;
        }

        return arr;
    }

    public static int[] sortDec(int[] arr) {
        for(int j = 1; j < arr.length; j++) {
            int key = arr[j];
            int i = j - 1;

            while(i >= 0 && arr[i] < key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }

            arr[i + 1] = key;
        }

        return arr;
    }


}
