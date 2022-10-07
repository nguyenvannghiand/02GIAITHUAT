public class ThirdMaximumNumber_1_414 {

	public static void printArr(long[] arr) {
		for (long l : arr) {
			System.out.printf("%d, ", l);
		}
		System.out.println();
	}

	public static int thirdMax(int[] a) {
		Integer max = null, max2nd = null, max3rd = null;
		for (Integer value : a) {
			if (value.equals(max)|| value.equals(max2nd)|| value.equals(max3rd)) {
				continue;
			}
			if (max == null || value > max) {
				max3rd = max2nd;
				max2nd = max;
				max = value;
			} else if (max2nd == null || value > max2nd) {
				max3rd = max2nd;
				max2nd = value;
			} else if (max3rd == null || value > max3rd) {
				max3rd = value;
			}

		}

		return max3rd == null ? max : max3rd;
	}

	public static void main(String[] args) {
		int[] a = {2, 2, 3, 1};
		System.out.println(thirdMax(a));

	}
}
