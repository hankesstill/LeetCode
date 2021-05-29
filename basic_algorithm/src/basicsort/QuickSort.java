package basicsort;

import java.util.Arrays;

/**
 * @description:使用快速排序将数组元素从小到大排列
 * @author: Hankesstill
 * @date: 2021/3/9
 */
public class QuickSort {

	/*
	快速排序可大概分为三步：

	1) 分解：在待排序数组 A[p...r] 中随机挑选一个基准数 A[q],并根据A[q]
	将数组A划分成两个部分 A[p...q-1] 和 A[p+1...r] 。使得 A[p...q-1]中的每个元素都小于A[q]， A[p+1...r] 中每个元素都大于A[q]；
	2) 解决：调用递归程序，解决分解后的两个数组；
	3) 合并：因为数组都是原址排序的，所以不需要合并操作：数组A[q...r]已经有序。
	 */
	//printArr方法，遍历输出
	static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

	}


	//swap方法，将两个数的值对换
	static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
	}


	//quick_sort快速排序
   /* static void quick_sort(int[] arr, int arrI, int arrJ) {
        //假设min和max，和身边的相比，然后改变位置
        //运用递归，调用自己

        while (arrI <= arrJ) {
            int i = 0;
            int j = arr.length - 1 - i;
            if (arr[arrI] >= arr[i]) {
                swap(arrI, i);
            }
            if (arr[arrJ] <= arr[j]) {
                swap(arrJ, j);
            }

            i++;
            j++;

            quick_sort(arr, arrI, arrJ);

        }


    }
*/


	public static void quickSort(int[] arr, int low, int high) {
		int i, j, temp, t;
		if (low > high) {
			return;
		}
		i = low;
		j = high;
		//temp就是基准位
		temp = arr[low];

		while (i < j) {
			//先看右边，依次往左递减
			while (temp <= arr[j] && i < j) {
				j--;
			}
			//再看左边，依次往右递增
			while (temp >= arr[i] && i < j) {
				i++;
			}
			//如果满足条件则交换
			if (i < j) {
				t = arr[j];
				arr[j] = arr[i];
				arr[i] = t;
			}

		}
		//最后将基准为与i和j相等位置的数字交换
		arr[low] = arr[i];
		arr[i] = temp;
		//递归调用左半数组
		quickSort(arr, low, j - 1);
		//递归调用右半数组
		quickSort(arr, j + 1, high);
	}


	public static void main(String[] args) {
		int[] arr = {10, 7, 2, 4, 7, 62, 3, 4, 2, 1, 8, 9, 19};
		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}


    /*public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 2, 7, 11, 9, 3};
        int arrI = 0;
        int arrJ = arr.length - 1;
        quick_sort(arr,arrI,arrJ);
        printArr(arr);

    }*/


}
