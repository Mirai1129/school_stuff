package ch04;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        System.out.print("輸入藥費(>0):");
        int drug_money = keyin.nextInt();
        int drugselfpay = (drug_money - 1) / 100 * 20;
        if (drugselfpay > 200)
            drugselfpay = 200;
        System.out.print("藥品部分負擔費用:" + drugselfpay + "元");
        keyin.close();
    }
}
