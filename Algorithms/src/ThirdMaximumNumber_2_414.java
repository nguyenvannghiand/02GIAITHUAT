public class ThirdMaximumNumber_2_414 {

	public static void printArr(long[] arr) {
		for (long l : arr) {
			System.out.printf("%d, ", l);
		}
		System.out.println();
	}

	public static int thirdMax(int[] a) {
		long max = Long.MIN_VALUE, max2nd = Long.MIN_VALUE, max3rd = Long.MIN_VALUE;
		for (Integer value : a) {
			if (value == max || value == max2nd || value == max3rd) {
				continue;
			}
			if (value > max) {
				max3rd = max2nd;
				max2nd = max;
				max = value;
			} else if (value > max2nd) {
				max3rd = max2nd;
				max2nd = value;
			} else if (value > max3rd) {
				max3rd = value;
			}

		}

		return (int) (max3rd == Long.MIN_VALUE ? max : max3rd);
	}

	public static void main(String[] args) {
		int[] a = {2, 2, 3, 1};
		System.out.println(thirdMax(a));

	}
}
