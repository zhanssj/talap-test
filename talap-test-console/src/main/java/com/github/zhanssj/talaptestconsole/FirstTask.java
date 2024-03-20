package com.github.zhanssj.talaptestconsole;

import com.github.zhanssj.talaptestcore.AverageCalculator;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class FirstTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter amount of numbers:");
        int amount = 0;
        try {
            amount = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Seems like you entered not a number");
        } catch (Exception e) {
            System.err.printf("Unexpected error: %s\n", e.getMessage());
        }

        System.out.println("Now enter each number in separate line");
        try {
            List<Integer> nums = new ArrayList<>();
            for (int i = 0; i < amount; i++) {
                int num = scanner.nextInt();
                nums.add(num);
            }
            System.out.printf("Average is %,.2f\n", AverageCalculator.calculateAverage(nums));
        } catch (InputMismatchException e) {
            System.out.println("Seems like you entered not a number");
        } catch (Exception e) {
            System.err.printf("Unexpected error: %s\n", e.getMessage());
        }
    }
}
