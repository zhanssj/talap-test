package com.github.zhanssj.talaptestcore;

public class PalindromeChecker {

    public static boolean isPalindrome(String text) {
        int l = 0, r = text.length() - 1;
        while (l <= r) {
            if (!Character.isLetterOrDigit(text.charAt(l))) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(text.charAt(r))) {
                r--;
                continue;
            }
            if (text.charAt(l++) != text.charAt(r--))
                return false;
        }
        return true;
    }
}
