public class Q4_RecursionProblems {

    public static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int sumArray(int[] arr, int idx) {
        if (idx == arr.length) return 0;
        return arr[idx] + sumArray(arr, idx + 1);
    }

    public static boolean isSorted(int[] arr, int idx) {
        if (arr.length <= 1) return true;
        if (idx >= arr.length - 1) return true;
        if (arr[idx] > arr[idx + 1]) return false;
        return isSorted(arr, idx + 1);
    }

    public static int minArray(int[] arr, int idx) {
        if (idx == arr.length - 1) return arr[idx];
        int minRest = minArray(arr, idx + 1);
        return (arr[idx] < minRest) ? arr[idx] : minRest;
    }

    public static int maxArray(int[] arr, int idx) {
        if (idx == arr.length - 1) return arr[idx];
        int maxRest = maxArray(arr, idx + 1);
        return (arr[idx] > maxRest) ? arr[idx] : maxRest;
    }
}
