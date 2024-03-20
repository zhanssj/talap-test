package com.github.zhanssj.talaptestcore;

import java.util.List;

public class AverageCalculator {

    public static double calculateAverage(List<Integer> nums) {
        int sum = nums.stream().mapToInt(n -> n).sum();
        return (double) sum / nums.size();
    }
}
