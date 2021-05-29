package basicsort;

/**
 * @description:利用选择排序将数组元素从小到大进行排列
 * @author: Hankesstill
 * @date: 2021/3/9
 */

/*
选择排序，是一种简单直观的排序算法，
其基本思想是：首先在待排序序列中选出最小值，存放在排序序列起始位置，
然后再从剩余未排序元素中继续寻找最小元素，放到已排序序列末尾。
以此类推，直到所有元素均排序完毕。
 */

public class SelectionSort {

    public static int[] selection_sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }


}
