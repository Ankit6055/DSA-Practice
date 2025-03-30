package Arrays_Part_1;

public class sort_0_1_2 {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 2, 2, 1, 2, 0, 0, 1 };

        printSortArray(arr);
    }

    public static void printSortArray(int arr[]) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, high);
                high--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
    }

    public static void swap(int arr[], int first, int last) {
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }
}
