public class FindMax {
    private static int currentMax = -1;
    private static void findMax1(int[] arr, int i) {
        if (i < arr.length) {
            if (arr[i] > currentMax) {
                currentMax = arr[i];
            }
            findMax1(arr, i + 1);
        }
    }

    private static int findMax2(int[] arr, int i, int previousMax) {
        if (i < arr.length) {
            int currentMax = Math.max(previousMax, arr[i]);
           return findMax2(arr, i + 1, currentMax);
        }
        return previousMax;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 4, 2, 0};
        System.out.println(findMax2(arr, 0, -1));
    }
}
