package Arrays;

import java.util.*;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(new String());
        int arr[][] = new int[3][3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        arr[1][2] = 6;
        arr[2][0] = 7;
        arr[2][1] = 8;
        arr[2][2] = 9;

        // Print all Elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Print all right diagonal Elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }

        System.out.println();

        // Print all left diagonal Elements
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == arr[i][arr[i].length - 1 - i]) {
                    System.out.println(arr[i][j] + " ");
                }
            }
        }

        System.out.println();

        // Print the middle Elements
        int mid = 3 / 2; // 3 -> column
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == arr[i][mid]) {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }

        System.out.println();

        // Print sum of all the Elements
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("The Sum of all Elements of matrix is: " + sum);

        // Print sum of all diagonal Elements (right and left included)
        int sumOfDiagonals = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sumOfDiagonals += arr[i][j];
                }

                if (arr[i][j] == arr[i][arr[i].length - 1 - i] && i != j) {
                    sumOfDiagonals += arr[i][j];
                }
            }
        }
        System.out.println("The sum of diagonal Elements is: " + sumOfDiagonals);

        // Print sum of diagonals and middle Elements
        int sumOfDiagonalsAndMiddleElements = 0;
        int midOfMatrix = 3/2; // 3 -> Column
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) sumOfDiagonalsAndMiddleElements += arr[i][j];

                if (arr[i][j] == arr[i][arr[i].length - 1 - i] && i != j) sumOfDiagonalsAndMiddleElements += arr[i][j];

                if (arr[i][j] == arr[i][midOfMatrix] && i != j) sumOfDiagonalsAndMiddleElements += arr[i][j];
            }
        }
        System.out.println("The Sum of its diagonal and middle elements is: " + sumOfDiagonalsAndMiddleElements);
    }
}

// 0 2
// 1 1
// 2 0

/*
 * 1 2 3
 * 4 5 6
 * 7 8 9
 */