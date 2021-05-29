package basicsort;

/**
 * @description:冒泡排序的基本思想：两两比较相邻记录的关键字，如果反序则交换，直到没有反序的记录为止。
 * @author: Hankesstill
 * @date: 2021/3/9
 */
public class BubbleSort {
    //将一个数组元素从小到大进行排序并打印
    public static int[] bubble_sort(int[] arr) {

        /*
        算法描述（此处以正序为例）

        1) 比较相邻的两个数，如果第一个数比第二个数大，则两数交换。
        2) 对之后的相邻元素进行同样的工作，从开始到最后一对，这样进行一次排序后，数据的最后一位会是最大值 ，第一次循环进行的次数为 arr.length-1。
        3) 之后对所有的元素重复以上的步骤，且以后每次循环的次数为arr.length-1-i （i为循环第几次 ，i 从零开始）；
        4) 重复上述步骤，直到排序完成
         */


        /*
        运用冒泡排序

        i表示循环的次数
        j表示需要循环的元素个数
        当i=0时，即第一次循环时，需要做的是   arr[0]以及arr[arr.length-1]   之间的元素两两互相比较；
        即j=0时，j+1最大到arr.length-1,那么j最大到arr.length-1-1,即j<arr.length-1-0;
        i=1时，j<arr.length-1-1;
        ......
        综上所述，j<arr.length-1-i;
         */


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        return arr;

    }
}
