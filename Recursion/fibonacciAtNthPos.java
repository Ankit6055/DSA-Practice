package Recursion;

public class fibonacciAtNthPos {
    public static void main(String[] args) {
        int fibPosition = 4;

        int result = findFib(fibPosition);
        System.out.println(result);
    }

    public static int findFib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        return findFib(n - 1) + findFib(n - 2);
    }
}
