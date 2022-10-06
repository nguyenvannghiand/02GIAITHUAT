import java.util.Arrays;

public class MergeSortedArray_88 {
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int ai: nums2) {
			insertNumber(ai, nums1, m);
			m++;
		}

	}

	private static void insertNumber(int x, int[] number, int m) {
		boolean findPosition = false;
		for (int k = 0; k < m; k++) {
			if (number[k] > x) {
				findPosition = true;
				for (int i = m -1; i >= k ; i--) {
					number[i + 1] = number[i];
				}
				number[k] = x;
				break;
			}
		}

		if (!findPosition) {
			number[m] = x;
		}
	}

	public static void main(String[] args) {
		int[] n1 = {2, 3, 4, 5, 0, 0, 0};
		int[] n2 = {0, 3, 6};
		merge(n1, 4, n2, 3);
		System.out.println(Arrays.toString(n1));
		System.out.println("DONE");
	}
}
