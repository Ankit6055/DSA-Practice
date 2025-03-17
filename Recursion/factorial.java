package Recursion;

public class factorial {
    public static void main(String[] args) {
        int num = 8;

        int result = factorialOfNum(num, 1);
        System.out.println(result);
    }

    // public static int factorialOfNum(int num) {
    //     if (num <= 1) {
    //         return 1;
    //     }

    //     return num * factorialOfNum(num - 1);
    // }


    // Tail Recursion
    public static int factorialOfNum(int num, int pos) {
        if (num <= 1) {
            return pos;
        }
        return factorialOfNum(num - 1, num * pos);
    }
}
