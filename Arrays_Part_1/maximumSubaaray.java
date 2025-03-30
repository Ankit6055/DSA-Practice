package Arrays_Part_1;

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.

public class maximumSubaaray {
    public static void main(String[] args) {
        int num[] = {-2,1,-3,4,-1,2,1,-5,4};
        int result = maximumSubArray(num);
        System.out.println(result);

        printMaxSubArray(num);
    }

    // public static int maximumSubArray(int num[]) {
    //     int maxi = Integer.MIN_VALUE;
    //     for (int i = 0; i < num.length; i++) {
    //         int sum = 0;
    //         for (int j = i; j < num.length; j++) {
    //             sum += num[j];
    //             maxi = Math.max(maxi, sum);
    //         }            
    //     }
    //     return maxi;
    // }

    public static int maximumSubArray(int num[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
            maxSum = Math.max(maxSum, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }

    public static void printMaxSubArray(int num[]) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int ansStart = -1;
        int ansEnd = -1;

        for (int i = 0; i < num.length; i++) {
            if (sum == 0) ansStart = i;
            sum += num[i];

            if (sum > maxSum) {
                maxSum = sum;
                ansEnd = i;
            }

            if (sum < 0) sum = 0;
        }

        System.out.println(ansStart);
        System.out.println(ansEnd);
    }
}
