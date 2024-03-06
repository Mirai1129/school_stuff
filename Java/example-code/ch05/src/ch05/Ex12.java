package ch05;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        int i, password;
        for (i = 1; i <= 3; i++) {
            System.out.print("輸入密碼:");
            password = keyin.nextInt();
            if (password == 201209) {
                System.out.println("密碼正確.");
                break;
            } else
                System.out.println("密碼錯誤.");
        }
        keyin.close();
    }
}
