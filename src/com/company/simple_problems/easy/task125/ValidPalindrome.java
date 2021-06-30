package com.company.simple_problems.easy.task125;

public class ValidPalindrome {
    // A man, a plan, a canal: Panama
    public static boolean isPalindrome(String s){
        if (s == null || s.length() == 0)
            return true;

        int l = 0, r = s.length()-1;
        s = s.toLowerCase();

        while (l < r){
            if (!Character.isLetterOrDigit(s.charAt(l))){
                l++;
            } else if (!Character.isLetterOrDigit(s.charAt(r))){
                r--;
            } else {
                if (s.charAt(l) != s.charAt(r))
                return false;
                l++; r--;
            }
        }
        return true;
    }
}
