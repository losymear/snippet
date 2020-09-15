package com.mearlosy.algo.sort;

import lombok.extern.slf4j.Slf4j;

/**
 * @author mearlosy
 * @since 2020-09-14 15:42
 */
@Slf4j
public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort demo = new InsertionSort();
        int[] data = new int[]{4, 5, 6, 3, 2, 1};
        demo.insertionSort(data, data.length);
        log.info("{}", data);

    }

    // 插入排序，a表示数组，n表示数组大小
    public void insertionSort(int[] a, int n) {
        if (n <= 1) return;

        for (int i = 1; i < n; ++i) {
            int value = a[i];
            int j = i - 1;
            // 查找插入的位置
            for (; j >= 0; --j) {
                if (a[j] > value) {
                    a[j+1] = a[j];  // 数据移动
                } else {
                    break;
                }
            }
            a[j+1] = value; // 插入数据
        }
    }

}
