package com.company.simple_problems.easy.task771;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones){
        int x = 0;
        for (int i = 0; i < jewels.length(); i++){
            for (int j = 0; j < stones.length(); j++){
                if (jewels.charAt(i) == stones.charAt(j)){
                    x++;
                }
            }
        }
        return x;
    }
}
