public class _27a_RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        if(n == 0) return 0;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, 2, 3};
        System.out.println(removeElement(a, 2));
        System.out.println("DONE");
    }
}