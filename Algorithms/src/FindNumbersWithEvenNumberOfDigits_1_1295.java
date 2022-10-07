public class FindNumbersWithEvenNumberOfDigits_1_1295 {

    private static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (evenDigits(num)) {
                count++;
            }
        }
        return count;
    }

    private static boolean evenDigits(int number) {
        int noofdigits = digits(number);
        return noofdigits % 2 == 0;
    }

    private static int digits(int number) {
        return (int) (Math.log10(number) + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 22, 3, 44, 5, 66, 23456, 45678};
        System.out.println(findNumbers(array));
    }
}
