package com.company.simple_problems.easy.task1281;

public class Solution {
    public static int subtractProductAndSum(int n){
        int sum = 0;
        int product = 1;

        while (n > 0){
            int x = n % 10;
            sum += x;
            product *=x;
            n /= 10;
        }
        return product - sum;
    }
}
