package com.mearlosy.algo.sort;

import lombok.extern.slf4j.Slf4j;

/**
 * @author mearlosy
 * @since 2020-09-14 15:46
 */

@Slf4j
public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort demo = new SelectionSort();
        int[] data = new int[]{4, 5, 6, 3, 2, 1};
        demo.selectionSort(data, data.length);
        log.info("{}", data);
    }

    // 选择排序，a表示数组，n表示数组大小
    public  void selectionSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 0; i < n - 1; ++i) {
            // 查找最小值
            int minIndex = i;
            for (int j = i + 1; j < n; ++j) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            // 交换
            int tmp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = tmp;
        }
    }


}
