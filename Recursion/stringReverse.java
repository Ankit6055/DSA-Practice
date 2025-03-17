package Recursion;

class stringReverse {
    public static void main(String[] args) {
        String str = "abc";
        int idx = 0;

        strReverse(str, idx);
    }

    public static void strReverse(String str, int idx) {
        if (idx >= str.length()) {
            return;
        }

        strReverse(str, idx + 1);
        System.out.println(str.charAt(idx));
    }
}