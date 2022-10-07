import java.util.Arrays;

public class InsertionSort {
	private static void insertionSort(int[] a) {
		int n = a.length;
		for (int i = 0; i < n; i++) {
			// Chen a[i] vao day 0 -> i-1
			int ai = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > ai) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = ai;
		}
	}

	public static void main(String[] args) {
		int[] a = {5, 3, 2, 7, 8, 1, 2};
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}
}
