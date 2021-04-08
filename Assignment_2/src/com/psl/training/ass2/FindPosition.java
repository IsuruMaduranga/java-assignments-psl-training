package com.psl.training.ass2;

public class FindPosition {
    public static void main(String[] args) {
        int[] nos = {1,2,3,1,1,9};
        System.out.println(findPosition(9,nos));
    }

    static int findPosition(int num,int[] nos){
        for(int i=0; i<=nos.length;i++){
            if(nos[i] == num){
                return i;
            }
        }

        return -1;
    }
}
