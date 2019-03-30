package net.mahtabalam.sort;

public class SelectionSort {
	
	public static int[] selectionSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			int minimium = array[i];
			int min_loc = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] < minimium) {
					min_loc = j;
					minimium = array[j];
				}
			}

			int temp = array[i];
			array[i] = array[min_loc];
			array[min_loc] = temp;
		}
		return array;
	}

	public static void main(String[] args) {
		int array[] = { 23, 54, 1, 7, 3, 2, 10 };
		for (int item : selectionSort(array)) {
			System.out.print(item + " ");
		}

	}

}
