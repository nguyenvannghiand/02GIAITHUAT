public class MyBinarySearch {
    private static int binarySearch(int[] a, int key) {
        int n = a.length;
        int iLeft = 0;
        int iRight = n - 1;
        while (iLeft <= iRight) {
            int iMid = (iLeft + iRight) / 2;
            if (a[iMid] == key) {
                return iMid;
            } else if (key > a[iMid]) {
                iLeft = iMid + 1;
            } else {
                iRight = iMid - 1;
            }
        }

        return -1;
    }

    // su dung de quy
    private static int bSearch(int[] a, int key) {
        int n = a.length;
        return bSearch(a, key, 0, n - 1);
    }

    private static int bSearch(int[] a, int key, int left, int right) {
    if (left > right) return -1;
        int mid = (left + right) / 2;
        if (key == a[mid]) {
            return mid;
        } else if (key > a[mid]) {
            return bSearch(a, key, mid + 1, right);
        } else {
            return bSearch(a, key, left, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 4, 9, 12, 19, 25, 31, 46, 50, 57, 72};
        System.out.println(binarySearch(a, 31));
        System.out.println(bSearch(a, 31));

    }
}
