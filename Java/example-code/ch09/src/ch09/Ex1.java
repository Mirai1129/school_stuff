package ch09;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        System.out.print("輸入整數a及b(以空白隔開):");
        try {
            int a = keyin.nextInt();
            int b = keyin.nextInt();
            System.out.println(a + "/" + b + "=" + (a / b));
        } catch (InputMismatchException e) {
            System.out.println("發生例外的類別名稱或原因:" + e.toString());
            //若覺得「e.toString ()」的結果，使用者不容易了解，可改用下面敘述
            //「System.out.println("發生例外的原因:資料輸入的型態與需求的型態不符時");」
        } catch (ArithmeticException e) {
            System.out.println("發生例外的原因:" + e.getMessage());
            //若覺得「e.getMessage()」的結果，使用者不容易了解，可改用下面敘述
            //「System.out.println("發生例外的原因:除數為0");」
        } finally {
            System.out.println("finally區塊內的敘述有執行到，且程式沒有異常中止.");
            keyin.close();
        }
    }
}
