package com.company.simple_problems.easy.task58;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s){
        int x = 0;
        if (s.isEmpty())
            return 0;
        String [] str = s.split(" ");
        for (int i = 0; i < str.length; i++){
            if (i == str.length-1)
                x = str[i].length();
        }
        return x;
    }
}
