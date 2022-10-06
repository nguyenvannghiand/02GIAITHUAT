import java.util.Arrays;

public class MergeSortedArray_88a {
    public static void merge(int[] n1, int m, int[] n2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while (k >= 0) {
            if (j < 0) {
                n1[k] = n1[i];
                i--;
            } else if (i < 0) {
                n1[k] = n2[j];
                j--;
            } else if (n1[i] > n2[j]) {
                n1[k] = n1[i];
                i--;
            } else {
                n1[k] = n2[j];
                j--;
            }
            k--;
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
