package ch02;

public class Ex1 {
    public static void main(String[] args) {
        byte bvar = (byte) 128;
        short svar = (short) 32768;
        int ivar = 2147483647 + 1;
        long lvar = 9223372036854775807L + 1;
        float fvar = 3E38F * 2;
        double dvar = 1E308 * 2;
        System.out.println(bvar);
        System.out.println(svar);
        System.out.println(ivar);
        System.out.println(lvar);
        System.out.println(fvar);
        System.out.println(dvar);
    }
}
