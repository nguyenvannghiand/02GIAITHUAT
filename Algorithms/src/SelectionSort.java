import java.util.Arrays;

public class SelectionSort {
	private static void selectionSort2(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				// Tim min [i,n]
				if (a[j] < a[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
		}
	}

	private static void selectionSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a = {5, 3, 2, 7, 8, 1, 2};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}
}
