package com.company.simple_problems.easy.task344;

import java.util.Arrays;

public class ReverseString {
    // 1 solution
    public static void reverseString(char [] s){

//        ["h","e","l","l","o"]
        char [] c = new char[s.length];
        int k = 0;
        for (int i = s.length-1; i >= 0; i--){
            c[k++] = s[i];
        }
        System.out.println(Arrays.toString(c));
    }

    // 2 solution
    public static void reverse(char [] s){
        if (s == null)
            return;
        int l = 0, r = s.length-1;
        while (l < r){
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(s));
    }
}
