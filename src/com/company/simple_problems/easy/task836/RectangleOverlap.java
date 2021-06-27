package com.company.simple_problems.easy.task836;

public class RectangleOverlap {
    //rec1 = [0,0,2,2], rec2 = [1,1,3,3]
    public static boolean isRectangleOverlap(int [] rec1, int [] rec2){
        if (rec1[0] == rec1[2] || rec1[1] == rec1[3]
        || rec2[0] == rec2[2] || rec2[1] == rec2[3]){
            return false;
        }
        return !(rec1[2] <= rec2[0] ||
                rec1[3] <= rec2[1] ||
                rec1[0] >= rec2[2] ||
                rec1[1] >= rec2[3]);
    }
}
