public class ThirdMaximumNumber_414 {

	public static void printArr(long[] arr) {
		for (long l : arr) {
			System.out.printf("%d, ", l);
		}
		System.out.println();
	}

	public static int thirdMax(int[] a) {
		long[] maxArr = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
		for (int j : a) {
			insert(maxArr, j);
		}
		if (maxArr[2] == Long.MIN_VALUE) {
			return (int) maxArr[0];
		}

		return (int) maxArr[2];
	}

	private static void insert(long[] maxArr, int value) {
		int i = 0;
		while (i < maxArr.length) {
			if (value == maxArr[i]) {
				// Ko duoc trung gia tri
				return;
			} else if (value > maxArr[i]) {
				// chen value vao maxArr[i]
				break;
			} else { // value < maxArr
				i++;
			}
		}
		// MIM MIN MIN | 2
		if (i < maxArr.length) {
			for (int j = maxArr.length - 2; j >= i; j--) {
				maxArr[j + 1] = maxArr[j];
			}
			maxArr[i] = value;
			printArr(maxArr);
		}
	}

	public static void main(String[] args) {
		int[] a = {2, 2, 3, 1};
		System.out.println(thirdMax(a));

	}
}
