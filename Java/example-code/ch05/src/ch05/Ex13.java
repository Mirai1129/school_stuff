package ch05;

public class Ex13 {
    public static void main(String[] args) {
        int i, sum = 0;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 1)
                continue;

            sum = sum + i;
        }
        System.out.printf("1到100之間的偶數和=%d", sum);
    }
}
