package com.company.simple_problems.easy.task14;

public class LongestCommonPrefix {
    // Input: strs = ["flower","flow","flight"]
    //Output: "fl"
    public static String longestCommonPrefix(String [] strs){
        int x = 0;
        String s = "";
        for (int i = 0; i < strs.length-1; i++){
            for (int j = i+1; j < strs.length; j++){
                if (strs[i].charAt(x) == strs[j].charAt(x)){
                    s += strs[i].charAt(x);
                    x++;
                } else {
                    s = "";
                }
            }
        }
        return s;
    }
}
