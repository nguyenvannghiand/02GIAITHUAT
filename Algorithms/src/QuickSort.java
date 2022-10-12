import java.util.Arrays;

public class QuickSort {
	private static void quickSort(int[] a, int left, int right) {
		// Dieu kien dung
		if (left >= right) return;
		// B1. chon khoa
		int key = a[(left + right) / 2]; // 0-7; (0+7) /2 = 3
		// B2. Phan do lai mang theo khoa
		int k = partition(a, left, right, key);
		// B3. Chia doi mang => Lap lai
		quickSort(a, left, k - 1);
		quickSort(a, k, right);
	}

	// return privot value
	private static int partition(int[] a, int left, int right, int key) {
		int iLeft = left;
		int iRight = right;
		while (iLeft <= iRight) {
			// voi iLeft, tim phan tu >= key de doi cho
			while (a[iLeft] < key) iLeft++;
			// voi iRight, tim phan ty <= key de doi cho
			while (a[iRight] > key) iRight--;
			// doi cho 2 phan tu dang dung khong dung vi tri
			if (iLeft <= iRight) {
				int temp = a[iLeft];
				a[iLeft] = a[iRight];
				a[iRight] = temp;
				iLeft++;
				iRight--;
			}

		}
		return iLeft;
	}

	public static void main(String[] args) {
		int[] a = {6, 7, 8, 5, 4, 1, 2, 3};
		quickSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}
}
