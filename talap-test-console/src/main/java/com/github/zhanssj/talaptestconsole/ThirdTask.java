package com.github.zhanssj.talaptestconsole;

import com.github.zhanssj.talaptestcore.NumberReverser;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number to reverse:");
        try {
            int number = scanner.nextInt();
            int reversedNumber = NumberReverser.reverseNumber(number);
            System.out.printf("Reversed number is %d", reversedNumber);
        } catch (InputMismatchException e) {
            System.out.println("Seems like you entered not a number");
        } catch (Exception e) {
            System.err.printf("Unexpected error: %s\n", e.getMessage());
        }
    }
}
