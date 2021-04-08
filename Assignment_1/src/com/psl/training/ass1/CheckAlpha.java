package com.psl.training.ass1;

public class CheckAlpha {

    public static void main(String[] args) {
        System.out.println(checkAlpha('A'));
        System.out.println(checkAlpha('b'));
    }

    static boolean checkAlpha(char alph){
        char[] vowels = {'a','e','i','o','u'};

        for( char vow:vowels){
            if(Character.toLowerCase(alph) == vow) {
                return true;
            }
        }

        return false;
    }
}
