package com.psl.training.ass2;

import java.util.ArrayList;

public class Combination {

    public static void main(String[] args) {
        String[] comb = getCombinations("123");
        for(String c:comb){
            System.out.println(c);
        }
    }

    static String[]  getCombinations(String str){
        ArrayList<String> combinations = new ArrayList<String>();
        getPermutn(combinations,str,"");

        String[] comb_arr = new String[combinations.size()];

        for(int i=0;i<combinations.size();i++){
            comb_arr[i] = combinations.get(i);
        }

        return comb_arr;
    }

    static void getPermutn(ArrayList<String> perms,String str, String ans){

        if (str.length() == 0) {
            perms.add(ans);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            getPermutn(perms, ros, ans + ch);
        }
    }
}
