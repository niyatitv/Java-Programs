package com.programs;

public class SumTheMultiplesOfThreeAndFive{
    public static int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 5 == 0 || i % 3 == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
