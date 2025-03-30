class Main {
    public static void main(String[] args) {
        int n = 123;
        int sum = 0;
        
        while (n > 0) {
            int temp = n % 10;
            sum += temp;
            n /= n;
        }
        
        System.out.println(sum);
    }
}