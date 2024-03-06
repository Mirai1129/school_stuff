package ch05;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        int n;
        int one_num = 0, zero_num = 0;
        System.out.print("輸入一正整數:");
        n = keyin.nextInt();
        System.out.printf("%d轉成二進位整數後,", n);
        while (n != 0) {
            //n & 1 : 表示n與1做 mask遮罩運算(即,位元且(&)運算)
            //若二進位表示法的個位數的值與1相同，則結果為1,否則為0
            if ((n & 1) == 1)
                one_num++;
            else
                zero_num++;

            n = n >> 1; //除以2,即去掉二進位表示法的個位數
        }
        System.out.print("其中共有" + one_num + "個1及");
        System.out.println(zero_num + "個0");
        keyin.close();
    }
}
