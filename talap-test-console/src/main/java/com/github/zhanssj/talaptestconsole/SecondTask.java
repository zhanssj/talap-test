package com.github.zhanssj.talaptestconsole;

import com.github.zhanssj.talaptestcore.PalindromeChecker;

import java.util.Scanner;

public class SecondTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to check for palindrome:");
        try {
            String text = scanner.next();
            boolean isPalindrome = PalindromeChecker.isPalindrome(text);
            System.out.printf("Your text is %s palindrome", isPalindrome ? "a": "not");
        } catch (Exception e) {
            System.err.printf("Unexpected error: %s\n", e.getMessage());
        }
    }
}
