package com.psl.training.ass1;

public class CalMax {
    public static void main(String[] args) {
        System.out.println(calMAx(-10,100,0));
    }

    static int calMAx(int x, int y, int z){
        int max_num = x;
        int[] nums = {x,y,z};

        for(int num:nums){
            if(num>max_num){
                max_num = num;
            }
        }

        return max_num;

    }
}
