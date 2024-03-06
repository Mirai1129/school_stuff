package ch05;

public class Ex14 {
    public static void main(String[] args) {
        int i = 1, j = 1;
        outerfor:
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 4; j++)
                if ((i + j) == 7)
                    break outerfor;
        }
        System.out.print("四列四行的資料中,");
        if (i == 5)
            System.out.println("數字7沒有出現過.");
        else
            System.out.println("數字7第一次出現在第" + i + "列第" + j + "行.");
    }
}
