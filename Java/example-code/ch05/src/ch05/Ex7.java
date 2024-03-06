package ch05;

public class Ex7 {

    public static void main(String[] args) {
        int divisor = 80, dividend = 380, remainder, number = 0;
        do {
            number = number + dividend / divisor;
            System.out.printf("邊長為 %d 公分的正方形", divisor);
            System.out.printf(" %d 個\n", dividend / divisor);
            remainder = dividend % divisor;
            dividend = divisor;
            divisor = remainder;
        }
        while (remainder != 0);
        System.out.printf("合計最少需要 %d 個大小不同的正方形", number);
    }
}
