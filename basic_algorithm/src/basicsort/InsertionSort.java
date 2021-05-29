package basicsort;

public class InsertionSort {
	public static void main(String[] args) {
		int[] arr = {2, 5, 1, 6, 7, 32, 7};
		insertionSort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
	}


	public static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				// 将当前值与其前面的相邻值比较，如果 当前值 < 前面的值，那么交换值，索引--; 继续比较，直到索引为 1 的值与索引为 0 的值比较结束
				if (arr[j] < arr[j - 1]) {
					int tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}


}
