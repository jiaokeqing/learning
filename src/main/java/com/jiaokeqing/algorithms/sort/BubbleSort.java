package com.jiaokeqing.algorithms.sort;

/**
 * The {@code BubbleSort} class provides a bubble sort method
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
public class BubbleSort {
    /**
     * bubble sort method
     *
     * @param array An array that needs to be sorted
     */
    public static void bubbleSort(final int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
