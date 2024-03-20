package com.github.zhanssj.talaptestcore;

public class NumberReverser {

    // not checked for integer overflowing
    public static int reverseNumber(int num) {
        int n = Math.abs(num);
        int res = 0;
        while (n > 0) {
            int r = n % 10;
            res = res * 10 + r;
            n = n / 10;
        }
        return num < 0 ? -res : res;
    }

    // recursive version
    public static int reverse(int num) {
        int n = Math.abs(num);
        int reversed = reverse(n, 0);
        return num < 0 ? -reversed : reversed;
    }

    public static int reverse(int num, int reversed) {
        if (num == 0)
            return reversed;
        int r = num % 10;
        reversed = reversed * 10 + r;
        num = num / 10;
        return reverse(num, reversed);
    }
}
