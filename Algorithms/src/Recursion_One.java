public class Recursion_One {
    private static int recursion(int n) {
        if (n == 0) return 1;
        // cong thuc quy nap
        return n * recursion(n - 1);
    }

    // tim so fibonaci thu n
    private static int fibo(int n) {
        // 1. bai toan co so
        if (n<=2) return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    // toi uu dung de quy co nho
    static int[] f = new int[1000];

    private static int fibonaci2(int n) {
        if (f[n] != 0) {
            return f[n];
        }
        System.out.println("Can tinh f[" + n + "]");
        if (n <= 2) {
            f[1] = 1;
            f[2] = 2;
            return 1;
        }

        f[n] = fibonaci2(n - 1) + fibonaci2(n - 2);
        return f[n];
    }

    private static int fibonaci3(int n) {
        int[] fibonaciResult = new int[11];
        //1. bai toan co so
        fibonaciResult[1] = 1;
        fibonaciResult[2] = 1;
        for (int i = 3; i <=10 ; i++) {
            // 2.Cong thuc quy nap
            fibonaciResult[i] = fibonaciResult[i - 1] + fibonaciResult[i - 2];
        }
        return fibonaciResult[n];
    }

    private static void printElement(int[] arr, int index) {
        // 1. bai toan co so
        if (index < 0 || index >= arr.length) return;
        // 2. cong thuc quy nap: in phan tu index, print index +1
        System.out.println(arr[index]);
        printElement(arr, index + 1);
    }

    public static void main(String[] args) {;
        System.out.println(fibonaci3(7));

    }
}
