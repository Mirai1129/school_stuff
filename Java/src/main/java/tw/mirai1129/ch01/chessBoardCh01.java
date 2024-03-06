package tw.mirai1129.ch01;


import java.util.Arrays;
import java.util.Scanner;

public class chessBoardCh01 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int rowMoved = 0;
        int colMoved = 0;

        int[][] chessboard = new int[rows][cols];

        // 初始化陣列為零
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                chessboard[i][j] = 0;
            }
        }

        // 請求使用者輸入
        Scanner sc = new Scanner(System.in);
        System.out.println("輸入上下左右");
        String text = sc.next(); // 讓使用者輸入一個字串

        // 根據使用者輸入修改陣列
        if (text.equals("s")) { // 當輸入為 's' 時向下移動一格
            rowMoved += 1;
            chessboard[rowMoved][colMoved] = 1;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(chessboard[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("error");
        }
    }
}
