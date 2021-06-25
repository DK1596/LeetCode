package com.company.simple_problems.easy.task412;

import java.util.*;

public class FizzBuzz {
    // ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
    // 1 solution
    public static List<String> fizzBuzz(int n){
        Map<Integer, String> mapFB = new HashMap<>(){
            {
                put(3, "Fizz");
                put(5, "Buzz");
            }
        };
        List<String> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            String ansArr = "";
            for (Integer k : mapFB.keySet()){
                if (i % k == 0) {
                    ansArr += mapFB.get(k);
                }
            }
            if (ansArr.equals("")){
                ansArr += Integer.toString(i);
            }
            ans.add(ansArr);
        }
        return ans;
    }

    // 2 solution
    public static List<String> fizzBuzzTwo(int n){
        List<String> ans = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            String ansArr = "";
            if (i % 3 == 0 && i % 5 == 0){
                ansArr += "FizzBuzz";
            } else if (i % 5 == 0){
                ansArr += "Buzz";
            } else if (i % 3 == 0){
                ansArr += "Fizz";
            } else {
                ansArr += Integer.toString(i);
            }
            ans.add(ansArr);
        }
        return ans;
    }
}
