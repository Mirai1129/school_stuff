package ch05;

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner keyin = new Scanner(System.in);
        float height, distance = 0;
        System.out.print("輸入球的起始高度(公尺):");
        height = keyin.nextFloat();
        do {
            distance += height;
            height /= 2;
        } while (height != 0);
        System.out.println("球的經過距離為" + distance + "公尺");
        keyin.close();
    }
}
