public class FindNumbersWithEvenNumberOfDigits_1295 {
    public static int findNumbers(int[] nums) {
        int resultCount = 0;
        for (int item: nums) {
            // kiem tra so chu so cua item
            // Neu so chu so la chan => tang bien dem len 1
            int soLuongChuSo = tinhSoChuSo(item);
            if (soLuongChuSo % 2 == 0) {
                resultCount++;
            }
        }
        return resultCount;
    }

    private static int tinhSoChuSo(int item) {
        int count = 0;
        int result = item;
        while (result != 0) {
            result = item / 10;
            item = result;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] number = {1, 22, 3, 44, 5, 66};
        System.out.println(findNumbers(number));
    }
}
