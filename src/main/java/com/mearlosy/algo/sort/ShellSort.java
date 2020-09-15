package com.mearlosy.algo.sort;

import java.util.Arrays;

/**
 * @author mearlosy
 * @link https://mp.weixin.qq.com/s/b9-dkpAhWJYshuSs5cwnOw
 * @since 2020-09-14 16:00
 */
public class ShellSort {
    public static void sort(int[] array) {
        //希尔排序的增量
        int d = array.length;
        while (d > 1) {
            // 使用希尔增量的方式，即每次折半
            d = d / 2;
            // note: 当d=1时，就是标准的插入排序。 这样来理解这段代码就清晰些了
            for (int x = 0; x < d; x++) {
                for (int i = x + d; i < array.length; i = i + d) {
                    int temp = array[i];
                    int j;
                    for (j = i - d; j >= 0 && array[j] > temp; j = j - d) {
                        // 1,3,8,13,7
                        array[j + d] = array[j];
                    }
                    array[j + d] = temp;
                }
            }
        }
    }

    public static void main
            (String[] args) {
        int[] array = {5, 3, 9, 12, 6, 1, 7, 2, 4, 11, 8, 10};
        sort(array);
        System.out.println(Arrays.toString(array));
    }
}
