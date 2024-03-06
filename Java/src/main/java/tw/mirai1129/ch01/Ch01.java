package tw.mirai1129.ch01;

import java.util.Scanner;

public class Ch01 {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static int dailyCost() {
        int weeklyCost = 0;
        for (int i = 1; i <= 7; ++i) {
            System.out.printf("禮拜 %d 的花費：", i);
            int costOfDay = SCANNER.nextInt();
            weeklyCost += costOfDay;
        }
        SCANNER.close();
        return weeklyCost;
    }

    public static void main(String[] args) {
        System.out.println("歡迎您來到 Java 的世界！");
        int dailyCost = dailyCost();
        System.out.println("你這個禮拜花費 " + dailyCost);
    }
}
