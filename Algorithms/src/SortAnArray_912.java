import java.util.Arrays;

public class SortAnArray_912 {

    public static int[] merge(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int[] result = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) {// a1 & a2 != rong
                if (a1[i1] <= a2[i2]) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else { // a2 nho hon
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }

            } else { // a1 rong hoac a2 rong
                if (i1 < a1.length) {// a1 ok
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else { // a2 ok
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }

            }
        }
        return result;
    }
    public static int[] mergeSort(int[] a, int left, int right) {
        // 1.1Truong hop dac biet va dk dung
        if (left > right) return new int[0];
        if (left == right) {
            int[] singleElement = {a[left]};
            return singleElement;
        }
        // 1.2 Truong hop tong quat
        // Chia ra
        System.out.println("Chia: " + left + "-" + right);

        int k = (left + right) / 2;
        int[] a1 = mergeSort(a, left, k);
        int[] a2 = mergeSort(a, k + 1, right);

        // Tron vao: a1 va a2 la cac mang da duoc sap xep
        int[] result = merge(a1, a2);
        System.out.println("Ket qua merge: " + Arrays.toString(result));
        return result;
    }

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
        SortAnArray_912 s = new SortAnArray_912();
        int[] a = {1, 3, 5, 7, 9};
        int[] b = {2, 4, 6, 8, 10};
        int[] c = {1, 5, 2, 3, 8, 7, 6, 4};
        System.out.println(Arrays.toString(s.merge(a, b)));
        System.out.println("-------------------");
        System.out.println(Arrays.toString(s.sortArray(c)));
    }
}
