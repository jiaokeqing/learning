package com.jiaokeqing.algorithms.sort;

/**
 * The {@code SelectionSort} class provide a selection sort method
 * <p>
 * Time Complexity
 * <pre>
 *     Worst Case:O(n^2)
 *     Average Case:O(n^2)
 *     Best Case:O(n^2)
 * </pre>
 * <p>
 * Space Complexity
 * <pre>
 *     O(1)
 * </pre>
 *
 * @author jiaokeqing
 * @date 2024-08-07
 * @since 1.0
 */
public class SelectionSort {
    /**
     * selection sort method
     *
     * @param arr An array that needs to be sorted
     */
    public static void selectionSort(final int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}
