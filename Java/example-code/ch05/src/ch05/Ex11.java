package ch05;

public class Ex11 {
    public static void main(String[] args) {
        int i, j, k = 65;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= i; j++) {
                System.out.printf("%c", k);
                k++;
            }
            System.out.println();
        }
    }
}
