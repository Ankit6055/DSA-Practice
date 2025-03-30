// package Arrays_Part_1;

// // Input: numRows = 5
// // Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

// public class pascalsTriangle {
//     public static void main(String[] args) {
//         // Find the element at nth place. eg -> row = 5, col = 3, ans -> 6
//         int row = 5;
//         int col = 3;
//         int answer = nThPosElement(row - 1, col - 1);
//         System.out.println(answer);

//         // Print all the lists inside the list 
//         int list = 
//     }

//     public static int nThPosElement(int row, int col) {
//         int res = 1;
//         for (int i = 0; i < col; i++) {
//             res = res * (row - i);
//             res = res / (i + 1);
//         }

//         return res;
//     }
// }
