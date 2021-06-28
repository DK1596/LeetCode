package com.company.simple_problems.easy.task414;

public class ThirdMaximumNumber {
    public static int thirdMax(int [] nums){
        Integer fm = null, sm = null, tm = null;
        for (int num : nums){
            if (fm == null || num > fm){
                tm = sm;
                sm = fm;
                fm = num;
            } else if (fm == num){
                continue;
            } else if (sm == null || num > sm){
                tm = sm;
                sm = num;
            } else if (sm == num){
                continue;
            } else if (tm == null || num > tm){
                tm = num;
            }
        }
        if (tm != null){
            return tm;
        } else {
            return fm;
        }
    }
}
