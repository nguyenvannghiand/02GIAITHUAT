public class Recursion_One {
    private static int recursion(int n) {
        if (n == 0) return 1;
        // cong thuc quy nap
        return n * recursion(n - 1);
    }

    public static void main(String[] args) {;
        System.out.println(recursion(4));
    }
}
